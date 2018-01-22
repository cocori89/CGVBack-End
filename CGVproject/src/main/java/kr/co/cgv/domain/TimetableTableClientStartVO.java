package kr.co.cgv.domain;

import java.util.List;

//클라이언트 쪽에서 볼는 상영관 정보 뿌리는 용 2번째(하위)
public class TimetableTableClientStartVO {
	String theater_num;
	List<String> theater_start;
	@Override
	public String toString() {
		return "TimetableTableClientStartVO [theater_code=" + theater_num + ", theater_start=" + theater_start + "]";
	}
	public String getTheater_code() {
		return theater_num;
	}
	public void setTheater_code(String theater_code) {
		this.theater_num = theater_code;
	}
	public List<String> getTheater_start() {
		return theater_start;
	}
	public void setTheater_start(List<String> theater_start) {
		this.theater_start = theater_start;
	}
	
}
