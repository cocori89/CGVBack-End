package kr.co.cgv.dao;

import java.util.List;

import kr.co.cgv.domain.NoticeVO;

public interface NoticeDao {

	//클라이언트
	public List<NoticeVO> noticeSelectIndex();//공지사항 중 주요 공지사항만 index에서 정보 불러 오기 
	public List<NoticeVO> noticeSelectList(int startnum); //공지사항 리스트 블러 오기 
	public int noticeCount();// 공지사항 개수 구하기 
	
	public NoticeVO noticeSelectContent(int notice_code);//공지사항 상세보기
	public void noticeUpdateHit(int notice_code);// 조회수 증가 

	//관리자 
	public List<NoticeVO> noticeSelectAll();// 관리자가 공지사항 모두 불러 오기 
	public List<NoticeVO> noticeSelectKind(String kind);// 관리자가 공지사항을 종류로 검색하여 정렬
	public List<NoticeVO> noticeSelectTilte(String title);// 관리자가 공지사항을 제목으로 검색하여 정렬
	public int noticeInsert(NoticeVO noticeVO);// 관리자가 공지사항 등록
	public int noticeUpdate(NoticeVO noticeVO);// 관리자가 공지사항 수정
	public int noticeDelete(int notice_code);// 관리자가 공지사항 삭제
	
}
