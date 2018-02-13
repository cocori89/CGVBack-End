package kr.co.cgv.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.MovieDao;
import kr.co.cgv.dao.ReservationDao;
import kr.co.cgv.dao.TheaterDao;
import kr.co.cgv.dao.TimetableDao;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.ReservationVO;
import kr.co.cgv.domain.TheaterVO;

//예약 서비스 
@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	MovieDao movieDao;
	@Autowired
	TimetableDao timetableDao;
	@Autowired
	TheaterDao theaterDao;
	@Autowired
	ReservationDao reservationDao;

	
	/*클라이언트*/
	//현재 상영작 만 가져오기
		@Override
		public List<MovieVO> movieSelectNow() {
			return movieDao.movieSelectNow();
		}
	// 사이트 코드 + 상영관 코드 뒷번호 + 날짜 + 시작시간으로 끝나는 시간 가져오기
	@Override
	public String timetableSelectGetEnd(String site_code, String theater_code, String timetable_date,
			String timetable_start) {
		Map<String, String> end = new HashMap<String, String>();
		String theater = theater_code.substring(0,2);
		
		end.put("site_code", site_code);
		end.put("theater_code", theater);
		end.put("timetable_date", timetable_date);
		end.put("timetable_start", timetable_start);
		System.out.println(site_code);
		System.out.println(theater);
		System.out.println(timetable_date);
		System.out.println(timetable_start);
		return timetableDao.timetableSelectGetEnd(end);
	}

	// 예약 등록 
	@Override
	public int reservationInsert(HttpServletRequest request,HttpSession session) {
		ReservationVO reservationVO = new ReservationVO();
		String site_code = request.getParameter("site");
		String theater_code =  request.getParameter("theater");
		String reservation_adult = request.getParameter("adult");
		String reservation_teenager = request.getParameter("teenager");
		String reservation_people = request.getParameter("people");
		String timetable_date = request.getParameter("date");
		String timetable_start = request.getParameter("start");
		String timetable_end = request.getParameter("end");
		String movie_title = request.getParameter("title");
		String timetable_day = request.getParameter("day");
		String theater_kind = "";//상영관 코드를 이용 해서 넣어준다. 
		String theater_num = "";// theater_code에서 분리 하여 넣어준다. 
		String reservation_seat = request.getParameter("seat");
		String reservation_price = request.getParameter("price");
		String movie_grade = "";//영화 타이틀을 이용해서 코드를 찾아 정보를 얻어 온다. 
		String member_id = String.valueOf(session.getAttribute("member_id"));
		
		theater_num= theater_code.substring(0,2);
		theater_code = site_code.substring(0,site_code.length()-1);
		theater_code = theater_code+theater_num;
		
		TheaterVO theaterVO= theaterDao.theaterSelectCode(theater_code);
		theater_kind = theaterVO.getTheater_kind();
		
		List<MovieVO> movieList = movieDao.movieSelectTitle(movie_title);
		MovieVO movieVO = movieList.get(0);
		movie_grade = movieVO.getMovie_grade();
		
		//log
		System.out.println("site_code="+site_code);
		System.out.println("theater_code="+theater_code);
		System.out.println("reservation_adult="+reservation_adult);
		System.out.println("reservation_teenager="+reservation_teenager);
		System.out.println("reservation_people="+reservation_people);
		System.out.println("timetable_date="+timetable_date);
		System.out.println("timetable_start="+timetable_start);
		System.out.println("timetable_end="+timetable_end);
		System.out.println("movie_title="+movie_title);
		System.out.println("timetable_day="+timetable_day);
		System.out.println("theater_kind="+theater_kind);
		System.out.println("theater_num="+theater_num);
		System.out.println("reservation_seat="+reservation_seat); 
		System.out.println("reservation_price="+reservation_price); 
		System.out.println("movie_grade="+movie_grade); 
		System.out.println("member_id="+member_id); 
		//log
		reservationVO.setSite_code(site_code);
		reservationVO.setTheater_code(theater_code);
		reservationVO.setReservation_adult(reservation_adult);
		reservationVO.setReservation_teenager(reservation_teenager);
		reservationVO.setReservation_people(reservation_people);
		reservationVO.setTimetable_date(timetable_date);
		reservationVO.setTimetable_start(timetable_start);
		reservationVO.setTimetable_end(timetable_end);
		reservationVO.setMovie_title(movie_title);
		reservationVO.setTimetable_day(timetable_day);
		reservationVO.setTheater_kind(theater_kind);
		reservationVO.setTheater_num(theater_num);
		reservationVO.setReservation_seat(reservation_seat);
		reservationVO.setReservation_price(reservation_price);
		reservationVO.setMovie_grade(movie_grade);
		reservationVO.setMember_id(member_id);
		             
		return reservationDao.reservationInsert(reservationVO);
	}
	
	// 아이디로 예약정보 불러 오기
	@Override
	public List<ReservationVO> reservationSelectId(HttpSession session) {
		String member_id = (String) session.getAttribute("member_id");
		List<ReservationVO> reservationVO = reservationDao.reservationSelectId(member_id);
		for(ReservationVO reservation : reservationVO){
			String movie_title = reservation.getMovie_title();
			List<MovieVO> movieList = movieDao.movieSelectTitle(movie_title);
			MovieVO movieVO = movieList.get(0);
			String poster = movieVO.getMovie_poster();
			int movie_code = movieVO.getMovie_code();
			System.out.println(poster);
			reservation.setMovie_poster(poster);
			reservation.setMovie_code(movie_code);
		}
		return reservationVO;
	}
	//예약 취소
	@Override
	public int reservationDelete(int reservation_code) {
		return reservationDao.reservationDelete(reservation_code);
	}
	//평점 등록
	@Override
	public int reservationStar(HttpServletRequest request) {
		try {
			int reservation_code = Integer.parseInt(request.getParameter("reservation_code")); 
			int movie_code= Integer.parseInt(request.getParameter("movie_code"));
			double star= Double.parseDouble(request.getParameter("star"));
			reservationDao.reservationStar(reservation_code);
			MovieVO movieVO = movieDao.movieSelectCode(movie_code);
			double getStar= Double.parseDouble(movieVO.getMovie_star());
			int count = reservationDao.reservationGetStarCount(movieVO.getMovie_title())+1;
			double movie_star = (getStar+star)/count;//나누기 해서 카운드를 구한다. 
			movieVO.setMovie_star(movie_star+"");
			movieDao.movieUpdate(movieVO);
			return 1;
		} catch (Exception e) { //실패시 
			System.out.println(e);
			return 0;
		}
	}
	
	

	// 영화 개봉작 불러 오기 (movie - 에서 뽑 아 올것)
	// 극장 지역별로 뽑아 올것 (theater 에서 뽑아 오자 )
	// 날짜 뽑아 올것 // 시간 뽑아 올것

	// 상영관 별로 시트 정보 불러 오기 (theater를 참고 하여 seat 정보를 알아 와서 정보 뿌린후에 출력하기)
	/*
	 * 여기서 주의 할점은 영화 시트정보를 불러 올때 예약 이 되어 있다면 시트가 출려 될때 체크가 되어 있는 것으로 되어야 한다.
	 * name값을 다르게 만들것 이것은 프론트단에서 제어 해야함
	 */

	// 예약 정보 저장

	/*관리자*/ 
}
