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

	/*클라이언트-------------------------------------*/
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

	//조회수 증가 
	@Override
	public void noticeUpdateHit(int notice_code) {
		sqlSession.update("notice.noticeUpdateHit", notice_code);
	}

	/*관리자-----------------------------------------------------------*/
	// 관리자가 공지사항 정보 모두 가져오기
	@Override
	public List<NoticeVO> noticeSelectAll() {
		return sqlSession.selectList("notice.noticeSelectAll");
	}

	// 관리자가 공지사항 종류로 검색하여 정렬
	@Override
	public List<NoticeVO> noticeSelectKind(String kind) {
		return sqlSession.selectList("notice.noticeSelectKind", kind);
	}

	//관리자가 공지사항을 이름으로 검색하여 정렬
	@Override
	public List<NoticeVO> noticeSelectTilte(String title) {
		return sqlSession.selectList("notice.noticeSelectTitle", title);
	}

	//관리자가 공지사항 등록
	@Override
	public int noticeInsert(NoticeVO noticeVO) {
		return sqlSession.insert("notice.noticeInsert", noticeVO);
	}

	//관리자가 공지사항 수정
	@Override
	public int noticeUpdate(NoticeVO noticeVO) {
		return sqlSession.update("notice.notiecUpdate", noticeVO);
	}

	//관리자가 공지사항 삭제
	@Override
	public int noticeDelete(int notice_code) {
		return sqlSession.delete("notice.noticeDelete", notice_code);
	}

	
}
