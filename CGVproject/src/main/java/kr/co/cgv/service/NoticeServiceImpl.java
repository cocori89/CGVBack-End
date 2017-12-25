package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.jdbc.Sql;

import kr.co.cgv.dao.NoticeDao;
import kr.co.cgv.domain.NoticeVO;

@Service	
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	NoticeDao noticeDao;
	
	/*클라이언트----------------------------------------------*/
	// 공지사항 중 중요한 공지사항 index에 불러오기 
	@Override
	public List<NoticeVO> noticeSelectIndex() {
		return noticeDao.noticeSelectIndex();
	}
	
	//공지사항 리스트 불러오기 
	@Override
	public List<NoticeVO> noticeSelectList(int startnum) {
		return noticeDao.noticeSelectList(startnum);
	}

	//공지사항 개수 구하기 
	@Override
	public int noticeCount() {
		return noticeDao.noticeCount();
	}

	// 페이지 블락 구하기
	@Override
	public int noticePageNum() {
		int noticeTotal= noticeDao.noticeCount();
		int pageBlock = (int)Math.ceil((double)noticeTotal/10);// 총개수에서 나눈다
		return pageBlock;
	}

	//공지사항 상체 보기 
	@Override
	public NoticeVO noticeSelectContent(int notice_code) {
		NoticeVO noticeVO = noticeDao.noticeSelectContent(notice_code);
		String content = noticeVO.getNotice_content();
		content = content.replace( "</br>","\r\n");
		noticeVO.setNotice_content(content);
//		return noticeDao.noticeSelectContent(notice_code);
		return noticeVO;
	}
	//조회수 증가 
	@Override
	public void noticeUpdateHit(int notice_code) {
		noticeDao.noticeUpdateHit(notice_code);
	}

	
	/*관리자-----------------------------------------------------*/
	//관리자가 공지사항 모든 정보 불러 오기 
	@Override
	public List<NoticeVO> noticeSelectAll() {
		return noticeDao.noticeSelectAll();
	}

	// 관리자가 공지사항 종류별로 검색하여 불러 오기 
	@Override
	public List<NoticeVO> noticeSelectKind(String kind) {
		return noticeDao.noticeSelectKind(kind);
	}
	
	// 관리자가 공지사항 이름으로 검색하여 불러 오기 
	@Override
	public List<NoticeVO> noticeSelectTitle(String title) {
		return noticeDao.noticeSelectTilte(title);
	}
	
	//관리자가 공지사항 등록
	@Override
	public int noticeInsert(HttpServletRequest request) {
		NoticeVO noticeVO = new NoticeVO();
		// 게시판 줄바꿈 처리
		String content = request.getParameter("content");
		content = content.replace("\r\n", "</br>");
		
		noticeVO.setNotice_title(request.getParameter("title"));
		noticeVO.setNotice_writer(request.getParameter("writer"));
		noticeVO.setNotice_kind(request.getParameter("kind"));
		noticeVO.setNotice_use(request.getParameter("use"));
		noticeVO.setNotice_content(content);
		
		return noticeDao.noticeInsert(noticeVO);
	}

	// 관리자가 공지사항 수정
	@Override
	public int noticeUpdate(HttpServletRequest request) {
		NoticeVO noticeVO =  new NoticeVO();
		// 게시판 줄바꿈 처리
		String content = request.getParameter("content");
		content = content.replace("\r\n", "</br>");
		
		noticeVO.setNotice_title(request.getParameter("title"));
		noticeVO.setNotice_writer(request.getParameter("writer"));
		noticeVO.setNotice_kind(request.getParameter("kind"));
		noticeVO.setNotice_use(request.getParameter("use"));
		noticeVO.setNotice_content(content);
		
		return noticeDao.noticeUpdate(noticeVO);
	}
	
	// 관리자가 공지사항 삭제 
	@Override
	public int noticeDelete(int notice_code) {
		return noticeDao.noticeDelete(notice_code);
	}
}
