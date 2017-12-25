package kr.co.cgv.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.MovieVO;

@Repository
public class MovieDaoImpl implements MovieDao {
	
	@Autowired
	SqlSession sqlSession;
	
	/*클라이언트-----------------------------*/
	/*관리자---------------------------------*/ 
	// 관리자가 영화 정보 등록 
	@Override
	public int movieInsert(MovieVO movieVO) {
		return sqlSession.insert("movie.movieInsert", movieVO);
	}
	
	// 관리자가 영화 정보 리스트 요청
	@Override
	public List<MovieVO> movieSelectAll() {
		return sqlSession.selectList("movie.movieSelectAll");
	}
	
	// 관리자가 영화 제목으로 영화 정보 검색 후 정렬
	@Override
	public List<MovieVO> movieSelectTitle(String title) {
		return sqlSession.selectList("movie.movieSelectTitle",title);
	}
	
	// 관리자가 영화 정보 수정을 위해 코드에 의해서 가져 옴 (클라이언트와 공통)
	@Override
	public MovieVO movieSelectCode(String movie_code) {
		return sqlSession.selectOne("movie.movieSelectCode",movie_code);
	}

}
