package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.SeatVO;
import kr.co.cgv.domain.TheaterVO;

public interface TheaterService {
	//클라이언트
	//관리자 
	public int theaterInsert(HttpServletRequest request);//관리자가 상영관 정보 입력
	public List<TheaterVO> theaterSelectAll();//관리자가 상영관 정보 모두 가져 오기
	public List<TheaterVO> theaterSelectSite(String site_code);//관리자가 상영관 정보를 사이트별로 검색
	public TheaterVO theaterSelectCode(String theater_code);// 관리자가 상영관 상세정보 코드로 검색
	public int theaterUpdate(HttpServletRequest request);//관리자가 상영관 상세정보 수정
	public List<SeatVO> theaterSelectSeat(String theater_code);//관리자 상영관 정보 시트 가져오기
	public List<String> theaterSelectSeatRow(String theater_code);//관리자 상영관 정보 시트 줄 가져오기
	public List<String> theaterSelectSeatColumn(String theater_code,String row);//관리자 상영관 정보 시트 줄 가져오기
}
