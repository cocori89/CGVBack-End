package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.CouponVO;

//쿠폰 저장소
@Repository
public class CouponDaoImpl implements CouponDao {
	@Autowired
	SqlSession sqlSession;
	
	/*클라이언트*/
	/*관리자*/
	//관리자가  회원등급에 따라 쿠폰배포 혹은 특정 아이디에 쿠폰 배포
	@Override
	public int couponInsert(CouponVO couponVO) {
		return sqlSession.insert("coupon.couponInsert", couponVO);
	}

	//관리자가 모든 쿠폰 정보 가져오기
	@Override
	public List<CouponVO> couponGetAllList() {
		return sqlSession.selectList("coupon.couponGetAllList");
	}
	
	//관리자가 아이디로 쿠폰정보 찾기 
	@Override
	public List<CouponVO> couponIdGetList(String member_id) {
		return sqlSession.selectList("coupon.couponIdGetList", member_id);
	}

	//관리자가 쿠폰 사용 유무 수정하기 
	@Override
	public int couponUseUpdate(CouponVO couponVO) {
		return sqlSession.update("coupon.couponUseUpdate",couponVO);
	}
}
