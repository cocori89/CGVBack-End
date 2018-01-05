package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.SiteVO;
import kr.co.cgv.domain.TheaterVO;
import kr.co.cgv.service.SiteService;
import kr.co.cgv.service.TheaterService;
// 상영관 정보 컨트롤러
@Controller
public class TheaterController {
	@Autowired
	TheaterService theaterService;
	@Autowired
	SiteService siteService;
	/*클라이언트*/
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
