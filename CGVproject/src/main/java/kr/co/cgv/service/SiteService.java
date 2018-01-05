package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.SiteVO;

public interface SiteService {
	//클라이언트
	//관리자 
	public int siteInsert(HttpServletRequest request);//관리자가 사이트 정보등록
	public List<SiteVO> siteSelectAll();//관리자가 사이트 모든 정보 불러 오기
	public SiteVO siteSelectCode(String site_code);//관리자가 사이트 코드로 정보 불러 오기 (클라이언트 공용)
	public int siteUpdate(HttpServletRequest request);//관라자 사이트 정보 수정
	public int siteDelete(String site_code);//관리자가 사이트 코드로 정보 삭제하기
	public List<SiteVO> siteSelectCodeSearch(String code);// 관리자가 사이트정보로 코드로 검색
}
