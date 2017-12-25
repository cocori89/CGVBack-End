package kr.co.cgv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.cgv.domain.MovieVO;
import kr.co.cgv.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	MovieService movieService;
	
	/* 클라이언트-------------- */
	/* 관리자----------------- */
	// 관리자 영화 정보 등록 페이지 이동
	@RequestMapping(value = "admin/adMovieInsert", method = RequestMethod.POST)
	public String adMovieInsert(MultipartHttpServletRequest request,Model model) {
		int r = movieService.movieInsert(request);
		if(r==0){
			return "admin/adMovieInsert";
		}else {
			return "redirect:adMovie";
		}
		
	}
	@RequestMapping(value = "admin/adMovie", method = RequestMethod.POST)
	public String adMovieSelectTitle(@RequestParam("title")String title,Model model) {
		List<MovieVO> movieVO = movieService.movieSelectTitle(title);
		model.addAttribute("movieVO", movieVO);
		return "admin/adMovie";
	}

}
