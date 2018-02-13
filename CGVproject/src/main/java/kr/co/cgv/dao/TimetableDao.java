package kr.co.cgv.dao;

import java.util.List;
import java.util.Map;

import kr.co.cgv.domain.TimetableVO;

//시간표 저장소
public interface TimetableDao {
	//클라이언트
	public List<String> timetableSelectDate(String site_code);//사이트 상영날짜 알려주기 
	public List<String> timetableSelectGetMovieCode(TimetableVO timetableVO);//사이트코드+날짜 이용해서  영화 개수와 무비코드를 뽑아낸다. 를 뽑는다. 
	public List<String> timetableSelectGetTheaterCode(TimetableVO timetableVO);//사이트코드 + 날짜 + 무비코드를 이용해서 상영관 개수와 코드를 를 구한다. 
	public List<String> timetableSelectGetStart(TimetableVO timetableVO);//사이트 코드 + 날 짜 + 무비 코드 + 상영관 코드를 이용 하여 상영시간을 얻는다.

	public List<String> timtableSelectGetSite(Map<String,String> site);	//영화 영화 코드와 상영 사이트 번호로 상영하는 영화관 찾기
	public List<String> timtableSelectGetDate(Map<String,String> date);	// 영화 코드+ 상영관 코드로 => 날짜 얻기
	public String timetableSelectGetEnd(Map<String,String> end);// 사이트 코드 + 상영관 코드 뒷번호 + 날짜 + 시작시간으로 끝나는 시간 가져오기
	
	//관리자
	public int timetableInsert(TimetableVO timetableVO);//관리자 시간표 정보 등록
	public List<TimetableVO> timetableSelectDateTheater(Map<String, String> dateTheater);//관리자 날짜와 상영관별로 상영시간표 가져오기
	
}
