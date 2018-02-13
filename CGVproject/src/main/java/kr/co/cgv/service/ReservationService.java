package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.ReservationVO;

public interface ReservationService {

	/*클라이언트*/
	public List<MovieVO> movieSelectNow();// 현재 개봉작 가져 오기 
	public String timetableSelectGetEnd(String site_code, String theater_code, String timetable_date, String timetable_start);// 사이트 코드 + 상영관 코드 뒷번호 + 날짜 + 시작시간으로 끝나는 시간 가져오기
	public int reservationInsert(HttpServletRequest request, HttpSession session);//예약 등록 
	public List<ReservationVO> reservationSelectId(HttpSession session);//등록한 아이디별 예약 정보 불러오기 
	public int reservationDelete(int reservation_code);//예약취소
	public int reservationStar(HttpServletRequest request);//평점등록
	//예약 정보 저장
	/*관리자*/
}
