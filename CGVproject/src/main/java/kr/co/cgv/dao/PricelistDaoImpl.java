package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.PricelistVO;
//가격표
@Repository
public class PricelistDaoImpl implements PricelistDao{
	@Autowired
	SqlSession sqlSession;
	/*클라이언트*/
	/*관리자*/
	//관리자 가격 정보 등록
	@Override
	public int pricelistInsert(PricelistVO pricelistVO) {
		return sqlSession.insert("pricelist.pricelistInsert", pricelistVO);
	}

	//관리자가 가격 정보 모두 가져 오기
	@Override
	public List<PricelistVO> pricelistSelectAll() {
		return sqlSession.selectList("pricelist.pricelistSelectAll");
	}

	//관리자가 종류에 따라 가격 정보 가져 오기
	@Override
	public List<PricelistVO> pricelistSelectKind(String pricelist_kind) {
		return sqlSession.selectList("pricelist.pricelistSelectKind",  pricelist_kind);
	}

	//관리자가 가격 정보 삭제
	@Override
	public int pricelistDelete(String pricelist_code) {
		return sqlSession.delete("pricelist.pricelistDelete",pricelist_code);
	}

}
