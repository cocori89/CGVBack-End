package kr.co.cgv.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.TimetableTableClientVO;
import kr.co.cgv.domain.TimetableVO;

//시간표 서비스
public interface TimetableService {
	//클라이언트
	public List<Map<String,String>> timetableSelectDate(String site_code);//상영 날짜 알려주기 
	public List<TimetableTableClientVO> timetableSelectGetMovieCode(String site_code,String timetable_date);//사이트코드+날짜 이용해서  영화 개수와 무비코드를 뽑아낸다. 를 뽑는다. 
	public List<String> timetableSelectGetTheaterCode(String site_code,String timetable_date, String movie_code);//사이트코드 + 날짜 + 무비코드를 이용해서 상영관 개수와 코드를 를 구한다. 
	public List<String> timetableSelectGetStart(String site_code,String timetable_date, String movie_code, String theater_code);//사이트 코드 + 날 짜 + 무비 코드 + 상영관 코드를 이용 하여 상영시간을 얻는다.

	public List<String> timtableSelectGetSite(String movie_code, String location_num);	//영화 영화 코드와 상영 사이트 지역 번호로 상영하는 영화관 찾기
	public List<String> timtableSelectGetDate(String movie_code, String site_code);	// 영화 코드+ 상영관 코드로 => 날짜 얻기
	//관리자
	public int timetableInsert(HttpServletRequest request);//관리자 시간표 정보 등록
	public List<TimetableVO> timetableSelectDateTheater(String timetable_date, String theater_code);//관리자 날짜와 상영관별로 상영시간표 가져오기
}
