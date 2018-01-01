package kr.co.cgv.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.cgv.dao.EventDao;
import kr.co.cgv.domain.EventVO;

//이벤트 서비스
@Service
public class EventServiceImpl implements EventService {

	@Autowired
    EventDao eventDao;
	
	/*클라이언트*/
	
	//스폐셜 이벤트 정보 가져오기 
	@Override
	public List<EventVO> eventSelectSpecail() {
		return eventDao.eventSelectSpecail();
	}
	//일반이벤트 정보 가져오기
	@Override
	public List<EventVO> eventSelectNormal() {
		return eventDao.eventSelectNormal();
	}
	
	
	/*관리자*/
	// 관리자 이벤트 정보 등록
	@Override
	public int eventInsert(MultipartHttpServletRequest request) {
		EventVO eventVO = new EventVO();
		MultipartFile somenailFile = request.getFile("somenail");
		MultipartFile contentimgFile = request.getFile("contentimg");
		// 파일 이름 얻기
		String somenailFileName = somenailFile.getOriginalFilename();
		String contentFileName = contentimgFile.getOriginalFilename();
		//확장자 뽑기 
		String[] fileExtension = new String[2];
		fileExtension[0] = somenailFileName.substring(somenailFileName.indexOf(".")+1,somenailFileName.length());
		fileExtension[1] = contentFileName.substring(contentFileName.indexOf(".")+1, contentFileName.length());
		//확장자 유효성 검사
		for(int i=0; i<2; i++){
			fileExtension[i]=fileExtension[i].toLowerCase();
			if(fileExtension[i].equals("jpg")||fileExtension[i].equals("tiff")||
					fileExtension[i].equals("psd")||fileExtension[i].equals("png")||
					fileExtension[i].equals("bmp")||fileExtension[i].equals("gif")){
				System.out.println( (i+1)+"번째파일 정상적인 이미지 파일입니다. ");
			}else {
				System.out.println((i+1)+"번째파일은 위험성있는 파일 이미지 입니다.  ");
				return 0;
			}
		}
		
		//저장 경로 정하기 
		String path = request.getSession().getServletContext().getRealPath("resources/img/event/");
		String somenailSaveFile = path +"/"+ somenailFileName;
		String contentimgSaveFile= path +"/"+ contentFileName;
		try {
			somenailFile.transferTo(new File(somenailSaveFile));
			contentimgFile.transferTo(new File(contentimgSaveFile));
		} catch (Exception e) {
			System.out.println("이미지 파일 저장오류" + e);
		}
		
		eventVO.setEvent_title(request.getParameter("title"));
		eventVO.setEvent_somenail(somenailFileName);
		eventVO.setEvent_contentimg(contentFileName);
		eventVO.setEvent_startdate(request.getParameter("startdate"));
		eventVO.setEvent_enddate(request.getParameter("enddate"));
		eventVO.setEvent_kind(request.getParameter("kind"));
		eventVO.setEvent_important(request.getParameter("important"));
		System.out.println(eventVO.toString());
		return eventDao.eventInsert(eventVO);
	}

	// 관리자가 이벤트 모든 정보 요청 
	@Override
	public List<EventVO> eventSelectAll() {
		return eventDao.eventSelectAll();
	}

	//관리자가 이벤트 정보 제목으로 검색
	@Override
	public List<EventVO> eventSeletTitle(String title) {
		return eventDao.eventSelectTitle(title);
	}
	
	//관리자가 코드를 참조하여 이벤트 정보 가져 오기(클라이언트 공용)
	@Override
	public EventVO eventSelectCode(int event_code) {
		return eventDao.eventSelectCode(event_code);
	}

	@Override
	public int eventUpdate(MultipartHttpServletRequest request) {
		EventVO eventVO = new EventVO();
		MultipartFile somenailFile = request.getFile("somenail");
		MultipartFile contentimgFile = request.getFile("contentimg");
		// 파일 이름 얻기
		String somenailFileName = somenailFile.getOriginalFilename();
		String contentFileName = contentimgFile.getOriginalFilename();
		//확장자 뽑기 
		String[] fileExtension = new String[2];
		fileExtension[0] = somenailFileName.substring(somenailFileName.indexOf(".")+1,somenailFileName.length());
		fileExtension[1] = contentFileName.substring(contentFileName.indexOf(".")+1, contentFileName.length());
		//확장자 유효성 검사
		for(int i=0; i<2; i++){
			fileExtension[i]=fileExtension[i].toLowerCase();
			if(fileExtension[i].equals("jpg")||fileExtension[i].equals("tiff")||
					fileExtension[i].equals("psd")||fileExtension[i].equals("png")||
					fileExtension[i].equals("bmp")||fileExtension[i].equals("gif")){
				System.out.println( (i+1)+"번째파일 정상적인 이미지 파일입니다. ");
			}else {
				System.out.println((i+1)+"번째파일은 위험성있는 파일 이미지 입니다.  ");
				return 0;
			}
		}
		
		//저장 경로 정하기 
		String path = request.getSession().getServletContext().getRealPath("resources/img/event/");
		String somenailSaveFile = path +"/"+ somenailFileName;
		String contentimgSaveFile= path +"/"+ contentFileName;
		try {
			somenailFile.transferTo(new File(somenailSaveFile));
			contentimgFile.transferTo(new File(contentimgSaveFile));
		} catch (Exception e) {
			System.out.println("이미지 파일 저장오류" + e);
		}
		eventVO.setEvent_code(Integer.parseInt(request.getParameter("event_code")));
		eventVO.setEvent_title(request.getParameter("title"));
		eventVO.setEvent_somenail(somenailFileName);
		eventVO.setEvent_contentimg(contentFileName);
		eventVO.setEvent_startdate(request.getParameter("startdate"));
		eventVO.setEvent_enddate(request.getParameter("enddate"));
		eventVO.setEvent_kind(request.getParameter("kind"));
		eventVO.setEvent_important(request.getParameter("important"));
		System.out.println(eventVO.toString());
		return eventDao.eventUpdate(eventVO);
	}

	// 관리자가 이벤트 정보 삭제
	@Override
	public int eventDelete(int event_code) {
		return eventDao.eventDelete(event_code);
	}

}
