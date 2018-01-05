package kr.co.cgv.domain;

// 상영관
public class TheaterVO {
	private String theater_code;// 상영관 코드
	private String site_code;// 사이트 코드
	private String theater_num;// 상영관 관 번호 
	private String theater_people;// 상영관 좌석수
	private String theater_kind;// 상영관 종류

	public String getTheater_code() {
		return theater_code;
	}

	public void setTheater_code(String theater_code) {
		this.theater_code = theater_code;
	}

	public String getSite_code() {
		return site_code;
	}

	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}

	public String getTheater_num() {
		return theater_num;
	}

	public void setTheater_num(String theater_num) {
		this.theater_num = theater_num;
	}

	public String getTheater_people() {
		return theater_people;
	}

	public void setTheater_people(String theater_people) {
		this.theater_people = theater_people;
	}

	public String getTheater_kind() {
		return theater_kind;
	}

	public void setTheater_kind(String theater_kind) {
		this.theater_kind = theater_kind;
	}

	@Override
	public String toString() {
		return "TheaterVO [theater_code=" + theater_code + ", site_code=" + site_code + ", theater_num=" + theater_num
				+ ", theater_people=" + theater_people + ", theater_kind=" + theater_kind + ", getTheater_code()="
				+ getTheater_code() + ", getSite_code()=" + getSite_code() + ", getTheater_num()=" + getTheater_num()
				+ ", getTheater_people()=" + getTheater_people() + ", getTheater_kind()=" + getTheater_kind()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
