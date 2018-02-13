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

import kr.co.cgv.domain.CouponVO;
import kr.co.cgv.domain.EventVO;
import kr.co.cgv.domain.ListtableVO;
import kr.co.cgv.domain.MemberVO;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.NoticeVO;
import kr.co.cgv.domain.PricelistVO;
import kr.co.cgv.domain.SiteVO;
import kr.co.cgv.domain.TheaterVO;
import kr.co.cgv.domain.TimetableTableVO;
import kr.co.cgv.domain.TimetableVO;
import kr.co.cgv.service.CouponService;
import kr.co.cgv.service.EventService;
import kr.co.cgv.service.MemberService;
import kr.co.cgv.service.MovieService;
import kr.co.cgv.service.NoticeService;
import kr.co.cgv.service.PricelistService;
import kr.co.cgv.service.SiteService;
import kr.co.cgv.service.TheaterService;
import kr.co.cgv.service.TimetableService;

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
	@Autowired
	SiteService siteService;
	@Autowired
	TheaterService theaterService;
	@Autowired
	PricelistService pricelistService;
	@Autowired
	TimetableService timetableService;
	@Autowired
	CouponService couponService;
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
	//관리자 사이트(지점) 정보 관리 페이지 이동
	@RequestMapping(value = "admin/adSite", method = RequestMethod.GET)
	public String adStie(Model model){
		List<SiteVO> siteVO = siteService.siteSelectAll();
		model.addAttribute("siteVO", siteVO);
		return "admin/adSite";
	}
	//관리자 사이트(지점) 정보 관리  등록 페이지 이동
	@RequestMapping(value = "admin/adSiteInsert", method = RequestMethod.GET)
	public String adStieInsert(){
		return "admin/adSiteInsert";
	}
	//관리자 사이트(지점) 정보 관리  수정 페이지 이동
	@RequestMapping(value = "admin/adSiteUpdate", method = RequestMethod.GET)
	public String adStieUpdate(@RequestParam("site_code")String site_code, Model model){
		SiteVO siteVO = siteService.siteSelectCode(site_code);
		model.addAttribute("site", siteVO);
		return "admin/adSiteUpdate";
	} 
	//관리자 상영관 정보 관리 페이지
	@RequestMapping(value = "admin/adTheater", method = RequestMethod.GET)
	public String adTheater(Model model){
		List<TheaterVO> theaterVO = theaterService.theaterSelectAll();
		List<SiteVO> siteVO = siteService.siteSelectAll();
		model.addAttribute("theaterVO", theaterVO);
		model.addAttribute("siteVO", siteVO);
		return "admin/adTheater";
	}
	//관리자 상영관 정보 입력 페이지
	@RequestMapping(value = "admin/adTheaterInsert", method = RequestMethod.GET)
	public String adTheaterInsert(Model model){
		List<SiteVO> siteVO = siteService.siteSelectAll();
		model.addAttribute("siteVO", siteVO);
		return "admin/adTheaterInsert";
	}
	//관리자 상영관 정보 수정 페이지
	@RequestMapping(value = "admin/adTheaterUpdate", method = RequestMethod.GET)
	public String adTheaterUpdate(@RequestParam("theater_code")String theater_code,Model model){
		TheaterVO theaterVO = theaterService.theaterSelectCode(theater_code);
		List<SiteVO> siteVO = siteService.siteSelectAll();
		model.addAttribute("theater", theaterVO);
		model.addAttribute("siteVO", siteVO);
		return "admin/adTheaterUpdate";
	}
	
	//관리자 상영관 좌석 정보 가져 오기 (도저히 어떻게 할수가 없음)
	@RequestMapping(value = "admin/adSeat", method = RequestMethod.GET)
	public String adSeat(@RequestParam("theater_code")String theater_code,Model model){
		List<String> seat_row = theaterService.theaterSelectSeatRow(theater_code);//줄가져오기
		List<ListtableVO> test = new ArrayList<ListtableVO>();// 출력 형식 
		for(String row : seat_row){
			ListtableVO listtableVO = new ListtableVO();
			List<String> seat_column = theaterService.theaterSelectSeatColumn(theater_code, row);//칸 가져오기
			listtableVO.setRow(row);
			listtableVO.setColumn(seat_column);
			test.add(listtableVO);
		}
		model.addAttribute("test",test);
		return "admin/adSeat";
	}
	//관리자 가격표 정보 관리 페이지 이동
	@RequestMapping(value = "admin/adPricelist", method = RequestMethod.GET)
	public String adPricelist(Model model){
		List<PricelistVO> pricelistVO = pricelistService.pricelistSelectAll();
		model.addAttribute("pricelistVO", pricelistVO);
		return "admin/adPricelist";
	}
	//관리자 가격표 등록 페이지 이동
	@RequestMapping(value = "admin/adPricelistInsert", method = RequestMethod.GET)
	public String adPricelistInsert(){
		return "admin/adPricelistInsert";
	}
	
	//관리자 시간표 관리 페이지 이동 (사이트별)
	@RequestMapping(value = "admin/adTimetable", method = RequestMethod.GET)
	public String adTimetable(Model model){
		List<SiteVO> siteVO = siteService.siteSelectAll();
		model.addAttribute("siteVO", siteVO);
		return "admin/adTimetable";
	}
	//관리자 시간표 관리페이지 이동 (상영관별)
	@RequestMapping(value = "admin/adTimetableSite", method = RequestMethod.GET)
	public String adTimetableSite(@RequestParam("site")String site_code,@RequestParam("date")String date, Model model){
		List<TimetableTableVO> tttVO = new ArrayList<TimetableTableVO>();// 출력 형태
		List<TheaterVO> theaterVO = theaterService.theaterSelectSite(site_code);//상영관 정보 불러오기 
			for(TheaterVO theater : theaterVO){
				TimetableTableVO timetableTableVO = new TimetableTableVO();
				List<TimetableVO> timetableVO = new ArrayList<TimetableVO>();
				timetableVO = timetableService.timetableSelectDateTheater(date,theater.getTheater_code());// 날짜와 상영관에 대한 상영시간 정보 불러 오기 
				timetableTableVO.setTheaterVO(theater);// 영화 정보 넣기
				timetableTableVO.setTimetableVO(timetableVO);// 상영시간 정보 정보 넣기 
				tttVO.add(timetableTableVO);//테이블형식 넣기
			}
		model.addAttribute("tttVO", tttVO);//있다가 지워야 할듯
		model.addAttribute("site", site_code);
		model.addAttribute("date", date);
		return "admin/adTimetableSite";
	}
	//관리자 시간표 등록페이지 이동
	@RequestMapping(value = "admin/adTimetableInsert", method = RequestMethod.GET)
	public String adTimetableInsert(@RequestParam("site")String site_code,@RequestParam("date")String date,
			@RequestParam("theater_code")String theater_code,@RequestParam("theater_num")String theater_num,
			Model model){
		List<MovieVO> movieVO = movieService.movieSelectAll();
		model.addAttribute("site", site_code);
		model.addAttribute("date", date);
		model.addAttribute("theater_code", theater_code);
		model.addAttribute("theater_num", theater_num);
		model.addAttribute("movieVO", movieVO);
		return "admin/adTimetableInsert";
	}
	//관리자 쿠폰 페이지 이동
	@RequestMapping(value = "admin/adCoupon", method = RequestMethod.GET)
	public String adCoupon(Model model){
		List<CouponVO> couponVO = couponService.couponGetAllList();
		model.addAttribute("couponVO", couponVO);
		return "admin/adCoupon";
	}
	//관리자 쿠폰 등록 페이지 이동
	@RequestMapping(value = "admin/adCouponInsert", method = RequestMethod.GET)
	public String adCouponInsert(Model model){
		return "admin/adCouponInsert";
	}
	
}

