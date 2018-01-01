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
	
	// 영화 상위 top 6 영화 정보 불러 오기
	@Override
	public List<MovieVO> movieSelectTop6() {
		return sqlSession.selectList("movie.movieSelectTop6");
	}


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
	public MovieVO movieSelectCode(int movie_code) {
		return sqlSession.selectOne("movie.movieSelectCode",movie_code);
	}

	// 관리자 영화 정보 수정 수행 
	@Override
	public int movieUpdate(MovieVO movieVO) {
		return sqlSession.update("movie.movieUpdate", movieVO);
	}

	//관리자가 영화정보 삭제하기 
	@Override
	public int movieDelete(int movie_code) {
		return sqlSession.update("movie.movieDelete", movie_code);
	}
}
