<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="img/cjcl.png">
</head>
<body>
 <h1><a href="adIndex"><img src="img/cgvlogo.png" alt="로그 이미지"></a></h1>
<h2>회원정보 관리 수정</h2>
 <form action="adMemberModify" method="post">
  <table>
     
      <tr>
          <td>아이디</td>
          <td><input type="text" value="${member.member_id}" name="id" readonly="readonly"></td>
      </tr>
      <tr>
          <td>비밀번호</td>
          <td><input type="password" value="${member.member_pw}" name="pw"></td>
      </tr>
       <tr>
          <td>이름</td>
          <td><input type="text" value="${member.member_name}" name="name"></td>
      </tr>
      <tr>
          <td>전화번호</td>
          <td><input type="text" value="${member.member_phone }" name="phone"></td>
      </tr>
      
      <tr>
          <td>주소</td>
          <td><input type="text" value="${member.member_addr}" name="addr"></td>
      </tr>
      <tr>
          <td>회원등급</td>
          <td>
                      현제등급:${member.member_rating }
              <select name="rating">
                  <option value="7">일반등급</option>
                  <option value="6">VIP</option>
                  <option value="5">RVIP</option>
                  <option value="4">VVIP</option>
              </select>
          </td>
      </tr>
      <tr>
          <td>이메일</td>
          <td><input type="email" value="${member.member_email}" name="email"></td>
      </tr>
      <tr>
          <td>등록일</td>
          <td><input type="text" value="${member.member_date}" name="date" readonly="readonly"></td>
      </tr>
      <tr>
          <td colspan="2">
              <input type="submit" value="수정하기">
              <input type="button" value="취소하기" onclick="javascript:location.href='adMember'">
          </td>
      </tr>
      
  </table>
 </form>
</body>
</html>