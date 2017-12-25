package kr.co.cgv.domain;

// 영화정보 DTO
public class MovieVO {
	String movie_code;// 영화 코드
	String movie_title;// 제목
	String movie_director; // 감독
	String movie_producer; // 프르 듀서
	String movie_acter; // 배우
	String movie_genre;// 장르
	String movie_grade; // 상영 등급
	String movie_time; // 상영 시간(런타임)
	String movie_nation;// 영화 만든 국가 국내/해외(나라)
	String movie_site;// 영화 공식 홈페이지
	String movie_date;// 영화 개봉일
	String movie_poster;// 영화 포스터 파일 이름
	String movie_state;// 영화 개봉 전,후,종료
	String movie_plot;// 줄거리
	String movie_star;// 별점

	@Override
	public String toString() {
		return "MovieVO [movie_code=" + movie_code + ", movie_title=" + movie_title + ", movie_director="
				+ movie_director + ", movie_producer=" + movie_producer + ", movie_acter=" + movie_acter
				+ ", movie_genre=" + movie_genre + ", movie_grade=" + movie_grade + ", movie_time=" + movie_time
				+ ", movie_nation=" + movie_nation + ", movie_site=" + movie_site + ", movie_date=" + movie_date
				+ ", movie_poster=" + movie_poster + ", movie_state=" + movie_state + "]";
	}

	public String getMovie_code() {
		return movie_code;
	}

	public void setMovie_code(String movie_code) {
		this.movie_code = movie_code;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public String getMovie_director() {
		return movie_director;
	}

	public void setMovie_director(String movie_director) {
		this.movie_director = movie_director;
	}

	public String getMovie_producer() {
		return movie_producer;
	}

	public void setMovie_producer(String movie_producer) {
		this.movie_producer = movie_producer;
	}

	public String getMovie_acter() {
		return movie_acter;
	}

	public void setMovie_acter(String movie_acter) {
		this.movie_acter = movie_acter;
	}

	public String getMovie_genre() {
		return movie_genre;
	}

	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}

	public String getMovie_grade() {
		return movie_grade;
	}

	public void setMovie_grade(String movie_grade) {
		this.movie_grade = movie_grade;
	}

	public String getMovie_time() {
		return movie_time;
	}

	public void setMovie_time(String movie_time) {
		this.movie_time = movie_time;
	}

	public String getMovie_nation() {
		return movie_nation;
	}

	public void setMovie_nation(String movie_nation) {
		this.movie_nation = movie_nation;
	}

	public String getMovie_site() {
		return movie_site;
	}

	public void setMovie_site(String movie_site) {
		this.movie_site = movie_site;
	}

	public String getMovie_date() {
		return movie_date;
	}

	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}

	public String getMovie_poster() {
		return movie_poster;
	}

	public void setMovie_poster(String movie_poster) {
		this.movie_poster = movie_poster;
	}

	public String getMovie_state() {
		return movie_state;
	}

	public void setMovie_state(String movie_state) {
		this.movie_state = movie_state;
	}

	public String getMovie_plot() {
		return movie_plot;
	}

	public void setMovie_plot(String movie_plot) {
		this.movie_plot = movie_plot;
	}

	public String getMovie_star() {
		return movie_star;
	}

	public void setMovie_star(String movie_star) {
		this.movie_star = movie_star;
	}
}
