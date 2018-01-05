package kr.co.cgv.domain;

//가격 표 
public class PricelistVO {
	private String pricelist_code;//가격표 코드
	private String pricelist_kind;//가격표 종류
	private String pricelist_time;//가격표 시간대
	private String pricelist_date;//가격표 평일/주말
	private String pricelist_grade;//가격표 일반/청소년
	private String pricelist_price;//가격표 가격 

	@Override
	public String toString() {
		return "PricelistVO [pricelist_code=" + pricelist_code + ", pricelist_kind=" + pricelist_kind
				+ ", pricelist_time=" + pricelist_time + ", pricelist_date=" + pricelist_date + ", pricelist_grade="
				+ pricelist_grade + ", pricelist_price=" + pricelist_price + "]";
	}

	public String getPricelist_code() {
		return pricelist_code;
	}

	public void setPricelist_code(String pricelist_code) {
		this.pricelist_code = pricelist_code;
	}

	public String getPricelist_kind() {
		return pricelist_kind;
	}

	public void setPricelist_kind(String pricelist_kind) {
		this.pricelist_kind = pricelist_kind;
	}

	public String getPricelist_time() {
		return pricelist_time;
	}

	public void setPricelist_time(String pricelist_time) {
		this.pricelist_time = pricelist_time;
	}

	public String getPricelist_date() {
		return pricelist_date;
	}

	public void setPricelist_date(String pricelist_date) {
		this.pricelist_date = pricelist_date;
	}

	public String getPricelist_grade() {
		return pricelist_grade;
	}

	public void setPricelist_grade(String pricelist_grade) {
		this.pricelist_grade = pricelist_grade;
	}

	public String getPricelist_price() {
		return pricelist_price;
	}

	public void setPricelist_price(String pricelist_price) {
		this.pricelist_price = pricelist_price;
	}
}
