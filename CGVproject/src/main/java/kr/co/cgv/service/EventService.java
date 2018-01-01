package kr.co.cgv.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.cgv.domain.EventVO;

public interface EventService {
	/*클라이언트*/
	public List<EventVO> eventSelectSpecail();// 스폐셜 이벤트 정보 불러 오기
	public List<EventVO> eventSelectNormal();// 일반 이벤트 정보 불러 오기 
	/*관리자*/
	public int eventInsert(MultipartHttpServletRequest request);//관리자 이벤트 정보 등록
	public List<EventVO> eventSelectAll();//관리자가 이벤트 모든 정보 요청
	public List<EventVO> eventSeletTitle(String title);//관리자가 이벤트 정보 제목으로 검색
	public EventVO eventSelectCode(int event_code);//관리자가 코드를 참조하여 이벤트 가져오기 (클라이언트 공용)
	public int eventUpdate(MultipartHttpServletRequest request);//이벤트 정보 수정 수행
	public int eventDelete(int event_code);//이벤트 정보 삭제 

}
