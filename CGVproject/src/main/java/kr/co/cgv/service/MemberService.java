package kr.co.cgv.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.co.cgv.domain.MemberVO;

public interface MemberService {
	public int memberInset(HttpServletRequest request);//회원정보등록
	
	public MemberVO memberSelect(String member_id);//회원정보 수정시 정보 불러 오기 
	
	public int memberUpdate(HttpServletRequest request);// 회원정보 수정 
	
	public int memberDelete(String member_id);//회원 정보 탈퇴
	
	public MemberVO memberLogin(HttpServletRequest request);// 회원 로그인 
	
	
	//관리자 
	public List<MemberVO> memberSelectAll();//관리자가 모든 회원 정보 요청
	
	public int memberUpdateAdmin(HttpServletRequest request);// 관리가자 회원 정보 수정 요청
	
	public List<MemberVO> memberSelectName(String name);// 관리자가 회원 정보 이름으로 검색

}
