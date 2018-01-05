package kr.co.cgv.dao;

import java.util.List;
import java.util.Map;

import kr.co.cgv.domain.SeatVO;
import kr.co.cgv.domain.TheaterVO;

public interface TheaterDao {
	//클라이언트
	//관리자
	public int theaterInsert(TheaterVO theaterVO);//관리자가 상영관 정보 입력
	public List<TheaterVO> theaterSelectAll();//관리자가 상영관 정보 모두 가져 오기
	public List<TheaterVO> theaterSelectSite(String site_code);//관리자가 상영관 정보를 사이트별로 검색
	public TheaterVO theaterSelectCode(String theater_code);// 관리자가 상영관 상세정보 코드로 검색
	public int theaterUpdate(TheaterVO theaterVO);//관리자가 상영관 상세정보 수정
	public List<SeatVO> theaterSelectSeat(String theater_code);//관리자 상영관 정보 시트 가져오기
	public List<String> theaterSelectSeatRow(String theater_code);//관리자 상영관 정보 시트 줄 가져오기
	public List<String> theaterSelectSeatColumn(Map<String, String> rows);//관리자 상영관 정보 시트 칸 가져오기
}
