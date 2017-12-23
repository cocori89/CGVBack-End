package kr.co.cgv.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.cgv.domain.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//회원정보 등록
	@Override
	public int memberInsert(MemberVO memberVO) {
		return sqlSession.insert("member.memberInsert", memberVO);
	}

	//회원 로그인 
	@Override
	public MemberVO memberLogin(Map<String, String> map) {
		return sqlSession.selectOne("member.memberLogin", map);
	}

	//회원 정보 수정시 정보 불러 오기 
	@Override
	public MemberVO memberSelect(String Member_id) {
		return sqlSession.selectOne("member.memberSelect",Member_id);
	}

	//회원 정보 수정
	@Override
	public int memberUpdate(MemberVO memberVO) {
		return sqlSession.update("member.memberUpdate", memberVO);
	}

	// 회원 정보 탈퇴
	@Override
	public int memberDelete(String member_id) {
		return sqlSession.update("member.memberDelete", member_id);
	}

	
	/* 관리자 */	
	
	//관리자 회원정보 요청
	@Override
	public List<MemberVO> memberSelectAll() {
		return sqlSession.selectList("member.memberSelectAll");
	}

	// 관리자 회원정보 수정
	@Override
	public int memberUpdateAdmin(MemberVO memberVO) {

		System.out.println(memberVO.getMember_id());
		System.out.println(memberVO.getMember_pw());
		System.out.println(memberVO.getMember_name());
		System.out.println(memberVO.getMember_phone());
		System.out.println(memberVO.getMember_addr());
		System.out.println(memberVO.getMember_rating());
		System.out.println(memberVO.getMember_email());
		System.out.println(memberVO.getMember_date());
		
		return sqlSession.update("member.memberUpdateAdmin",memberVO);
	}

}
