package kr.co.cgv.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.service.MovieService;
import kr.co.cgv.service.ReservationService;
import kr.co.cgv.service.TimetableService;


//예약 컨트롤러
@Controller
public class ReservationController {
	@Autowired
	private MovieService movieService;
	@Autowired
	private TimetableService timetableService;
	@Autowired
	private ReservationService reservationService;
	
	/*클라이언트*/
	//Ajax를 이용한 상영 지역 + 상영 영화 를 이용하여 상영 영화 극장 가져 오기
		@RequestMapping(value = "/ticketSite" , method = RequestMethod.GET, produces = "application/text; charset=utf8")
		public @ResponseBody String ticketSite(@RequestParam("movie_title")String movie_title,@RequestParam("location_num")String location_num){
			ObjectMapper mapper   = new ObjectMapper();//객체를 읽어주는 객체
			String json = "일단 성공!";
			List<MovieVO> movieVO = movieService.movieSelectTitle(movie_title);// 영화 제목으로  영화 코드 얻어 오기
			int intMovie_code =movieVO.get(0).getMovie_code();
			String movie_code = intMovie_code+""; 
			List<String> result = timetableService.timtableSelectGetSite(movie_code, location_num);
			System.out.println(movie_title);
			System.out.println(location_num);
			try {
				json=mapper.writeValueAsString(result);// map데이터를 json의 형태롤 바꿔주는 메서드 try/catch 를 사용 한다. 
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return json;
		} 
		
		//Ajax를 이용한 상영관 코드 + 상영 영화 를 이용하여 상영 날짜 가져오기
		@RequestMapping(value = "/ticketDate" , method = RequestMethod.GET, produces = "application/text; charset=utf8")
		public @ResponseBody String ticketDate(@RequestParam("movie_title")String movie_title,@RequestParam("site_code")String site_code){
			ObjectMapper mapper =  new ObjectMapper();// 객체를 읽어주는 객체
			String json="";
			List<MovieVO> movieVO = movieService.movieSelectTitle(movie_title);// 영화 제목으로  영화 코드 얻어 오기
			int intMovie_code =movieVO.get(0).getMovie_code();
			String movie_code = intMovie_code+""; 
			
			List<String> result = timetableService.timtableSelectGetDate(movie_code, site_code);
			try {
				json=mapper.writeValueAsString(result);// map데이터를 json의 형태롤 바꿔주는 메서드 try/catch 를 사용 한다. 
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return json;
		} 
		
		//Ajax를 이용한 상영관 코드 + 상영 영화 + 날짜를  이용하여 상영시간 가져오기
		@RequestMapping(value = "/ticketTime" , method = RequestMethod.GET, produces = "application/text; charset=utf8")
		public @ResponseBody String ticketTime(@RequestParam("movie_title")String movie_title,@RequestParam("site_code")String site_code,@RequestParam("timetable_date")String timetable_date){
			ObjectMapper mapper = new ObjectMapper();
			String json="";
			Map<String,List<String>> result = new HashMap<String, List<String>>();// 모든 값을 넣어줄 장소
			//List<List<String>> timeList = new ArrayList<List<String>>();// 각상영관 시간 넣어줄 장소
			List<MovieVO> movieVO = movieService.movieSelectTitle(movie_title);// 영화 제목으로  영화 코드 얻어 오기
			int intMovie_code =movieVO.get(0).getMovie_code();
			String movie_code = intMovie_code+""; 
			List<String> theater_codeVO = timetableService.timetableSelectGetTheaterCode(site_code, timetable_date, movie_code);// 코드리스트
			
			result.put("theater_code", theater_codeVO);
			int i= 1;
			for(String theater_code: theater_codeVO){
			List<String> timeVO = timetableService.timetableSelectGetStart(site_code, timetable_date, movie_code, theater_code);
			System.out.println(timeVO);//시간표 log
			result.put("timetable_time"+(i++), timeVO);
			}
			System.out.println(result);
			
			try {
				json=mapper.writeValueAsString(result);// map데이터를 json의 형태롤 바꿔주는 메서드 try/catch 를 사용 한다. 
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//log
			for(String a : theater_codeVO){
				System.out.println(a);
			}
			//log
			// log
			System.out.println(movie_title);
			System.out.println(site_code);
			System.out.println(timetable_date);
			// log
			return json;
		} 
		// 예약 취소 하기 
		@RequestMapping(value = "reservationDelete" ,method = RequestMethod.POST)
		public String reservationDelete(@RequestParam("reservation_code")int reservation_code ){
			int r=reservationService.reservationDelete(reservation_code);
			if(r==0){//실패시
				return "reservation";
			}else {
				return "redirect:reservation";
			}
		}
		//영화 별점 주기 
		@RequestMapping(value = "star", method = RequestMethod.POST)
		public String star(HttpServletRequest request){
			int r = reservationService.reservationStar(request);
			if(r==0){//실패시
				return "reservation";
			}else {
				return "redirect:reservation";
			}
		}
		
		
		
	/*관리자*/
}
