package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.NoticeVO;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	SqlSession sqlSession;

	// 공지사항 중 중요한 사항 가져 오기 
	@Override
	public List<NoticeVO> noticeSelectIndex() {
		return sqlSession.selectList("notice.noticeSelectIndex");
	}

	//공지사항 리스트 불러오기 
	@Override
	public List<NoticeVO> noticeSelectList(int startnum) {
		return sqlSession.selectList("notice.noticeSelectPaging",startnum);
	}

	//공지사항 개수 구하기 
	@Override
	public int noticeCount() {
		return sqlSession.selectOne("notice.noticeCount");
	}

	//공지사항 상세보기 
	@Override
	public NoticeVO noticeSelectContent(int notice_code) {
		return sqlSession.selectOne("notice.noticeSelectContent",notice_code);
	}

	@Override
	public void noticeUpdateHit(int notice_code) {
		sqlSession.update("notice.noticeUpdateHit", notice_code);
	}

}
