package kr.co.cgv.domain;


//회원 정보  DTO
public class MemberVO {
	private String member_id;//아이디
	private String member_pw;//비밀번호
	private String member_name;//이름
	private String member_phone;//전화번호
	private String member_addr;//주소
	private String member_rating;//회원등급
	private String member_email;//이메일
	private String member_date;//가입날짜

	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", member_pw=" + member_pw + ", member_name=" + member_name
				+ ", member_phone=" + member_phone + ", member_addr=" + member_addr + ", member_rating=" + member_rating
				+ ", member_email=" + member_email + ", member_date=" + member_date + "]";
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}

	public String getMember_addr() {
		return member_addr;
	}

	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}

	public String getMember_rating() {
		return member_rating;
	}

	public void setMember_rating(String member_rating) {
		this.member_rating = member_rating;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_date() {
		return member_date;
	}

	public void setMember_date(String member_date) {
		this.member_date = member_date;
	}

}
