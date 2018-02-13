package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.PricelistVO;

public interface PricelistService {
	//클라이언트
	public String priceListSelectGetPrice(String pricelist_time, String pricelist_day, String adult, String teenager);//시간대 + 요일 + 등급(어른과 청소년) => 가격 가져 오기
	//관리자
	public int pricelistInsert(HttpServletRequest request);//관리자가 가격 정보 등록
	public List<PricelistVO> pricelistSelectAll();//관리자가 가격 모두 가져오기 
	public List<PricelistVO> pricelistSelectKind(String pricelist_kind);//관리자가 종류에 따라 가격 정보 가져오기
	public int pricelistDelete(String pricelist_code);//관리자가 가격정보 삭제
}
