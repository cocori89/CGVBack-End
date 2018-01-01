package kr.co.cgv.dao;

import java.util.List;

import kr.co.cgv.domain.EventVO;

//이벤트 저장소 인터페이스
public interface EventDao {
	/*클라이언트*/
	public List<EventVO> eventSelectSpecail();// 스폐셜 이벤트 정보 불러 오기
	public List<EventVO> eventSelectNormal();// 일반 이벤트 정보 불러 오기 
	/*관리자*/
	public int eventInsert(EventVO eventVO);//관리자 이벤트 정보 등록
	public List<EventVO> eventSelectAll();//관리자가 이벤트 모든 정보 요청
	public List<EventVO> eventSelectTitle(String title);//관리자가 이벤트 정보 제목으로 검색
	public EventVO eventSelectCode(int event_code);//관리자가 코드를 참조하여 이벤트 가져오기 (클라이언트 공용)
	public int eventUpdate(EventVO eventVO);// 관리자가 이벤트 정보를 수정
	public int eventDelete(int event_code);// 관리자가 이벤트 정보 삭제
}
