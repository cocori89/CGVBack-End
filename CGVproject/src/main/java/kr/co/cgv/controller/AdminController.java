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
import kr.co.cgv.domain.NoticeVO;
import kr.co.cgv.service.MemberService;
import kr.co.cgv.service.NoticeService;

//이곳을 단순 페이지 이동만 최대한 만든다. 

@Controller
public class AdminController {

	
	@Autowired
	MemberService memberService;
	
	@Autowired
	NoticeService noticeService;
	
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
	
	
	//관리자 공지사항 관리 페이지로 이동
	@RequestMapping(value = "admin/adNotice", method = RequestMethod.GET)
	public String adNotice(Model model){
		List<NoticeVO> noticeVO = noticeService.noticeSelectAll();
		model.addAttribute("noticeVO", noticeVO);
		return "admin/adNotice";
	}

	//관리자 공지 사항 등록 페이지이동 
	@RequestMapping(value = "admin/adNoticeInsert", method = RequestMethod.GET)
	public String adNoticeInsert(Model model){
		return "admin/adNoticeInsert";
	}
	
	//관리자 공지사항 수정 페이지 이동
	@RequestMapping(value = "admin/adNoticeUpdate", method = RequestMethod.GET)
	public String adNoticeUpdate(@RequestParam("notice_code")int notice_code, Model model){
		NoticeVO noticeVO = noticeService.noticeSelectContent(notice_code);
		model.addAttribute("notice", noticeVO);
		return "admin/adNoticeUpdate";
	}
	
	
	
}
