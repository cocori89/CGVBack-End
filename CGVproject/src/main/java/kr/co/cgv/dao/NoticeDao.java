package kr.co.cgv.dao;

import java.util.List;

import kr.co.cgv.domain.NoticeVO;

public interface NoticeDao {
	public List<NoticeVO> noticeSelectIndex();//공지사항 중 주요 공지사항만 index에서 정보 불러 오기 
	public List<NoticeVO> noticeSelectList(int startnum); //공지사항 리스트 블러 오기 
	public int noticeCount();// 공지사항 개수 구하기 
	
	public NoticeVO noticeSelectContent(int notice_code);//공지사항 상세보기
	public void noticeUpdateHit(int notice_code);// 조회수 증가 
	
	
}
