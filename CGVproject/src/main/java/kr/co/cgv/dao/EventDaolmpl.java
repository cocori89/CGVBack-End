package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.EventVO;

//이벤트 저장소
@Repository
public class EventDaolmpl implements EventDao {

	@Autowired
	SqlSession sqlSession;
	
	/*클라이언트------------------------------*/
	//스폐셜 이벤트 정보 불러 오기 
	@Override
	public List<EventVO> eventSelectSpecail() {
		return sqlSession.selectList("event.eventSelectSpecial");
	}

	// 일번 이벤트 정보 불러 오기
	@Override
	public List<EventVO> eventSelectNormal() {
		return sqlSession.selectList("event.eventSelectNormal");
	}

	/*관리자----------------------------------*/
	//관리자 이벤트 정보 등록
	@Override
	public int eventInsert(EventVO eventVO) {
		return sqlSession.insert("event.eventInsert", eventVO);
	}

	//관리자가 이벤트 모든 정보 요청	
	@Override
	public List<EventVO> eventSelectAll() {
		return sqlSession.selectList("event.eventSelectAll");
	}

	//관리자가 이벤트 정보 제목으로 검색
	@Override
	public List<EventVO> eventSelectTitle(String title) {
		return sqlSession.selectList("event.eventSelectTitle", title);
	}

	//관리자가 코드를 참조 하여 이벤트 정보 가져 오기(클라이언트 공용)
	@Override
	public EventVO eventSelectCode(int event_code) {
		return sqlSession.selectOne("event.eventSelectCode", event_code);
	}

	//관리자가 이벤트 정보를 수정 수행
	@Override
	public int eventUpdate(EventVO eventVO) {
		return sqlSession.update("event.eventUpdate", eventVO);
	}

	//관리자 이벤트 정보 삭제
	@Override
	public int eventDelete(int event_code) {
		return sqlSession.delete("event.eventDelete", event_code);
	}

}
