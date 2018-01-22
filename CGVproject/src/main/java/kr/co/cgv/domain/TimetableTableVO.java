package kr.co.cgv.domain;

import java.util.List;

// 관리자 쪽에서 시간표 테이블을 관리자 쪽에서 출력하기 위해 만든 DTO입니다. 
public class TimetableTableVO {
	TheaterVO theaterVO;//상영관 정보
	List<TimetableVO> timetableVO;// 상영관에 대한 상영정보 
	
	public TheaterVO getTheaterVO() {
		return theaterVO;
	}
	public void setTheaterVO(TheaterVO theaterVO) {
		this.theaterVO = theaterVO;
	}
	public List<TimetableVO> getTimetableVO() {
		return timetableVO;
	}
	public void setTimetableVO(List<TimetableVO> timetableVO) {
		this.timetableVO = timetableVO;
	}
	@Override
	public String toString() {
		return "TimetableTableVO [theaterVO=" + theaterVO + ", timetableVO=" + timetableVO + "]";
	}
	 
}
