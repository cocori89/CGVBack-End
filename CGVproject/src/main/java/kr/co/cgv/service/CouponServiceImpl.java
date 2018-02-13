package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.CouponDao;
import kr.co.cgv.dao.MemberDao;
import kr.co.cgv.domain.CouponVO;

//쿠폰 서비스
@Service
public class CouponServiceImpl implements CouponService{
	@Autowired
	CouponDao couponDao;
	@Autowired
	MemberDao memberDao;
	/*클라이언트*/
	/*관리자*/
	@Override
	public int couponInsert(HttpServletRequest request) {
		String price = request.getParameter("price");
		String sId = request.getParameter("id");
		String end = request.getParameter("end");
		String rating = request.getParameter("rating");		
		System.out.println("couponServiceImpl 가격 ="+price);
		System.out.println("couponServiceImpl 쿠폰 유통기한="+end);
		System.out.println("couponServiceImpl 회원등급="+rating);
		if(rating.equals("0")){//아이디를 직접 입력하여 특정 고객에게 쿠폰을 지급하는 경우 
			CouponVO couponVO = new CouponVO();
			couponVO.setCoupon_price(price);
			couponVO.setMember_id(sId);
			couponVO.setCoupon_end(end);
			couponDao.couponInsert(couponVO);
			System.out.println("couponServiceImpl 특정으로 오니?");//log
			return 1;
		}else {// 고객의 등급에 따라 등록 하기 
			System.out.println("couponServiceImpl 리스트로 오니?");//log
			List<String> idList = memberDao.memberSelectRatingGetId(rating);
			for(String id: idList){
				System.out.println("couponServiceImpl 아이디 ="+id);//log
				CouponVO couponVO = new CouponVO();
				couponVO.setCoupon_price(price);
				couponVO.setMember_id(id);
				couponVO.setCoupon_end(end);
				couponDao.couponInsert(couponVO);
			}
			return 1;
		}
	}
	//관리자가 쿠폰정보 리스트 가져오기
	@Override
	public List<CouponVO> couponGetAllList() {
		return couponDao.couponGetAllList();
	}
	//관리자가 아이디로 쿠폰 정보 찾아 오기 
	@Override
	public List<CouponVO> couponIdGetList(String member_id) {
		return couponDao.couponIdGetList(member_id);
	}
	//관리자가 쿠폰 사용 유무 수정하기
	@Override
	public int couponUseUpdate(HttpServletRequest request) {
		CouponVO couponVO = new CouponVO();
		couponVO.setCoupon_code(Integer.parseInt(request.getParameter("code")));
		couponVO.setCoupon_use(request.getParameter("use"));
		return couponDao.couponUseUpdate(couponVO);
	}
}
