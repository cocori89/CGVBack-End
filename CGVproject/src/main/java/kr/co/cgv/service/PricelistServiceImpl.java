package kr.co.cgv.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	//시간대 + 요일 + 등급(어른과 청소년 ) => 가격 가져 오기
	@Override
	public String priceListSelectGetPrice(String pricelist_time, String pricelist_day,String adult, String teenager) {
		String time = pricelist_time.substring(0,2);// 시간을 분류한다. 
		String day= pricelist_day;// 이것 요일 별로 들어간다. 
		System.out.println("시간 = >"+time);
		int itime = Integer.parseInt(time);
		if(itime<10){//모닝
			time = "모닝";
		}else if(itime>=10 && itime<13) {//브런치
			time = "브런치";
		}else if(itime>=13 && itime<16) {// 데이라이트
			time = "데이라이트";
		}else if(itime>=16 && itime<22) {//프라임
			time = "프라임";
		}else if(itime>=22 && itime<24) {//문라이트
			time = "문나이트";
		}else{//나이트
			time = "나이트";
		}
		System.out.println("시간 등급 = >"+time);
		
		System.out.println("날짜 =>"+day);
		System.out.println("날짜 =>"+day.length());
		if(day.equals("월")||day.equals("화")||day.equals("수")||day.equals("목")){
			day = "평일(월~목)";
		}else if(day.equals("금")||day.equals("토")||day.equals("일")){
			day = "주말(금~일)";
		}
		System.out.println("날짜 등급 =>"+day);
		
		Map<String, String> priceAdult= new HashMap<String, String>();//어른용
		priceAdult.put("pricelist_time", time);
		priceAdult.put("pricelist_date", day);
		priceAdult.put("pricelist_grade", "일반");
		Map<String, String> priceTeen= new HashMap<String, String>();//청소년용
		priceTeen.put("pricelist_time", time);
		priceTeen.put("pricelist_date", day);
		priceTeen.put("pricelist_grade", "청소년");
		
		String priceA = pricelistDao.priceListSelectGetPrice(priceAdult);//어른가격
		int ipriceA = Integer.parseInt(priceA);
		String priceT = pricelistDao.priceListSelectGetPrice(priceTeen);// 청소년 가격 
		int ipriceT = Integer.parseInt(priceT);
		
		System.out.println("어른가격=>"+priceA);
		System.out.println("청소년가격=>"+priceT);
		int sumA = (Integer.parseInt(adult))*ipriceA;
		int sumT = (Integer.parseInt(teenager))*ipriceT;
		String resultPrice = (sumA+sumT)+"";
		
		return resultPrice;
	}

	
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
