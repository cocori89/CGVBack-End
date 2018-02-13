package kr.co.cgv.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.TimetableDao;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.TimetableTableClientStartVO;
import kr.co.cgv.domain.TimetableTableClientVO;
import kr.co.cgv.domain.TimetableVO;
//시간표 서비스
@Service
public class TimetableServiceImpl implements TimetableService {
	@Autowired
	TimetableDao timetableDao;
	@Autowired 
	MovieService movieService;
	/*클라리언트*/
	//상영관 상영 날짜 불러오기 
	@Override
	public List<Map<String,String>> timetableSelectDate(String site_code) {
		DateFormat format = new SimpleDateFormat("E");
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		List<String> dateVO = timetableDao.timetableSelectDate(site_code);
		List<Map<String,String>> resultdate = new ArrayList<Map<String,String>>();
		Calendar cal = Calendar.getInstance();
		String nowtime = ""+ f.format(cal.getTime());
		System.out.println(nowtime+"지금 시간");
		int ny = Integer.parseInt(nowtime.substring(0, 4));//현재년
		int nm = Integer.parseInt(nowtime.substring(5, 7));//현재년
		int nd = Integer.parseInt(nowtime.substring(8, 10));//현재년
		
		for(String date : dateVO){
			Map<String, String> dateMap= new HashMap<String, String>();
			String sy = date.substring(0, 4);//년
			String sm = date.substring(5, 7);//월 의 경우 
			String sd = date.substring(8, 10);//일
			int y = Integer.parseInt(date.substring(0, 4));//년
			int m = Integer.parseInt(date.substring(5, 7));//월 의 경우 
			int d = Integer.parseInt(date.substring(8, 10));//일
			
			// 오늘 날짜 지난건 출력하지 않는다. 
			if(ny<=y){
				if(nm<=m){
					if(nd<=d){
						cal.set(y,m-1,d);
						String se = ""+ format.format(cal.getTime());
						dateMap.put("yy", sy);
						dateMap.put("mm", sm);
						dateMap.put("dd", sd);
						dateMap.put("ee", se);
						resultdate.add(dateMap);
					}
				}
			}
		};
		
		return resultdate;
	}
	
	//사이트코드+날짜 이용해서  영화 개수와 무비코드를 뽑아낸다. 를 뽑는다. 
	@Override
	public List<TimetableTableClientVO> timetableSelectGetMovieCode(String site_code, String timetable_date) {
		TimetableVO timetableVO = new TimetableVO();
		timetableVO.setSite_code(site_code);
		timetableVO.setTimetable_date(timetable_date);
		
		List<String> movieCode = timetableDao.timetableSelectGetMovieCode(timetableVO);//영화 코드 = 영화 이름을 가져올것이다. 리스트
		
		List<TimetableTableClientVO> clientVOList = new ArrayList<TimetableTableClientVO>();// 최종 리턴 값 (사이트->날짜->상영관->영화->시간)의 정보
		for(String movie_code: movieCode){
			TimetableTableClientVO clientVO =  new TimetableTableClientVO();//저장형태 불러오기 
			List<String> theaterCode = timetableSelectGetTheaterCode(site_code, timetable_date, movie_code);//상영관 코드 리스트
			
			MovieVO movieVO = movieService.movieSelectCode(Integer.parseInt(movie_code));//상영관 정보 
			List<TimetableTableClientStartVO> startVOList = new ArrayList<TimetableTableClientStartVO>();//하위 정보 저장 리스트
			
			
			for(String theater_code:theaterCode){
				TimetableTableClientStartVO startVO =new TimetableTableClientStartVO();// 저장 형태 불러오기
				List<String> timeStart = timetableSelectGetStart(site_code, timetable_date, movie_code, theater_code);//상영시간 리스트
				String theater_num = theater_code.substring(theater_code.length()-2, theater_code.length());// 00관 의 숫자만 자르기
				startVO.setTheater_code(theater_num);//관 번호 저장
				startVO.setTheater_start(timeStart);//시작시작 저장
				startVOList.add(startVO);// 하위 정보 저장
			}
			clientVO.setMovieVO(movieVO);// 영화정보 저장
			clientVO.setTimetableVO(startVOList);//상위정보 저장
			clientVOList.add(clientVO);// 최정 모든 정보 저장
		}
		
		
		return clientVOList;
	}

