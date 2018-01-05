package kr.co.cgv.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.TheaterDao;
import kr.co.cgv.domain.SeatVO;
import kr.co.cgv.domain.TheaterVO;
// 상영관 정보 서비스
@Service
public class TheaterServiceImpl implements TheaterService {
	@Autowired
	TheaterDao theaterDao;
	
	/*클라이언트*/
	/*관리자*/
	//관리자가 상영관 정보 입력
	@Override
	public int theaterInsert(HttpServletRequest request) {
		TheaterVO theaterVO = new TheaterVO();
		theaterVO.setTheater_code(request.getParameter("code"));
		theaterVO.setSite_code(request.getParameter("site"));
		theaterVO.setTheater_num(request.getParameter("num"));
		theaterVO.setTheater_people(request.getParameter("people"));
		theaterVO.setTheater_kind(request.getParameter("kind"));
		return theaterDao.theaterInsert(theaterVO);
	}

	//관리자가 상영관 정보 모두 가져오기
	@Override
	public List<TheaterVO> theaterSelectAll() {
		return theaterDao.theaterSelectAll();
	}
	
	//관리자가 상영관 정보 사이트 별로 검색을 한다. 
	@Override
	public List<TheaterVO> theaterSelectSite(String site_code) {
		return theaterDao.theaterSelectSite(site_code);
	}
	
	//관리자가 상영관 상세 정보 코드로 검색
	@Override
	public TheaterVO theaterSelectCode(String theater_code) {
		return theaterDao.theaterSelectCode(theater_code);
	}

	//관리자가 상세 정보 수정
	@Override
	public int theaterUpdate(HttpServletRequest request) {
		TheaterVO theaterVO = new TheaterVO();
		theaterVO.setTheater_code(request.getParameter("code"));
		theaterVO.setSite_code(request.getParameter("site"));
		theaterVO.setTheater_num(request.getParameter("num"));
		theaterVO.setTheater_people(request.getParameter("people"));
		theaterVO.setTheater_kind(request.getParameter("kind"));
		return theaterDao.theaterUpdate(theaterVO);
	}

	//관리자 좌석 정보 시트 가져 오기 
	@Override
	public List<SeatVO> theaterSelectSeat(String theater_code) {
		return theaterDao.theaterSelectSeat(theater_code);
	}
	///관리자가 상영관 좌석 정보 줄 가져오기
	@Override
	public List<String> theaterSelectSeatRow(String theater_code) {
		return theaterDao.theaterSelectSeatRow(theater_code);
	}

	@Override
	public List<String> theaterSelectSeatColumn(String theater_code, String row) {
		Map<String, String> rows = new HashMap<String, String>();
		rows.put("theater_code", theater_code);
		rows.put("seat_row", row);
		return theaterDao.theaterSelectSeatColumn(rows);
	}
}
