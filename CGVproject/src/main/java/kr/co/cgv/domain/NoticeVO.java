package kr.co.cgv.domain;

public class NoticeVO {

	private String notice_code;
	private String notice_kind;
	private String notice_writer;
	private String notice_date;
	private String notice_title;
	private String notice_content;
	private String notice_use;
	private String notice_hit;


	@Override
	public String toString() {
		return "NoticeVO [notice_code=" + notice_code + ", notice_kind=" + notice_kind + ", notice_writer="
				+ notice_writer + ", notice_date=" + notice_date + ", notice_title=" + notice_title
				+ ", notice_content=" + notice_content + ", notice_use=" + notice_use + "]";
	}

	public String getNotice_code() {
		return notice_code;
	}

	public void setNotice_code(String notice_code) {
		this.notice_code = notice_code;
	}

	public String getNotice_kind() {
		return notice_kind;
	}

	public void setNotice_kind(String notice_kind) {
		this.notice_kind = notice_kind;
	}

	public String getNotice_writer() {
		return notice_writer;
	}

	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}

	public String getNotice_date() {
		return notice_date;
	}

	public void setNotice_date(String notice_date) {
		this.notice_date = notice_date;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	public String getNotice_use() {
		return notice_use;
	}

	public void setNotice_use(String notice_use) {
		this.notice_use = notice_use;
	}

	public String getNotice_hit() {
		return notice_hit;
	}

	public void setNotice_hit(String notice_hit) {
		this.notice_hit = notice_hit;
	}

}
