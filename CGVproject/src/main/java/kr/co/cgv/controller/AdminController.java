package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.EventVO;
import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.NoticeVO;
import kr.co.cgv.service.EventService;
import kr.co.cgv.service.MemberService;
import kr.co.cgv.service.MovieService;
import kr.co.cgv.service.NoticeService;

//이곳을 단순 페이지 이동만 최대한 만든다. 

@Controller
public class AdminController {

	
	@Autowired
	MemberService memberService;
	
	@Autowired
	NoticeService noticeService;
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	EventService eventService;
	
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
	
	//관리자 영화 정보 관리 페이지 이동
	@RequestMapping(value = "admin/adMovie", method = RequestMethod.GET)
	public String adMovie(Model model){
		List<MovieVO> movieVO = movieService.movieSelectAll();
		model.addAttribute("movieVO", movieVO);
		return "admin/adMovie";
	}
	
	//관리자 영화 정보 등록 페이지 이동
	@RequestMapping(value = "admin/adMovieInsert", method = RequestMethod.GET)
	public String adMovieInsert(Model model){
		return "admin/adMovieInsert";
	}
	//관리자 영화 정보 수정 페이지 이동
	@RequestMapping(value = "admin/adMovieUpdate", method = RequestMethod.GET)
	public String adMovieUpdate(@RequestParam("movie_code")int movie_code, Model model){
		MovieVO movieVO = movieService.movieSelectCode(movie_code);
		model.addAttribute("movie", movieVO);
		return "admin/adMovieUpdate";
	}
	
	//관리자 이벤트 정보 관리 페이지 이동
	@RequestMapping(value = "admin/adEvent", method = RequestMethod.GET)
	public String adEvent(Model model){
		List<EventVO> eventVO = eventService.eventSelectAll();
		model.addAttribute("eventVO", eventVO);
		return "admin/adEvent";
	}
	//관리자 이벤트 정보 입력 페이지 이동
	@RequestMapping(value = "admin/adEventInsert", method = RequestMethod.GET)
	public String adEventInsert(){
		return "admin/adEventInsert";
	}
	//관리자 이벤트 정보 수정 페이지 이동
	@RequestMapping(value = "admin/adEventUpdate", method = RequestMethod.GET)
	public String adEventUpdate(@RequestParam("event_code")int event_code,Model model){
		EventVO eventVO = eventService.eventSelectCode(event_code);
		System.out.println(eventVO.toString());
		model.addAttribute("event", eventVO);
		return "admin/adEventUpdate";
	}
}

