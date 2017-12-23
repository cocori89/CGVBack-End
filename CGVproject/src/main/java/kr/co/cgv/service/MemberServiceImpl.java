package kr.co.cgv.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cgv.dao.MemberDao;
import kr.co.cgv.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	//회원정보 등록
	@Override
	public int memberInset(HttpServletRequest request) {
		MemberVO memberVO = new MemberVO();
		
		//sql injection 방지
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String addr = request.getParameter("addr");
		String email =request.getParameter("email");
		int re = -2;
		
		// 패스워드와 아이디 공백삭제및 소문자로 통일
		id = id.toLowerCase();
		pw = pw.toLowerCase();
		
		re = re + id.indexOf("'");
		re = re + pw.indexOf("'");
		re = re + name.indexOf("'");
		re = re + phone.indexOf("'");
		re = re + addr.indexOf("'");
		re = re + email.indexOf("'");
		if(re>=0){
			return 0;
		}
		
		memberVO.setMember_id(id);
		memberVO.setMember_pw(pw);
		memberVO.setMember_name(name);
		memberVO.setMember_phone(phone);
		memberVO.setMember_addr(addr);
		memberVO.setMember_email(email);
		
		return memberDao.memberInsert(memberVO);
		
	}

	
	// 회원 로그인 
	@Override
	public MemberVO memberLogin(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		int re = -2;
		// 아이디 공백삭제와 소문자로 통일 시켜 주고
		// sql injection 방지  
		id = id.trim();
		id = id.toLowerCase();
		re = id.indexOf("'");
		if(re>=0){
			return null;
		}
		//패스 워드 검사
		pw = pw.trim();
		pw = pw.toLowerCase();
		re = pw.indexOf("'");
		if(re>=0){
			return null;
		}
		Map<String , String> map =  new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
			
		return memberDao.memberLogin(map);
	}


	//회원정보 수정시 정보 불러 오기 
	@Override
	public MemberVO memberSelect(String member_id) {
		return memberDao.memberSelect(member_id);
	}

	// 회원 정보 수정
	@Override
	public int memberUpdate(HttpServletRequest request) {
		MemberVO memberVO = new MemberVO();
		
		//sql injection 방지
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String addr = request.getParameter("addr");
		String email =request.getParameter("email");
		int re = -2;
		
		// 패스워드와 아이디 공백삭제및 소문자로 통일
		id = id.toLowerCase();
		pw = pw.toLowerCase();
		
		re = re + id.indexOf("'");
		re = re + pw.indexOf("'");
		re = re + name.indexOf("'");
		re = re + phone.indexOf("'");
		re = re + addr.indexOf("'");
		re = re + email.indexOf("'");
		System.out.println(00);
		if(re>=0){
			return 0;
		}
		System.out.println(123);
		memberVO.setMember_id(id);
		memberVO.setMember_pw(pw);
		memberVO.setMember_name(name);
		memberVO.setMember_phone(phone);
		memberVO.setMember_addr(addr);
		memberVO.setMember_email(email);
		
		return memberDao.memberUpdate(memberVO);
	}

	
	// 회원 정보 탈퇴 
	@Override
	public int memberDelete(String member_id) {
		return memberDao.memberDelete(member_id);
	}

	
		/*관리자*/
	
	//관리자가 회원정보 요청
	@Override
	public List<MemberVO> memberSelectAll() {
		return memberDao.memberSelectAll();
	}


	@Override
	public int memberUpdateAdmin(HttpServletRequest request) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setMember_id(request.getParameter("id"));
		memberVO.setMember_pw(request.getParameter("pw"));
		memberVO.setMember_name(request.getParameter("name"));
		memberVO.setMember_phone(request.getParameter("phone"));
		memberVO.setMember_addr(request.getParameter("addr"));
		memberVO.setMember_rating(request.getParameter("rating"));
		memberVO.setMember_email(request.getParameter("email"));
		memberVO.setMember_date(request.getParameter("date"));

		
		return memberDao.memberUpdateAdmin(memberVO);
	}

}
