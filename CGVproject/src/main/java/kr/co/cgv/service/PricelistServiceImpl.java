package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.PricelistDao;
import kr.co.cgv.domain.PricelistVO;

//가격 표
@Service
public class PricelistServiceImpl implements PricelistService{
	@Autowired
	PricelistDao pricelistDao;
	/*클라이언트*/
	/*관리자*/
	//관리자 가격 정보 등록
	@Override
	public int pricelistInsert(HttpServletRequest request) {
		PricelistVO pricelistVO =  new PricelistVO();
		pricelistVO.setPricelist_code(request.getParameter("code"));
		pricelistVO.setPricelist_kind(request.getParameter("kind"));
		pricelistVO.setPricelist_time(request.getParameter("time"));
		pricelistVO.setPricelist_date(request.getParameter("date"));
		pricelistVO.setPricelist_grade(request.getParameter("grade"));
		pricelistVO.setPricelist_price(request.getParameter("price"));
		return pricelistDao.pricelistInsert(pricelistVO);
	}
	
	//관리자 가격 정보 모두 가져오기
	@Override
	public List<PricelistVO> pricelistSelectAll() {
		return pricelistDao.pricelistSelectAll();
	}

	//관리자가 가격 정보 종류에 따라 가져 오기
	@Override
	public List<PricelistVO> pricelistSelectKind(String pricelist_kind) {
		return pricelistDao.pricelistSelectKind(pricelist_kind);
	}

	// 관리자가 가격 정보 삭제
	@Override
	public int pricelistDelete(String pricelist_code) {
		return pricelistDao.pricelistDelete(pricelist_code);
	}

}