	//사이트코드 + 날짜 + 무비코드를 이용해서 상영관 개수와 코드를 를 구한다. 
	@Override
	public List<String> timetableSelectGetTheaterCode(String site_code, String timetable_date, String movie_code) {
		TimetableVO timetableVO = new TimetableVO();
		timetableVO.setSite_code(site_code);
		timetableVO.setTimetable_date(timetable_date);
		timetableVO.setMovie_code(movie_code);
		return timetableDao.timetableSelectGetTheaterCode(timetableVO);
	}

	//사이트 코드 + 날 짜 + 무비 코드 + 상영관 코드를 이용 하여 상영시간을 얻는다. 
	@Override
	public List<String> timetableSelectGetStart(String site_code, String timetable_date, String movie_code,
			String theater_code) {
		TimetableVO timetableVO = new TimetableVO();
		timetableVO.setSite_code(site_code);
		timetableVO.setTimetable_date(timetable_date);
		timetableVO.setMovie_code(movie_code);
		timetableVO.setTheater_code(theater_code);
		//현재시간보다 나중에 들어온거면 출력하지 않는 기능 추가 해야함
		return timetableDao.timetableSelectGetStart(timetableVO);
	}
	
	//영화 영화 코드와 상영 사이트 지역 번호로 상영하는 영화관 찾기
	@Override
	public List<String> timtableSelectGetSite(String movie_code, String location_num) {
		Map<String,String> site = new HashMap<String, String>();
		site.put("movie_code", movie_code);
		site.put("location_num", location_num);
		return timetableDao.timtableSelectGetSite(site);
	}
	
	//영화 코드 + 상영관 코드 => 날짜 얻기
	@Override
	public List<String> timtableSelectGetDate(String movie_code, String site_code) {
		Map<String,String> date = new HashMap<String, String>();
		date.put("movie_code", movie_code);
		date.put("site_code", site_code);
			
		return 	timetableDao.timtableSelectGetDate(date);
	}
	
	
	
	
	
	/*관리자*/
	
	//잠시 보류 일단 데이터를 먼저 넣는게 우선 순위
	//관리자 시간표 정보 등록
	@Override
	public int timetableInsert(HttpServletRequest request) {
		TimetableVO timetableVO = new TimetableVO();
		String movie = request.getParameter("movie");//제목도 찾기 위한 코드 뽑기
		int movie_code = Integer.parseInt(movie);
		MovieVO movieVO = movieService.movieSelectCode(movie_code);
		System.out.println(movieVO.getMovie_title());
		
		timetableVO.setSite_code(request.getParameter("site"));
		timetableVO.setTheater_code(request.getParameter("theater"));
		timetableVO.setTimetable_date(request.getParameter("date"));
		timetableVO.setTimetable_order(request.getParameter("order"));
		timetableVO.setTimetable_start(request.getParameter("start"));
		timetableVO.setTimetable_end(request.getParameter("end"));
		timetableVO.setMovie_code(request.getParameter("movie"));
		timetableVO.setMovie_title(movieVO.getMovie_title());
		return timetableDao.timetableInsert(timetableVO);
	}
	//관리자 날짜와 상영관 별로 상영시간 정보 가져 오기
	@Override
	public List<TimetableVO> timetableSelectDateTheater(String timetable_date, String theater_code) {
		Map<String, String> dateTheater = new HashMap<String, String>();
		dateTheater.put("timetable_date",timetable_date);
		dateTheater.put("theater_code",theater_code);
		return timetableDao.timetableSelectDateTheater(dateTheater);
	}



	
}
