package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.PricelistVO;
import kr.co.cgv.service.PricelistService;

// 가격표  컨트롤러
@Controller
public class PricelistController {
	@Autowired
	PricelistService pricelistService;
	
	//클라이언트
	//관리자
	//관리자 가격표 등록 페이지 이동
	@RequestMapping(value = "admin/adPricelistInsert", method = RequestMethod.POST)
	public String adPricelistInsert(HttpServletRequest request){
		int r = pricelistService.pricelistInsert(request);
		if(r==0){//실패시
			return "admin/adPricelistInsert";
		}else {
			return "redirect:adPricelist";
		}
	}
	//관리자가 종류별로 검색 해서 가져 오기 
	@RequestMapping(value = "admin/adPricelist", method = RequestMethod.POST)
	public String adPricelist(@RequestParam("code")String pricelist_code, Model model){
		List<PricelistVO> pricelistVO = pricelistService.pricelistSelectKind(pricelist_code);
		model.addAttribute("pricelistVO", pricelistVO);
		return "admin/adPricelist";
	}
	// 관리자가 가격정보 삭제
	@RequestMapping(value = "admin/adPricelistDelete", method = RequestMethod.GET)
	public String adPricelistDelete(@RequestParam("pricelist_code")String pricelist_code){
		int r = pricelistService.pricelistDelete(pricelist_code);
		if(r==0){//실패시
			return "admin/adPricelist";
		}else {
			return "redirect:adPricelist";
		}
	}
}
