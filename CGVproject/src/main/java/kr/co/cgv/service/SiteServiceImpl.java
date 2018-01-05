package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.SiteDao;
import kr.co.cgv.domain.SiteVO;

//사이트(지점)
@Service
public class SiteServiceImpl implements SiteService {
	@Autowired
	SiteDao siteDao;
	
	/*클라이언트*/
	/*관리자*/
	//관리자가 사이트 정보 등록 하기
	@Override
	public int siteInsert(HttpServletRequest request) {
		SiteVO siteVO = new SiteVO();
		siteVO.setSite_code(request.getParameter("code"));
		siteVO.setSite_phone(request.getParameter("phone"));
		siteVO.setSite_addr(request.getParameter("addr"));
		siteVO.setSite_num(request.getParameter("num"));
		siteVO.setSite_manager(request.getParameter("manager"));
		return siteDao.siteInsert(siteVO);
	}

	//관리자가 사이트 정보 모두 가져 오기
	@Override
	public List<SiteVO> siteSelectAll() {
		return siteDao.siteSelectAll();
	}
	//관리자가 사이트정보 코드로 가져오기 (클라이언트와 공용)
	@Override
	public SiteVO siteSelectCode(String site_code) {
		return siteDao.siteSelectCode(site_code);
	}

	// 관리자가 사이트 정보 수정 하기 
	@Override
	public int siteUpdate(HttpServletRequest request) {
		SiteVO siteVO = new SiteVO();
		siteVO.setSite_code(request.getParameter("code"));
		siteVO.setSite_phone(request.getParameter("phone"));
		siteVO.setSite_addr(request.getParameter("addr"));
		siteVO.setSite_num(request.getParameter("num"));
		siteVO.setSite_manager(request.getParameter("manager"));
		return siteDao.siteUpdate(siteVO);
	}

	//관리자가 사이트 정보 코드로 삭제 
	@Override
	public int siteDelete(String site_code) {
		return siteDao.siteDelete(site_code);
	}

	//관리자가 사이트 정보 코드로 검색
	@Override
	public List<SiteVO> siteSelectCodeSearch(String code) {
		return siteDao.siteSelectCodeSearch(code);
	}

}
