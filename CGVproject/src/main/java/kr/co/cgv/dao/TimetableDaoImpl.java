package kr.co.cgv.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.TimetableVO;

//시간표 저장소
@Repository
public class TimetableDaoImpl implements TimetableDao {
	@Autowired
	SqlSession sqlSession;

	/*클라이언트*/
	// 상영관 상영날짜 불러 오기 
	@Override
	public List<String> timetableSelectDate(String site_code) {
		return sqlSession.selectList("timetable.timetableSelectDate", site_code);
	}

	//사이트코드+날짜 이용해서  영화 개수와 무비코드를 뽑아낸다. 를 뽑는다. 
	@Override
	public List<String> timetableSelectGetMovieCode(TimetableVO timetableVO) {
		return sqlSession.selectList("timetable.timetableSelectGetMovieCode",timetableVO);
	}

	//사이트코드 + 날짜 + 무비코드를 이용해서 상영관 개수와 코드를 를 구한다. 
	@Override
	public List<String> timetableSelectGetTheaterCode(TimetableVO timetableVO) {
		return sqlSession.selectList("timetable.timetableSelectGetTheaterCode",timetableVO);
	}

	//사이트 코드 + 날 짜 + 무비 코드 + 상영관 코드를 이용 하여 상영시간을 얻는다.
	@Override
	public List<String> timetableSelectGetStart(TimetableVO timetableVO) {
		return sqlSession.selectList("timetable.timetableSelectGetStart",timetableVO);
	}
	
	//영화 영화 코드와 상영 사이트 번호로 상영하는 영화관 찾기 
	@Override
	public List<String> timtableSelectGetSite(Map<String, String> site) {
		return sqlSession.selectList("timetable.timtableSelectSite",site);
	}
	// 영화 코드 + 상영관 코드 => 날짜 얻기
	@Override
	public List<String> timtableSelectGetDate(Map<String, String> date) {
		return sqlSession.selectList("timetable.timtableSelectGetDate",date);
	}


	// 사이트 코드 + 상영관 코드 뒷번호 + 날짜 + 시작시간으로 끝나는 시간 가져오기
	@Override
	public String timetableSelectGetEnd(Map<String, String> end) {
		System.out.println(end);
		
		return sqlSession.selectOne("timetable.timetableSelectGetEnd", end);
	}
	
	
	/*관리자*/
	//관리자 시간표 정보 등록 
	@Override
	public int timetableInsert(TimetableVO timetableVO) {
		return sqlSession.insert("timetable.timetableInsert", timetableVO);
	}

	//관리자 날짜와 상영관 별로 상영 시간정보 가져오기
	@Override
	public List<TimetableVO> timetableSelectDateTheater(Map<String, String> dateTheater) {
		return sqlSession.selectList("timetable.timetableSelectDateTheater",dateTheater);
	}


	

	
}
