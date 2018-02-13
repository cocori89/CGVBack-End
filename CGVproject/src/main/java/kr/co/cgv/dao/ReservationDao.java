package kr.co.cgv.dao;

import java.util.List;

import kr.co.cgv.domain.ReservationVO;

public interface ReservationDao {
	//클라이언트
	public int reservationInsert(ReservationVO reservationVO);// 예약 등록 
	public List<ReservationVO> reservationSelectId(String member_id);//등록한 아이디별 예약 정보 불러오기
	public int reservationDelete(int reservation_code);//예약 취소
	public int reservationStar(int reservation_code);//평점 등록
	public int reservationGetStarCount(String movie_title);//평가된 영화 갯수 가져오기 (가져온후 +1을 해야함)
	//관리자
}
