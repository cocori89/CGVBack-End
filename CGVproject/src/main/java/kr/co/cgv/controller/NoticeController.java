package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.NoticeVO;
import kr.co.cgv.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
	/*관리자-------------------------------*/
	
	//관리자 공지사항 종류별 검색 정렬 
	@RequestMapping(value = "admin/adNotice" ,method = RequestMethod.POST)
	public String noticeSelectKind(@RequestParam("kind")String kind, Model model){
		
			List<NoticeVO> noticeVO = noticeService.noticeSelectKind(kind);
			model.addAttribute("noticeVO", noticeVO);
		return "admin/adNotice";
	}
	//관리자 공지사항 제목으로 검색 후 정렬
	@RequestMapping(value = "admin/adNoticeTitle" ,method = RequestMethod.POST)
	public String noticeSelectTitle(@RequestParam("title")String title, Model model){
		List<NoticeVO> noticeVO = noticeService.noticeSelectTitle(title);
		model.addAttribute("noticeVO", noticeVO);
		return "admin/adNotice";
	}
	// 관리자 공지사항 등록
	@RequestMapping(value = "admin/adNoticeInsert" ,method = RequestMethod.POST)
	public String noticeInsert(HttpServletRequest request, Model model){
		int r = noticeService.noticeInsert(request);
		if(r==0){//실패 시
			return "admin/adNoticeInsert";
		}else {
			return "redirect:adNotice";
		}
	}
	
	// 관리자 공지사항 수정
	@RequestMapping(value = "admin/adNoticeUpdate", method = RequestMethod.POST)
	public String adNoticeUpdate(HttpServletRequest request, Model model){
		int r = noticeService.noticeUpdate(request);
		if(r==0){//실패 시
			return "admin/adNoticeUpdate";
		}else {
			return "redirect:adNotice";
		}
	}
	
	// 관리자 공지사항 삭제 
	@RequestMapping(value = "admin/adNoticeDelete", method = RequestMethod.GET)
	public String adNoticeDelete(@RequestParam("notice_code")int notice_code, Model model){
		int r = noticeService.noticeDelete(notice_code);
		if(r==0){//실패 시
			return "admin/adNotice";
		}else {
			return "redirect:adNotice";
		}
	}
}
