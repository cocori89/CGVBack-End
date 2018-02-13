package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.CouponVO;

//쿠폰 서비스
public interface CouponService {
	/*클라이언트*/
	/*관리자*/
	public int couponInsert(HttpServletRequest request);//관리자가 쿠폰 등록 (배포) 하기
	public List<CouponVO> couponGetAllList();//관리자가 쿠폰정보 리스트 가져오기
	public List<CouponVO> couponIdGetList(String member_id);//관리자가 아이디로 쿠폰 정보 찾기
	public int couponUseUpdate(HttpServletRequest request);//관리자가 쿠폰 사용유부 수정 하기
}
