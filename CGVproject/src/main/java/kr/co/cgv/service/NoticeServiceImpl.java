package kr.co.cgv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.NoticeDao;
import kr.co.cgv.domain.NoticeVO;

@Service	
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	NoticeDao noticeDao;

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
		return noticeDao.noticeSelectContent(notice_code);
	}

	@Override
	public void noticeUpdateHit(int notice_code) {
		noticeDao.noticeUpdateHit(notice_code);
	}
}
