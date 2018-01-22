package kr.co.cgv.domain;


//시간표 DTO
public class TimetableVO {
	private int timetable_code;//상영 시간표 코드
	private String site_code;//사이트(지점) 정보 코드
	private String timetable_date;//시간표 날짜
	private String theater_code;//상영관 정보 코드
	private String timetable_start;//영화  상영 시작 시간
	private String timetable_end;// 영화 상영 종료 시간
	private String movie_code;// 영화 정보 코드
	private String movie_title;// 영화 정보 코드
	private String timetable_order;//영화 상영 차수 

	
	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public int getTimetable_code() {
		return timetable_code;
	}

	public void setTimetable_code(int timetable_code) {
		this.timetable_code = timetable_code;
	}

	public String getSite_code() {
		return site_code;
	}

	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}

	public String getTimetable_date() {
		return timetable_date;
	}

	public void setTimetable_date(String timetable_date) {
		this.timetable_date = timetable_date;
	}

	public String getTheater_code() {
		return theater_code;
	}

	public void setTheater_code(String theater_code) {
		this.theater_code = theater_code;
	}

	public String getTimetable_start() {
		return timetable_start;
	}

	public void setTimetable_start(String timetable_start) {
		this.timetable_start = timetable_start;
	}

	public String getTimetable_end() {
		return timetable_end;
	}

	public void setTimetable_end(String timetable_end) {
		this.timetable_end = timetable_end;
	}

	public String getMovie_code() {
		return movie_code;
	}

	public void setMovie_code(String movie_code) {
		this.movie_code = movie_code;
	}

	public String getTimetable_order() {
		return timetable_order;
	}

	public void setTimetable_order(String timetable_order) {
		this.timetable_order = timetable_order;
	}

	@Override
	public String toString() {
		return "TImetableVO [timetable_code=" + timetable_code + ", site_code=" + site_code + ", timetable_date="
				+ timetable_date + ", theater_code=" + theater_code + ", timetable_start=" + timetable_start
				+ ", timetable_end=" + timetable_end + ", movie_code=" + movie_code + ", timetable_order="
				+ timetable_order + "]";
	}

}
