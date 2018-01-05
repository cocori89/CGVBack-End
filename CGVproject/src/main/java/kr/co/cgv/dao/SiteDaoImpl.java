package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.SiteVO;
//사이트(지점)
@Repository
public class SiteDaoImpl implements SiteDao{
	
	@Autowired
	SqlSession sqlSession;
	
	/*클라이언트*/
	/*관리자*/
	//관리자가 사이트 정보 등록 하기
	@Override
	public int siteInsert(SiteVO siteVO) {
		return sqlSession.insert("site.siteInsert", siteVO);
	}
	
	//관리자가 사이트의 모든 정보 불러오기
	@Override
	public List<SiteVO> siteSelectAll() {
		return sqlSession.selectList("site.siteSelectAll");
	}

	//관리자가 사이트 코드로 정보불러오기(클라이언튼 공용)
	@Override
	public SiteVO siteSelectCode(String site_code) {
		return sqlSession.selectOne("site.siteSelectCode",site_code);
	}
	
	//관리자가 사이트 정보 수정
	@Override
	public int siteUpdate(SiteVO siteVO) {
		return sqlSession.update("site.siteUpdate",siteVO);
	}
	
	//관리자가 사이트 정보를 코드로 삭제 
	@Override
	public int siteDelete(String site_code) {
		return sqlSession.delete("site.siteDelete", site_code);
	}

	//관리자가 사이트 정보 코드로 정보 검색
	@Override
	public List<SiteVO> siteSelectCodeSearch(String code) {
		return sqlSession.selectList("site.siteSelectCodeSearch",code);
	}

}
