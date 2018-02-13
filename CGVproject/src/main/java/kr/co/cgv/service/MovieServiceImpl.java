package kr.co.cgv.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.cgv.dao.MovieDao;
import kr.co.cgv.domain.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	MovieDao movieDao;
	
	/*클라이언트----------------------------------*/
	
	//가장인 기 있는 top 6영화 정보 가져 오기 
	@Override
	public List<MovieVO> movieSelectTop6() {
		return movieDao.movieSelectTop6();
	}
	//현재 상영작 정보 가져 오기 
	@Override
	public List<MovieVO> movieSelectNow() {
		return movieDao.movieSelectNow();
	}

	
	/*관리자-------------------------------------*/
	//영화 정보 등록 
	@Override
	public int movieInsert(MultipartHttpServletRequest request) {
		MovieVO movieVO = new MovieVO();
		
		movieVO.setMovie_title(request.getParameter("title"));
		movieVO.setMovie_director(request.getParameter("director"));
		movieVO.setMovie_producer(request.getParameter("producer"));
		movieVO.setMovie_acter(request.getParameter("acter"));
		movieVO.setMovie_genre(request.getParameter("genre"));
		movieVO.setMovie_grade(request.getParameter("grade"));
		movieVO.setMovie_time(request.getParameter("time"));
		movieVO.setMovie_nation(request.getParameter("nation"));
		movieVO.setMovie_site(request.getParameter("site"));
		movieVO.setMovie_date(request.getParameter("date"));
		movieVO.setMovie_state(request.getParameter("state"));
		//줄거리 엔터처리
		String plot= request.getParameter("plot");
		plot = plot.replace("\r\n", "<br>");
		movieVO.setMovie_plot(plot);
		//파일 처리 
		MultipartFile mf = request.getFile("poster");
		// 파일 이름 얻기
		String mainFileName = mf.getOriginalFilename();
		// 파일 유표성 체크 
		//확장자 뽑기 
		String fileExtension = mainFileName.substring(mainFileName.indexOf(".")+1, mainFileName.length());
		// 확장사 소문자로 바꾸기
		fileExtension=fileExtension.toLowerCase();
		
		// 파일 확장자가 이미지 파일인지 판단
		if(fileExtension.equals("jpg")||fileExtension.equals("tiff")||
				fileExtension.equals("psd")||fileExtension.equals("png")||
				fileExtension.equals("bmp")||fileExtension.equals("gif")){
			System.out.println(mainFileName+ "은(는) 정상적인 이미지 파일입니다. ");
		}else {
			System.out.println(mainFileName+ "은(는) 위험성있는 파일 이미지 입니다.  ");
			return 0;
		}
		
		// 파일 저장 경로 
		String path = request.getSession().getServletContext().getRealPath("/resources/img/movie/");
		// 경로 + 파일 이름
		String saveFile = path+"/"+mainFileName;
		
		try {
			mf.transferTo(new File(saveFile));
		} catch (Exception e) {
			System.out.println("포스터 들록 오류가 났습니다. "+ e);
		}
		movieVO.setMovie_poster(mainFileName);
		return movieDao.movieInsert(movieVO);
	}

	//관리자가 영화 정보 리스트 요청
	@Override
	public List<MovieVO> movieSelectAll() {
		return movieDao.movieSelectAll();
	}

	//관리자가 영화정보 영화 제목으로 검색
	@Override
	public List<MovieVO> movieSelectTitle(String title) {
		return movieDao.movieSelectTitle(title);
	}
	
	//관리자가 영화 정보 수정을 위해 코드를 통해 정보를 가져옴 (클라이언트와 공용)
	@Override
	public MovieVO movieSelectCode(int movie_code) {
		MovieVO movieVO = movieDao.movieSelectCode(movie_code);
		//줄거리 줄 처리 
		String plot = movieVO.getMovie_plot();
		if(plot != null){
			plot = plot.replace("<br>","\r\n");
		}
		movieVO.setMovie_plot(plot);
		return movieVO;
	}

	//관리자가 영화 정보 수정 수행 
	@Override
	public int movieUpdate(MultipartHttpServletRequest request) {
		String plot= request.getParameter("plot");
		MovieVO movieVO = new MovieVO();
		
		movieVO.setMovie_code(Integer.parseInt(request.getParameter("code")));
		movieVO.setMovie_title(request.getParameter("title"));
		movieVO.setMovie_director(request.getParameter("director"));
		movieVO.setMovie_producer(request.getParameter("producer"));
		movieVO.setMovie_acter(request.getParameter("acter"));
		movieVO.setMovie_genre(request.getParameter("genre"));
		movieVO.setMovie_grade(request.getParameter("grade"));
		movieVO.setMovie_time(request.getParameter("time"));
		movieVO.setMovie_nation(request.getParameter("nation"));
		movieVO.setMovie_site(request.getParameter("site"));
		movieVO.setMovie_date(request.getParameter("date"));
		movieVO.setMovie_state(request.getParameter("state"));
		//줄거리 엔터처리
		System.out.println(plot);
		plot = plot.replace("\r\n", "<br>");
		movieVO.setMovie_plot(plot);
		//파일 처리 
		MultipartFile mf = request.getFile("poster");
		// 파일 이름 얻기
		String mainFileName = mf.getOriginalFilename();
		// 파일 유표성 체크 
		//확장자 뽑기 
		String fileExtension = mainFileName.substring(mainFileName.indexOf(".")+1, mainFileName.length());
		// 확장사 소문자로 바꾸기
		fileExtension=fileExtension.toLowerCase();
		
		// 파일 확장자가 이미지 파일인지 판단
		if(fileExtension.equals("jpg")||fileExtension.equals("tiff")||
				fileExtension.equals("psd")||fileExtension.equals("png")||
				fileExtension.equals("bmp")||fileExtension.equals("gif")){
			System.out.println(mainFileName+ "은(는) 정상적인 이미지 파일입니다. ");
		}else {
			System.out.println(mainFileName+ "은(는) 위험성있는 파일 이미지 입니다.  ");
			return 0;
		}
		
		// 파일 저장 경로 
		String path = request.getSession().getServletContext().getRealPath("/resources/img/movie/");
		// 경로 + 파일 이름
		String saveFile = path+"/"+mainFileName;
		
		try {
			mf.transferTo(new File(saveFile));
		} catch (Exception e) {
			System.out.println("포스터 들록 오류가 났습니다. "+ e);
		}
		movieVO.setMovie_poster(mainFileName);
		
		return movieDao.movieUpdate(movieVO);
	}
	//환리자가 영화 정보 삭제 하기
	@Override
	public int movieDelete(int movie_code) {
		return movieDao.movieDelete(movie_code);
	}

	

}
