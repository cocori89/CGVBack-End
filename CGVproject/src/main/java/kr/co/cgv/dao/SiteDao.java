package kr.co.cgv.dao;

import java.util.List;

import kr.co.cgv.domain.SiteVO;

public interface SiteDao {
	//클라이언트 
	//관리자 
	public int siteInsert(SiteVO siteVO);//관리자가 사이트 정보등록
	public List<SiteVO> siteSelectAll();//관리자가 사이트 모든 정보 불러 오기
	public SiteVO siteSelectCode(String site_code);//관리자가 사이트 코드로 정보 불러 오기 (클라이언트 공용)
	public int siteUpdate(SiteVO siteVO);//관라자 사이트 정보 수정
	public int siteDelete(String site_code);//관리자가 사이트 코드로 정보 삭제하기
	public List<SiteVO> siteSelectCodeSearch(String code);// 관리자가 사이트정보로 코드로 검색
}
