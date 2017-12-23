package kr.co.cgv.dao;

import java.util.List;
import java.util.Map;

import kr.co.cgv.domain.MemberVO;

public interface MemberDao {
	
	public int memberInsert(MemberVO memberVO);//회원 정보 등록
	
	public MemberVO memberSelect(String Member_id);//회원정보 수정시 정보 불러 오기 
	
	public int memberUpdate(MemberVO memberVO);// 회원정보 수정 
	
	public int memberDelete(String member_id);//회원 정보 탈퇴
	
	public MemberVO memberLogin(Map<String, String> map);//회원 로그인
	
	//관리자 
	
	public List<MemberVO> memberSelectAll();//관리자가 회원정보 모든 회원의 호출
	
	public int memberUpdateAdmin(MemberVO memberVO);//관리자 회원정보 수정
	
}
