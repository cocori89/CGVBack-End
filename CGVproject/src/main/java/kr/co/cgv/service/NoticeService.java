package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.NoticeVO;

public interface NoticeService {
	
	// 클라이언트 
	public List<NoticeVO> noticeSelectIndex(); // 공지사항 중 중요한 공지사항 index에 불러오기 
	public List<NoticeVO> noticeSelectList(int startnum); // 공지사항 리스트 불러오기
	public int noticeCount();// 공지사항 개수 구하기 
	public int noticePageNum();// 페이지 블락 구한기
	
	public NoticeVO noticeSelectContent(int notice_code);//공지사항 상세보기 
	public void noticeUpdateHit(int notice_code);// 조회수 증가 
	
	// 관리자 
	public List<NoticeVO> noticeSelectAll();// 관리자가 공지사항 모두 불러 오기
	public List<NoticeVO> noticeSelectKind(String kind);// 관리자가 공지사항을 종류로 검색하여 정렬
	public List<NoticeVO> noticeSelectTitle(String title);// 관리자가 공지사항을 이름으로 검색하여 정렬
	public int noticeInsert(HttpServletRequest request);// 관리자가 공지사항 등록
	public int noticeUpdate(HttpServletRequest request);// 관리자가 공지사항 수정
	public int noticeDelete(int notice_code);// 관리자가 공지사항 삭제
}
