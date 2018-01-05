package kr.co.cgv.domain;

public class SeatVO {
	private int	seat_code;
	private String theater_code;
	private String seat_row;
	private String seat_column;
	public int getSeat_code() {
		return seat_code;
	}
	public void setSeat_code(int seat_code) {
		this.seat_code = seat_code;
	}
	public String getTheater_code() {
		return theater_code;
	}
	public void setTheater_code(String theater_code) {
		this.theater_code = theater_code;
	}
	public String getSeat_row() {
		return seat_row;
	}
	public void setSeat_row(String seat_row) {
		this.seat_row = seat_row;
	}
	public String getSeat_column() {
		return seat_column;
	}
	public void setSeat_column(String seat_column) {
		this.seat_column = seat_column;
	}
	@Override
	public String toString() {
		return "SeatVO [seat_code=" + seat_code + ", theater_code=" + theater_code + ", seat_row=" + seat_row
				+ ", seat_column=" + seat_column + "]";
	}
	
}
