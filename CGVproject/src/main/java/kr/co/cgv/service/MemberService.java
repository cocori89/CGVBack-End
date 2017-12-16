package kr.co.cgv.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.tiles.request.Request;

import kr.co.cgv.domain.MemberVO;

public interface MemberService {
	public int memberInset(HttpServletRequest request);//회원정보등록
	
	public MemberVO memberSelect(String member_id);//회원정보 수정시 정보 불러 오기 
	
	public int memberUpdate(HttpServletRequest request);// 회원정보 수정 
	
	public int memberDelete(String member_id);//회원 정보 탈퇴
	
	public MemberVO memberLogin(HttpServletRequest request);// 회원 로그인 
}
