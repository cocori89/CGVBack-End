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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.cgv.dao.TimetableDao;
import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.domain.TimetableVO;
import kr.co.cgv.service.MovieService;
import kr.co.cgv.service.TimetableService;

//시간표 컨트롤러
@Controller
public class TimetableController {
	@Autowired
	TimetableService timetableService;
	@Autowired
	TimetableDao timetableDao;
	@Autowired
	MovieService movieService;
	
	
	/*클라이언트*/
	/*관리자*/
	//Ajax를 이용한 영화 선택하면 시작 시간+런타임하여 끝나느 시간 구해주는 메서드
	@RequestMapping(value = "/admin/theaterRunTime" , method = RequestMethod.GET, produces = "application/text; charset=utf8")
	public @ResponseBody String theaterRunTime(@RequestParam("movie_code")int movie_code,@RequestParam("startTime")String start){ 
		// 코드로 영화 정보 가져온다. 
		MovieVO movieVO = movieService.movieSelectCode(movie_code);
		String runTime = movieVO.getMovie_time();// 영화 런타임 가져 온다. 
		int runtime = Integer.parseInt(runTime);//런타임 정수로 변경
		String startTime = start;// 시작 시간 
		String sth = startTime.substring(0,2);//문자열에서 시작 시간만 가져오기
		String stm = startTime.substring(3,5);//문자열에서 시작 분만 가져오기
		int sthint = (Integer.parseInt(sth))*60;//시간 시간 -> 분으로 치환 하면서 정수로 바꿈
		int stmint = Integer.parseInt(stm);//분 정수로 바꿈
		int st = sthint+stmint;//시작 시간 (분)
		int endtime = st+runtime;//시작시간(분)+런타임(분) =  끝나는시간 (분)
		int rth=endtime/60;//끝나는시간 (시간)만 구함
		int rtm=endtime%60;// 끄나는시간 (분)만 구함
		String rthstr;
		String rtmstr;
		if(rth<10){
			rthstr="0"+rth;
		}else{
			rthstr=""+rth;
		}
		if(rtm<10){
			rtmstr="0"+rtm;
		}else{
			rtmstr=""+rtm;
		}
		String reuslt = rthstr+":"+rtmstr;//문자열로 다시 돌려줌
		return reuslt;
	}
	// 관리자 상영 시간 정보 등록
	@RequestMapping(value = "admin/adTimetableInsert", method = RequestMethod.POST)
	public String adTimetableInsert(HttpServletRequest request,@RequestParam("site")String site_code,@RequestParam("date")String date,Model model){
		int r = timetableService.timetableInsert(request);
		if(r==0){
			return "admin/adTimetableInsert";
		}else {
			model.addAttribute("site", site_code);
			model.addAttribute("date", date);
			return "redirect:adTimetableSite";
		}
	}
	// Ajax통신 관리자 상영 정보 등록
	@RequestMapping(value = "/admin/oderStart" , method = RequestMethod.GET, produces = "application/text; charset=utf8")
	public @ResponseBody String oderStart(@RequestParam("timetable_date")String timetable_date,@RequestParam("theater_code")String theater_code){ 
		 ObjectMapper mapper   = new ObjectMapper();//객체를 읽어주는 객체
		 String json = "";// json Strig에 담아서 넘겨줄것이다. 이라는 이름으로 넘겨 줄것이다. 
		Map<String, String> dateTheater = new HashMap<String, String>();
		dateTheater.put("timetable_date",timetable_date);
		dateTheater.put("theater_code",theater_code);
		List<TimetableVO> timetableVO = timetableDao.timetableSelectDateTheater(dateTheater);
		HashMap<String, String> data = new HashMap<String, String>();//돌려줄 데이터 
		if(timetableVO.size() == 0){//없다면 차수1만 추가
			data.put("order", "1");
		}else{
			int listSize = timetableVO.size();//상영 요소 갯수(현재 회차수)
			data.put("order", (listSize+1)+"");//다음 영화 시작 회차 
			String lastStartTime = timetableVO.get(listSize-1).getTimetable_end();
			data.put("start", lastStartTime+"");//다음 영화 시작 시간
		}
		try {
			json=mapper.writeValueAsString(data);// map데이터를 json의 형태롤 바꿔주는 메서드 try/catch 를 사용 한다. 
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
	}
	
}
