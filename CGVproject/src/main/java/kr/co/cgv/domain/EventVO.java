package kr.co.cgv.domain;

//이벤트
public class EventVO {
	private int event_code;// 이벤트 코드
	private String event_title;// 이벤트 제목
	private String event_somenail;// 이벤트 섬네일이미지 파일 이름
	private String event_contentimg;// 이벤트 내용 이미지
	private String event_startdate;// 이벤트 시작 날
	private String event_enddate;// 이벤트 끝나는 날
	private String event_kind;// 이벤트의 종류
	private String event_important;// 이벤트의 중요도 (일반, 스페셜 )
	public int getEvent_code() {
		return event_code;
	}
	public void setEvent_code(int event_code) {
		this.event_code = event_code;
	}
	public String getEvent_title() {
		return event_title;
	}
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	public String getEvent_somenail() {
		return event_somenail;
	}
	public void setEvent_somenail(String event_somenail) {
		this.event_somenail = event_somenail;
	}
	public String getEvent_contentimg() {
		return event_contentimg;
	}
	public void setEvent_contentimg(String event_contentimg) {
		this.event_contentimg = event_contentimg;
	}
	public String getEvent_startdate() {
		return event_startdate;
	}
	public void setEvent_startdate(String event_startdate) {
		this.event_startdate = event_startdate;
	}
	public String getEvent_enddate() {
		return event_enddate;
	}
	public void setEvent_enddate(String event_enddate) {
		this.event_enddate = event_enddate;
	}
	public String getEvent_kind() {
		return event_kind;
	}
	public void setEvent_kind(String event_kind) {
		this.event_kind = event_kind;
	}
	public String getEvent_important() {
		return event_important;
	}
	public void setEvent_important(String event_important) {
		this.event_important = event_important;
	}
	@Override
	public String toString() {
		return "EventVO [event_code=" + event_code + ", event_title=" + event_title + ", event_somenail="
				+ event_somenail + ", event_contentimg=" + event_contentimg + ", event_startdate=" + event_startdate
				+ ", event_enddate=" + event_enddate + ", event_kind=" + event_kind + ", event_important="
				+ event_important + "]";
	}

	
}
