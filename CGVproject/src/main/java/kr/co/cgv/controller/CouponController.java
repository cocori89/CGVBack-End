package kr.co.cgv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cgv.domain.CouponVO;
import kr.co.cgv.service.CouponService;

//쿠폰 컨트롤러
@Controller
public class CouponController {
	@Autowired
	CouponService couponService;
	
	/*클라이언트*/
	/*관리자*/
	//관리자가 쿠폰 등록 
	@RequestMapping(value = "admin/adCouponInsert", method = RequestMethod.POST)
	public String adCouponInsert(HttpServletRequest request,Model model){
		int r = couponService.couponInsert(request);
		if(r==0){
			return "admin/adCouponInsert";
		}else{
			return "redirect:adCoupon";
		}
		
	}
	//관리자가 아이디로 쿠폰 정보 찾기
	@RequestMapping(value = "admin/adCoupon", method = RequestMethod.POST)
	public String adCoupon(HttpServletRequest request,Model model, @RequestParam("id")String member_id){
		List<CouponVO> couponVO = couponService.couponIdGetList(member_id);
		model.addAttribute("couponVO", couponVO);
		return "admin/adCoupon";
	}
	//관리자가 쿠폰 사용유무 수정
	@RequestMapping(value = "admin/adCouponUseUpdate", method = RequestMethod.POST)
	public String adCouponUseUpdate(HttpServletRequest request){
		int r = couponService.couponUseUpdate(request);
		if(r==0){
			return "admin/adCoupon";
		}else{
			return "redirect:adCoupon";
		}
	}
	
	
}
