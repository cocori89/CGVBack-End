package kr.co.cgv.domain;

public class CouponVO {

	private int coupon_code;// 쿠폰 코드
	private String coupon_price; // 쿠폰 할인 가격
	private String member_id; // 쿠폰 소유 아이디 
	private String coupon_end;// 쿠폰 사용 기간
	private String coupon_use;// 쿠폰 사용 여부
	
	@Override
	public String toString() {
		return "CouponVO [coupon_code=" + coupon_code + ", coupon_price=" + coupon_price + ", member_id=" + member_id
				+ ", coupon_end=" + coupon_end + ", coupon_use=" + coupon_use + "]";
	}
	public int getCoupon_code() {
		return coupon_code;
	}
	public void setCoupon_code(int coupon_code) {
		this.coupon_code = coupon_code;
	}
	public String getCoupon_price() {
		return coupon_price;
	}
	public void setCoupon_price(String coupon_price) {
		this.coupon_price = coupon_price;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getCoupon_end() {
		return coupon_end;
	}
	public void setCoupon_end(String coupon_end) {
		this.coupon_end = coupon_end;
	}
	public String getCoupon_use() {
		return coupon_use;
	}
	public void setCoupon_use(String coupon_use) {
		this.coupon_use = coupon_use;
	}
	
	
}
