package kr.co.cgv.domain;

//예약 정보 
public class ReservationVO {
	private int reservation_code;//예약 코드 z
	private String site_code;// 사이트 코드 z
	private String theater_code;//상영관 코드
	private String reservation_adult; // 어른 인원
	private String reservation_teenager; // 청소년 인원
	private String reservation_people; // 예약 총 인원
	private String timetable_date;// 상영 날짜
	private String timetable_start;// 예약 영화 시작 시간
	private String timetable_end;// 예약 영화  끝나는 시간
	private String movie_title;// 영화 제목
	private String timetable_day;//  예약요일
	private String theater_kind;// 영화 관 종류
	private String theater_num; // 영화 관 번호
	private String reservation_seat;// 좌석 
	private String reservation_price;// 예약 총 가격
	private String movie_grade;// 영화 등급ㅋ
	private String member_id; // 예약자 아이디
	private String reservation_date;// 예약한 시점
	private String movie_poster;//** 예약 확인시에 출력이 필요하여 저장하는것.(영화 포스터 파일명: 예약 화면에서 영화 포스터 사진 보여주기)
	private int movie_code;//** 예약 확인시에 출력이 필요하여 저장하는것.(영화 코드 :  예약 화면에서 영화 코드로 넘어갈때 사용 한다. )
	private int reservation_star;//본영화 평가 유무 
	private int reservation_cancel;//예약 취소 유무
	
	public int getReservation_star() {
		return reservation_star;
	}
	public void setReservation_star(int reservation_star) {
		this.reservation_star = reservation_star;
	}
	public int getReservation_cancel() {
		return reservation_cancel;
	}
	public void setReservation_cancel(int reservation_cancel) {
		this.reservation_cancel = reservation_cancel;
	}
	public int getMovie_code() {
		return movie_code;
	}
	public void setMovie_code(int movie_code) {
		this.movie_code = movie_code;
	}
	public String getMovie_poster() {
		return movie_poster;
	}
	public void setMovie_poster(String movie_poster) {
		this.movie_poster = movie_poster;
	}
	@Override
	public String toString() {
		return "ReservationVO [reservation_code=" + reservation_code + ", site_code=" + site_code + ", theater_code="
				+ theater_code + ", reservation_adult=" + reservation_adult + ", reservation_teenager="
				+ reservation_teenager + ", reservation_people=" + reservation_people + ", timetable_date="
				+ timetable_date + ", timetable_start=" + timetable_start + ", timetable_end=" + timetable_end
				+ ", movie_title=" + movie_title + ", theater_day=" + timetable_day + ", theater_kind=" + theater_kind
				+ ", theater_num=" + theater_num + ", reservation_seat=" + reservation_seat + ", reservation_price="
				+ reservation_price + ", movie_grade=" + movie_grade + ", member_id=" + member_id
				+ ", reservation_date=" + reservation_date + "]";
	}
	public int getReservation_code() {
		return reservation_code;
	}
	public void setReservation_code(int reservation_code) {
		this.reservation_code = reservation_code;
	}
	public String getSite_code() {
		return site_code;
	}
	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}
	public String getTheater_code() {
		return theater_code;
	}
	public void setTheater_code(String theater_code) {
		this.theater_code = theater_code;
	}
	public String getReservation_adult() {
		return reservation_adult;
	}
	public void setReservation_adult(String reservation_adult) {
		this.reservation_adult = reservation_adult;
	}
	public String getReservation_teenager() {
		return reservation_teenager;
	}
	public void setReservation_teenager(String reservation_teenager) {
		this.reservation_teenager = reservation_teenager;
	}
	public String getReservation_people() {
		return reservation_people;
	}
	public void setReservation_people(String reservation_people) {
		this.reservation_people = reservation_people;
	}
	public String getTimetable_date() {
		return timetable_date;
	}
	public void setTimetable_date(String timetable_date) {
		this.timetable_date = timetable_date;
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
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getTimetable_day() {
		return timetable_day;
	}
	public void setTimetable_day(String theater_day) {
		this.timetable_day = theater_day;
	}
	public String getTheater_kind() {
		return theater_kind;
	}
	public void setTheater_kind(String theater_kind) {
		this.theater_kind = theater_kind;
	}
	public String getTheater_num() {
		return theater_num;
	}
	public void setTheater_num(String theater_num) {
		this.theater_num = theater_num;
	}
	public String getReservation_seat() {
		return reservation_seat;
	}
	public void setReservation_seat(String reservation_seat) {
		this.reservation_seat = reservation_seat;
	}
	public String getReservation_price() {
		return reservation_price;
	}
	public void setReservation_price(String reservation_price) {
		this.reservation_price = reservation_price;
	}
	public String getMovie_grade() {
		return movie_grade;
	}
	public void setMovie_grade(String movie_grade) {
		this.movie_grade = movie_grade;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}

}