package kr.co.cgv.dao;

import java.util.List;

import kr.co.cgv.domain.MovieVO;

public interface MovieDao {
	//클라이언트
	//관리자 
	public int movieInsert(MovieVO movieVO);// 관리자가 영화 정보 등록
	public List<MovieVO> movieSelectAll();// 관리자가 영화 정보 리스트 요청 
	public List<MovieVO> movieSelectTitle(String title);// 관리자가 영화 정보 영화 제목 리스트 검색 
	public MovieVO movieSelectCode(String movie_code);// 관리자가 영화 정보 코드를 참고 해서 (클라이언트와 공통)
}
