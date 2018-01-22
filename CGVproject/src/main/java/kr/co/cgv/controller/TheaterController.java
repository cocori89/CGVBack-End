package kr.co.cgv.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.SiteVO;
import kr.co.cgv.domain.TheaterVO;
import kr.co.cgv.domain.TimetableTableClientVO;
import kr.co.cgv.service.SiteService;
import kr.co.cgv.service.TheaterService;
import kr.co.cgv.service.TimetableService;
// 상영관 정보 컨트롤러
@Controller
public class TheaterController {
	@Autowired
	TheaterService theaterService;
	@Autowired
	SiteService siteService;
	@Autowired
	TimetableService timetableService;
	
	/*클라이언트*/
	//사이트 클릭시 해당 상영관 사이트 정보 및 상영관
		@RequestMapping(value = "theaterSite", method = RequestMethod.GET)
		public String theaterSite(@RequestParam("site_code")String site_code, Model model) {
			//-------------- 기본적으로 상단 메뉴
			List<SiteVO> seoulVO = siteService.siteSelectCodeSearch("1");//서울 
			model.addAttribute("seoulVO", seoulVO);
			
			// 사이트 정보들 검색
			SiteVO siteVO = siteService.siteSelectCode(site_code);
			model.addAttribute("site", siteVO);
			
			//상영관별 날짜 불러오기 
			List<Map<String,String>> screeningDate = timetableService.timetableSelectDate(site_code);
			model.addAttribute("screeningDate", screeningDate);
			
			model.addAttribute("site_code", site_code);
			return "theater";
		}
		
	//사이트->날짜 클릭시 해당하는 상영관 정보 불러 오기 
		@RequestMapping(value = "theaterSiteDate", method = RequestMethod.GET)
		public String theaterSiteDate(@RequestParam("site_code")String site_code,@RequestParam("timetable_date")String timetable_date, Model model) {
			//-------------- 기본적으로 상단 메뉴
			List<SiteVO> seoulVO = siteService.siteSelectCodeSearch("1");//서울 
			model.addAttribute("seoulVO", seoulVO);
			
			// 사이트 정보들 검색
			SiteVO siteVO = siteService.siteSelectCode(site_code);
			model.addAttribute("site", siteVO);
			
			//상영관별 날짜 불러오기 
			List<Map<String,String>> screeningDate = timetableService.timetableSelectDate(site_code);
			model.addAttribute("screeningDate", screeningDate);
			
			// 상영관 사이트 와 날짜로 그날 있는 상영 시간표 출력
			List<TimetableTableClientVO> resultList = timetableService.timetableSelectGetMovieCode(site_code, timetable_date);
			model.addAttribute("resultList", resultList);
			
			model.addAttribute("site_code", site_code);
			
			//log test
				for(TimetableTableClientVO a : resultList){
				System.out.println(a.getMovieVO().getMovie_title());	
				System.out.println(a.getMovieVO());	 
				System.out.println(a);	 
				}
			//log test
			
			return "theater";
		}
	/*관리자*/ 
	// 관라지가 상영관 정보 입력
	@RequestMapping(value = "admin/adTheaterInsert", method = RequestMethod.POST)
	public String adTheaterInsert(HttpServletRequest request){
		int r = theaterService.theaterInsert(request);
		if(r==0){//실패시
			return "admin/adTheaterInsert";
		}else{
			return "redirect:adTheater";
		}
	}
	
	//관리자가 상영관 정보를 사이트 별로 검색
	@RequestMapping(value = "admin/adTheater", method = RequestMethod.POST)
	public String adTheater(@RequestParam("site")String site_code, Model model){
		List<TheaterVO> theaterVO = theaterService.theaterSelectSite(site_code);
		List<SiteVO> siteVO = siteService.siteSelectAll();
		model.addAttribute("theaterVO", theaterVO);
		model.addAttribute("siteVO", siteVO);
		return "admin/adTheater";
	}
	
	//관리자가 상여관 정보 수정
	@RequestMapping(value = "admin/adTheaterUpdate", method = RequestMethod.POST)
	public String adTheaterUpdate(HttpServletRequest request){
		int r = theaterService.theaterUpdate(request);
		if(r==0){//실패시
			return "admin/adTheaterUpdate";
		}else{
			return "redirect:adTheater";
		}
	}
}
