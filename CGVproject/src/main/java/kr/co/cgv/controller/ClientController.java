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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.cgv.domain.EventVO;
import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.NoticeVO;
import kr.co.cgv.service.EventService;
import kr.co.cgv.service.MemberService;
import kr.co.cgv.service.MovieService;
import kr.co.cgv.service.NoticeService;

// 클라이언트 페이지이동만 있으며 최소한의 기능만 있음 

@Controller
public class ClientController {

	@Autowired
	private MemberService memberService;
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private MovieService movieService;
	@Autowired
	private EventService eventService;
	
	// index페이지 이동
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model,HttpSession session) {
		List<NoticeVO> noticeVO= noticeService.noticeSelectIndex();
		model.addAttribute("noticeVO", noticeVO);
		session.removeAttribute("admin");
		return "index";
	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String indexHome(Model model, HttpSession session) {
		List<NoticeVO> noticeVO = noticeService.noticeSelectIndex();
		model.addAttribute("noticeVO", noticeVO);
		session.removeAttribute("admin");
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

	// mypage(마이페이지) 페이지로 이동
	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String mypage() {
		return "mypage";
	}
	
	//공지사항 페이지 이동 
	@RequestMapping(value = "noticeList", method = RequestMethod.GET)
	public String noticeList(Model model) {
		List<NoticeVO> noticeVO = noticeService.noticeSelectList(0);
		int noticeCount = noticeService.noticeCount();
		model.addAttribute("noticeVO", noticeVO);
		model.addAttribute("noticeCount", noticeCount);
		
		// 페이징 처리 
		int pageBlock = noticeService.noticePageNum();
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("start", 0);// 첫시작이기 때문에 
		
		return "noticeList";
	}
	
	//공지사항 페이지 번호 클릭시 작동 이동 
	@RequestMapping(value = "noticeListPage", method = RequestMethod.GET)
	public String noticeListPageint(@RequestParam("listNum")int listNum, @RequestParam("pageStartNum")int pageStartNum, Model model) {
		List<NoticeVO> noticeVO = noticeService.noticeSelectList(listNum*10-10);
		int noticeCount = noticeService.noticeCount();
		model.addAttribute("noticeVO", noticeVO);
		model.addAttribute("noticeCount", noticeCount);
		
		// 페이징 처리 
		int pageBlock = noticeService.noticePageNum();
		model.addAttribute("pageBlock", pageBlock);
		model.addAttribute("start", pageStartNum);// 첫시작이기 때문에 
		
		return "noticeList";
	}

	// 공지 사항 상세보기 페이지 이동 
	@RequestMapping(value = "noticeContent", method = RequestMethod.GET)
	public String noticeContent(@RequestParam("notice_code")int notice_code, Model model) {
		NoticeVO noticeVO = noticeService.noticeSelectContent(notice_code);
		noticeService.noticeUpdateHit(notice_code);
		model.addAttribute("notice", noticeVO);
		return "noticeContent";
	}
	
	//영화 정보 페이지 이동 
	@RequestMapping(value = "movie", method = RequestMethod.GET)
	public String movie(Model model) {
		List<MovieVO> movieVO = movieService.movieSelectTop6();
		
		for(int i = 0; i<6; i++){
			model.addAttribute("movie"+(i+1),movieVO.get(i));
		}
		return "movie";
	}
	//영화 정보 상세 페이지 이동
	@RequestMapping(value = "movieContent", method = RequestMethod.GET)
	public String movieContent(@RequestParam("movie_code")int movie_code, Model model) {
		MovieVO movieVO = movieService.movieSelectCode(movie_code);
		model.addAttribute("movie", movieVO);
		return "movieContent";
	}
	
	//이벤트 정보 페이지 이동
	@RequestMapping(value = "event", method = RequestMethod.GET)
	public String event(Model model) {
		List<EventVO> eventVONormal = eventService.eventSelectNormal();
		List<EventVO> eventVOSpecail = eventService.eventSelectSpecail();
		for(int i = 0; i<3 ; i++){
			model.addAttribute("specailEvent"+(i+1), eventVOSpecail.get(i));
		}
		for(int i = 0 ; i < 9 ; i++){
			model.addAttribute("normalEvent"+(i+1), eventVONormal.get(i));
		}
		return "event";
	}
	//이벤트 상세 정보 페이지 이동
	@RequestMapping(value = "eventContent", method = RequestMethod.GET)
	public String eventContent(@RequestParam("event_code")int event_code, Model model) {
		EventVO eventVO = eventService.eventSelectCode(event_code);
		model.addAttribute("event", eventVO);
		return "eventContent";
	}
}
