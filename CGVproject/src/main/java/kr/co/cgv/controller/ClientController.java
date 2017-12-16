package kr.co.cgv.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.service.MemberService;

@Controller
public class ClientController {

	@Autowired
	private MemberService memberService;

	// index페이지 이동
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "index";
	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexHome() {

		return "index";
	}

	// 로그인 페이지 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	// 회원 로그인
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String memberLogin(HttpServletRequest request, RedirectAttributes attr, HttpSession session) {
		MemberVO memberVO = memberService.memberLogin(request);
		if (memberVO == null) {
			attr.addFlashAttribute("msg", "아이디나 패스워드를 다시 입력 하세요");
			return "redirect:login";
		} else {
			int rating = Integer.parseInt(memberVO.getMember_rating());
			if(rating == 9 ) {
				attr.addFlashAttribute("msg", "탈퇴한 아이디 입니다.");
			return "redirect:login";
			}
			session.setAttribute("member_id", memberVO.getMember_id());
			session.setAttribute("member_name", memberVO.getMember_name());
			return "index";
		}
	}

	// 회원가입 페이지 이동
	@RequestMapping(value = "memberInsert", method = RequestMethod.GET)
	public String memberInsert() {
		return "memberInsert";
	}

	// 회원정보 가입
	@RequestMapping(value = "memberInsert", method = RequestMethod.POST)
	public String memberInsert(HttpServletRequest request) {
		int r = memberService.memberInset(request);

		if (r == 0) {// 실패시
			return "memberInsert";
		} else {// 성공시
			return "login";
		}
	}

	// 회원 정보 수정 페이지 이동
	@RequestMapping(value = "memberUpdate", method = RequestMethod.GET)
	public String memberUpdateLink(Model model, HttpSession session) {
		String member_id = String.valueOf(session.getAttribute("member_id"));
		MemberVO memberVO = memberService.memberSelect(member_id);
		model.addAttribute("memberVO", memberVO);
		return "memberUpdate";
	}

	// 회원 정보 수정
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public String memberUpdate(HttpServletRequest request) {
		int r = memberService.memberUpdate(request);

		if (r == 0) {// 실패시
			return "memberUpdate";
		} else {// 성공시
			return "mypage";
		}

	}
	
	// 회원 정보 탈퇴
	@RequestMapping(value ="memberDelete", method = RequestMethod.GET)
	public String memberDelete(HttpSession session){
		String member_id = String.valueOf(session.getAttribute("member_id"));
		int r = memberService.memberDelete(member_id);	
		if(r==0){//실패시
			return "mypgae";
		}else{
			session.invalidate();//탈퇴시 세션도 제거 
			return "index";
		}
	}
	
	
	// mypage(마이페이지) 페이지로 이동
	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String mypage() {
		return "mypage";
	}
	

}
