package kr.co.cgv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.cgv.domain.EventVO;
import kr.co.cgv.service.EventService;

//이벤트 컨트롤 러
@Controller
public class EventController {
	
	@Autowired
	EventService eventService;
	
	/*클라이언트---------------------*/
	/*관리자-----------------------*/
	//관리자가 이벤트 정보 입력 수행
	@RequestMapping(value = "admin/adEventInsert", method = RequestMethod.POST)
	public String eventInsert(MultipartHttpServletRequest request){
		int	r = eventService.eventInsert(request);
		if(r==0){// 실패시
			return "admin/adEventInsert";
		}
		return "redirect:adEvent";
	}
	// 관리자가 이벤트 이름으로 정보 입력 수행
	@RequestMapping(value = "admin/adEvent", method = RequestMethod.POST)
	public String eventSelectTitle(@RequestParam("title")String title, Model model){
		List<EventVO> eventVO = eventService.eventSeletTitle(title);
		model.addAttribute("eventVO",eventVO);
		return "admin/adEvent";
	}
	// 관리자가 이벤트 정보 수정 수행
	@RequestMapping(value = "admin/adEventUpdate", method = RequestMethod.POST)
	public String eventUpdate(MultipartHttpServletRequest request){
		int	r = eventService.eventUpdate(request);
		if(r==0){// 실패시
			return "admin/adEventUpdate";
		}
		return "redirect:adEvent";
	}
	// 관리자가 이벤트 정보 삭제 
	@RequestMapping(value = "admin/adEventDelete", method = RequestMethod.GET)
	public String eventDelete(@RequestParam("event_code")int event_code){
		int	r = eventService.eventDelete(event_code);
		if(r==0){// 실패시
			return "admin/adEventDelete";
		}
		return "redirect:adEvent";
	}
}
