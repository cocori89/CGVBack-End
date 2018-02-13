package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.ReservationVO;

//예약 정장소
@Repository
public class ReservaionDaoImpl implements ReservationDao {

	@Autowired
	SqlSession sqlsession;
	
	/*클라이언트*/

	//아이디로 예약정보 불러오기 
	@Override
	public List<ReservationVO> reservationSelectId(String member_id) {
		return sqlsession.selectList("reservation.reservationSelectId",member_id);
	}

	//예약 등록 
	@Override
	public int reservationInsert(ReservationVO reservationVO) {
		return sqlsession.insert("reservation.reservationInsert",reservationVO);
	}
	//예약 취소
	@Override
	public int reservationDelete(int reservation_code) {
		return sqlsession.update("reservation.reservationDelete",reservation_code);
	}

	//평점 등록
	@Override
	public int reservationStar(int reservation_code) {
		return sqlsession.update("reservation.reservationStar",reservation_code);
	}

	//평가된 영화 갯수 가져오기 (나중에 +1 해야함)
	@Override
	public int reservationGetStarCount(String movie_title) {
		return sqlsession.selectOne("reservation.reservationGetStarCount", movie_title);
	}

	
	/*관리자*/

}
