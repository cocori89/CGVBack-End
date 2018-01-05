package kr.co.cgv.domain;

//사이트(지점)
public class SiteVO {
	private String site_code;// 사이트 코드 
	private String site_phone;// 사이트 전화 번호 
	private String site_addr;// 사이트 주소 
	private String site_num;// 사이트 상영관 개수
	private String site_manager;//사이트 담당 매니져 

	public String getSite_code() {
		return site_code;
	}

	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}

	public String getSite_phone() {
		return site_phone;
	}

	public void setSite_phone(String site_phone) {
		this.site_phone = site_phone;
	}

	public String getSite_addr() {
		return site_addr;
	}

	public void setSite_addr(String site_addr) {
		this.site_addr = site_addr;
	}

	public String getSite_num() {
		return site_num;
	}

	public void setSite_num(String site_num) {
		this.site_num = site_num;
	}

	public String getSite_manager() {
		return site_manager;
	}

	public void setSite_manager(String site_manager) {
		this.site_manager = site_manager;
	}

	@Override
	public String toString() {
		return "SiteVO [site_code=" + site_code + ", site_phone=" + site_phone + ", site_addr=" + site_addr
				+ ", site_num=" + site_num + ", site_manager=" + site_manager + "]";
	}

}
