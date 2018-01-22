package kr.co.cgv.domain;

import java.util.List;

// 클라이언트 쪽에서 볼는 상영관 정보 뿌리는 용 1번째(상위)
public class TimetableTableClientVO {
	MovieVO movieVO;//상영관 정보
	List<TimetableTableClientStartVO> timetableVO;// 상영관에 대한 상영정보 
	@Override
	public String toString() {
		return "TimetableTableClientVO [movieVO=" + movieVO + ", timetableVO=" + timetableVO + "]";
	}
	public MovieVO getMovieVO() {
		return movieVO;
	}
	public void setMovieVO(MovieVO movieVO) {
		this.movieVO = movieVO;
	}
	public List<TimetableTableClientStartVO> getTimetableVO() {
		return timetableVO;
	}
	public void setTimetableVO(List<TimetableTableClientStartVO> timetableVO) {
		this.timetableVO = timetableVO;
	}
	

	
}
