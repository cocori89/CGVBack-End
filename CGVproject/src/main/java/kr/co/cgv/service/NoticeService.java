package kr.co.cgv.service;

import java.util.List;

import kr.co.cgv.domain.NoticeVO;

public interface NoticeService {

	public List<NoticeVO> noticeSelectIndex(); // 공지사항 중 중요한 공지사항 index에 불러오기 
	public List<NoticeVO> noticeSelectList(int startnum); // 공지사항 리스트 불러오기
	public int noticeCount();// 공지사항 개수 구하기 
	public int noticePageNum();// 페이지 블락 구한기
	
	public NoticeVO noticeSelectContent(int notice_code);//공지사항 상세보기 
	public void noticeUpdateHit(int notice_code);// 조회수 증가 
}
