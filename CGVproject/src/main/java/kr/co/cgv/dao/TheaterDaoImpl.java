package kr.co.cgv.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.SeatVO;
import kr.co.cgv.domain.TheaterVO;

// 상영관 정보 저장소
@Repository
public class TheaterDaoImpl implements TheaterDao{
	@Autowired
	SqlSession sqlSession;
	/*클라이언트*/
	/*관리자*/
	//관리자가 상영관 정보 입력
	@Override
	public int theaterInsert(TheaterVO theaterVO) {
		return sqlSession.insert("theater.theaterInsert", theaterVO);
	}
	//관리자가 상영관 정보 모두 가져 오기
	@Override
	public List<TheaterVO> theaterSelectAll() {
		return sqlSession.selectList("theater.theaterSelectAll");
	}
	//관리자가 상영관 정보가 사이트 별로 검색
	@Override
	public List<TheaterVO> theaterSelectSite(String site_code) {
		return sqlSession.selectList("theater.theaterSelectSite",site_code);
	}
	//관리자가 상영관 상세 정보를 코드로 검색
	@Override
	public TheaterVO theaterSelectCode(String theater_code) {
		return sqlSession.selectOne("theater.theaterSelectCode", theater_code);
	}
	//관리자가 상영관 상세정보 수정 
	@Override
	public int theaterUpdate(TheaterVO theaterVO) {
		return sqlSession.update("theater.theaterUpdate",theaterVO);
	}
	//관리자가 상영관 좌성 정보 가져오기
	@Override
	public List<SeatVO> theaterSelectSeat(String theater_code) {
		return sqlSession.selectList("theater.theaterSelectSeat",theater_code);
	}
	//관리자가 상영관 좌석 정보 줄 가져오기
	@Override
	public List<String> theaterSelectSeatRow(String theater_code) {
		return sqlSession.selectList("theater.theaterSelectSeatRow",theater_code);
	}
	//관리자가 상영관 좌석 정보 칸 가져오기
	@Override
	public List<String> theaterSelectSeatColumn(Map<String, String> rows) {
		return sqlSession.selectList("theater.theaterSelectSeatColumn",rows);
	}

}
