package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	/*클라이언트 부분----------------------------------*/
	
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
	
	/*관리자 부분---------------------------------------------------------------*/
	
	//관리자 회원 정보 수정 수행
		@RequestMapping(value = "admin/adMemberModify", method =RequestMethod.POST)
		public String adMemberModifyUpdate(Model model, HttpServletRequest request){
			int r = memberService.memberUpdateAdmin(request);
			if(r==0){//실패시
				return "admin/adMemberModify";
			}else{
				return "redirect:adMember";
			}
		}
		
		//관리자가 회원 정보 삭제 
		@RequestMapping(value ="admin/adMemberDelete", method = RequestMethod.GET)
		public String memberDelete(@RequestParam("id")String id){
			String member_id = String.valueOf(id);
			int r = memberService.memberDelete(member_id);	
			if(r==0){//실패시
				return "adMember";
			}else{
				return "redirect:adMember";
			}
		}
		
		//관리자가 회원 정보 검색
		@RequestMapping(value ="admin/adMember", method = RequestMethod.POST)
		public String memberDeleteName(@RequestParam("name")String name, Model model){
			List<MemberVO> memberVO = memberService.memberSelectName(name);
			model.addAttribute("memberVO", memberVO);
			return "admin/adMember";
		}
		
}
