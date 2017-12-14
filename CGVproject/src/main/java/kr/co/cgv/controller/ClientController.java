package kr.co.cgv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ClientController {
	
	//index페이지 이동
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
			
		return "index";
	}
	
	// 로그인 페이지 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		
		return "login";
	}
	
	//회원가입 페이지 이동
	@RequestMapping(value = "memberInsert", method = RequestMethod.GET)
	public String memberInsert(){
		return "memberInsert";
	}

}
