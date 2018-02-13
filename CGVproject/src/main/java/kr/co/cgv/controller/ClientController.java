package kr.co.cgv.controller;

import java.util.ArrayList;
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
import kr.co.cgv.domain.ListtableVO;
import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.NoticeVO;
import kr.co.cgv.domain.ReservationVO;
import kr.co.cgv.domain.SeatVO;
import kr.co.cgv.domain.SiteVO;
import kr.co.cgv.service.EventService;
import kr.co.cgv.service.MemberService;
import kr.co.cgv.service.MovieService;
import kr.co.cgv.service.NoticeService;
import kr.co.cgv.service.PricelistService;
import kr.co.cgv.service.ReservationService;
import kr.co.cgv.service.SiteService;
import kr.co.cgv.service.TheaterService;

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
	@Autowired
	private SiteService siteService;
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private TheaterService theaterService;
	@Autowired
	private PricelistService pricelistService;
	
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
		int rating;
		try {
			rating = Integer.parseInt(memberVO.getMember_rating());
		} catch (Exception e) {
			attr.addFlashAttribute("msg", "아이디나 패스워드를 다시 입력 하세요");
			return "redirect:login";
		}
		
		
		if(memberVO == null){
			attr.addFlashAttribute("msg", "아이디나 패스워드를 다시 입력 하세요");
			return "redirect:login";
		}else {// 관리자,일반 회원 또는 탈퇴 회원들
			
			if(rating == 9 ) {
				attr.addFlashAttribute("msg", "탈퇴한 아이디 입니다.");
			return "redirect:login";
			}
			session.setAttribute("rating", rating);
			session.setAttribute("member_id", memberVO.getMember_id());
			session.setAttribute("member_name", memberVO.getMember_name());
			return "index";
		}
	}
	
	// 로그 아웃 
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String memberLogout(HttpSession session) {
			session.invalidate();
			return "index";
	}

	// 회원가입 페이지 이동
	@RequestMapping(value = "memberInsert", method = RequestMethod.GET)
	public String memberInsert() {
		return "memberInsert";
	}

	// mypage(마이페이지) 페이지로 이동
	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String mypage(Model model, HttpSession session) {
		String name = (String) session.getAttribute("member_name");
		model.addAttribute("name", name);
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
	
	//영화관 사이트 및 상영관 정보 보기 
	@RequestMapping(value = "theater", method = RequestMethod.GET)
	public String theater(Model model) {
		// 기본적으로 페이지를 눌렀을떄 뜨는 화면
		List<SiteVO> seoulVO = siteService.siteSelectCodeSearch("1");//서울 
		model.addAttribute("seoulVO", seoulVO);
		return "theater";
	}
	
	//티켓 예약 페이지 이동
	@RequestMapping(value = "ticket", method = RequestMethod.GET)
	public String ticket(Model model) {
		//영화 정보 불러 오기 
		List<MovieVO> movieVO = reservationService.movieSelectNow();
		model.addAttribute("movieVO", movieVO);
		// 극장 별로 불러 오기
		// 날짤 불러 오기
		return "ticket";
	}
	//에약 좌석 선택 페이지 이동 
	@RequestMapping(value = "cseat", method = RequestMethod.GET)
	public String cseat(HttpServletRequest request, Model model) {
		String site_code = request.getParameter("relsite");	
		String theater_code= site_code.substring(0,site_code.length()-1); 
		String theater = request.getParameter("reltheater");
		theater = theater.substring(0, theater.length()-1);
		theater_code = theater_code+theater;
		
		List<String> seat_row = theaterService.theaterSelectSeatRow(theater_code);//줄가져오기
		List<ListtableVO> cseat = new ArrayList<ListtableVO>();// 출력 형식 
		for(String row : seat_row){
			ListtableVO listtableVO = new ListtableVO();
			List<String> seat_column = theaterService.theaterSelectSeatColumn(theater_code, row);//칸 가져오기
			listtableVO.setRow(row);
			listtableVO.setColumn(seat_column);
			cseat.add(listtableVO);
		}
		model.addAttribute("cseat",cseat);
		
		model.addAttribute("reltitle", request.getParameter("reltitle"));//영화 제목
		model.addAttribute("reltheater", request.getParameter("reltheater"));//00관 형태로 넘어옴 수정 해야함
		model.addAttribute("relsite",request.getParameter("relsite"));// 영화 사이트 코드
		model.addAttribute("rely",request.getParameter("rely"));// 년
		model.addAttribute("relm",request.getParameter("relm"));// 월
		model.addAttribute("relmonth",request.getParameter("relmonth"));// 일
		model.addAttribute("reltime",request.getParameter("reltime"));// 예약 시간 
		
		return "cseat";
	}
	//결제 화면  페이지 이동
	@RequestMapping(value = "payment", method = RequestMethod.GET)
	public String payment(HttpServletRequest request, Model model) {
		
		String relmonth = request.getParameter("relmonth");
		String day = relmonth.substring(0,1);
		String rely = request.getParameter("rely");
		String relm = request.getParameter("relm");
		String reld=relmonth.substring(1,3);
		String date = rely+"-"+relm+"-"+reld;
		String adult = request.getParameter("adult");
		String teenager =request.getParameter("teenager");
		String title = request.getParameter("reltitle");
		
		model.addAttribute("reltitle",title);//제목
		model.addAttribute("relsite",request.getParameter("relsite"));// 사이트 
		model.addAttribute("relstart",request.getParameter("reltime"));// 시간
		model.addAttribute("reltheater",request.getParameter("reltheater"));// 상영관
		model.addAttribute("rely",request.getParameter("rely"));// 년
		model.addAttribute("relm",request.getParameter("relm"));// 월
		model.addAttribute("reld",reld);// 일
		model.addAttribute("date", date);//날짜 풀내용
		model.addAttribute("day",day);// 요일
		model.addAttribute("relseat",request.getParameter("relseat"));// 좌석
		model.addAttribute("adult",adult);// 어른
		model.addAttribute("teenager",teenager);// 청소년 
		model.addAttribute("seat",request.getParameterValues("seat"));// 좌석
		
		List<MovieVO> movieVO = movieService.movieSelectTitle(title);
		model.addAttribute("poster", movieVO.get(0).getMovie_poster());
		//시작 시간과 영화 제목으로 끝나는 시간도 구해서 줘야함
		String end = reservationService.timetableSelectGetEnd(request.getParameter("relsite"), request.getParameter("reltheater"), date, request.getParameter("reltime"));
		model.addAttribute("end",end);// 끝나는 시간
		System.out.println(end);
		// 총결제 금액 출력해줘야함
		String price = pricelistService.priceListSelectGetPrice(request.getParameter("reltime"), day, adult, teenager);
		model.addAttribute("price",price);//총가격
		return "payment";
	}
	
	//결제 완료 페이지 이동
	@RequestMapping(value = "paycon", method = RequestMethod.GET)
	public String paycon(HttpServletRequest request, Model model, HttpSession session) {
			return "paycon";
	}
	//결제 완료 페이지 이동
	@RequestMapping(value = "paycon", method = RequestMethod.POST)
	public String payconpost(HttpServletRequest request, Model model, HttpSession session) {
		int r = reservationService.reservationInsert(request, session);
		if(r ==0 ){// 실패시
			return "payment";
		}else{
			return "redirect:paycon";
		}
		
	}
		
	//예약 정보 페이지 이동
	@RequestMapping(value = "reservation", method = RequestMethod.GET)
	public String reservation(HttpSession session, Model model){
		List<ReservationVO> reservationVO = reservationService.reservationSelectId(session);
		model.addAttribute("reservationVO", reservationVO);
		return "reservation";
	}
		
}
