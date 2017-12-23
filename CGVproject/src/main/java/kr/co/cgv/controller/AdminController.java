package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.service.MemberService;

@Controller
public class AdminController {

	@Autowired
	MemberService memberService;
	
	//임시로 index
	@RequestMapping(value = "admin/adIndex", method =RequestMethod.GET )
	public String adIndex(Model model , HttpSession sesstion){
		String admin = "admin";
		sesstion.setAttribute("admin", admin);
		return "admin/adIndex";
	}
	
	//관리자 회원 정보 관리
	@RequestMapping(value = "admin/adMember", method =RequestMethod.GET )
	public String adMember(Model model){
		List<MemberVO> memberVO = memberService.memberSelectAll();
		model.addAttribute("memberVO", memberVO);
		return "admin/adMember";
	}
	
	//관리자 회원 정보 수정 페이지 이동
	@RequestMapping(value = "admin/adMemberModify", method =RequestMethod.GET )
	public String adMemberModify(@RequestParam("id")String id,Model model){
		MemberVO memberVO = memberService.memberSelect(id);
		model.addAttribute("member", memberVO);
		return "admin/adMemberModify";
	}
	
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
	
}
