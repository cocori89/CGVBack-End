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
import kr.co.cgv.service.SiteService;

@Controller
public class SiteController {
	@Autowired
	SiteService siteService;
	/*클라이언트*/
	
	/*관리자*/
	// 관리자가 사이트 정보등록
	@RequestMapping(value = "admin/adSiteInsert", method = RequestMethod.POST)
	public String adStieInsert(HttpServletRequest request){
		int r = siteService.siteInsert(request);
		if(r == 0){//실패시
			return "admin/adSiteInsert";
		}else {
			return"redirect:adSite";
		}
	}
	// 관리자가 사이트 정보 수정
	@RequestMapping(value = "admin/adSiteUpdate", method = RequestMethod.POST)
	public String adStieUpdate(HttpServletRequest request){
		int r = siteService.siteUpdate(request);
		if(r == 0){//실패시
			return "admin/adSiteUpdate";
		}else {
			return"redirect:adSite";
		}
	}

	// 관리자가 사이트 정보 삭제
	@RequestMapping(value = "admin/adSiteDelete", method = RequestMethod.GET)
	public String adStieDelete(@RequestParam("site_code")String site_code){
		int r = siteService.siteDelete(site_code);
		if(r == 0){//실패시
			return "admin/adSite";
		}else {
			return"redirect:adSite";
		}
	}
	
	// 관리자가 사이트 정보 검색
	@RequestMapping(value = "admin/adSite", method = RequestMethod.POST)
	public String adStie(@RequestParam("code")String code,Model model){
		List<SiteVO> siteVO = siteService.siteSelectCodeSearch(code);
		model.addAttribute("siteVO", siteVO);
		return "admin/adSite";
	}
}
