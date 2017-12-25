<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="img/cjcl.png">
</head>

<body>

    <h1><a href="adIndex"><img src="${pageContext.request.contextPath}/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
    <h2>회원정보 관리</h2>

    <form action="adMember" method="post">
        <input type="text" placeholder="이름을 검색해주세요" name="name">
        <input type="submit" value="검색">
    </form>
   
    <table>
        <tr>
            <th>아이디</th>
            <th>이름</th>
            <th>전화번호</th>
            <th>회원등급</th>
            <th>이메일</th>
            <th>등록일</th>
            <th></th>
        </tr>
        <!-- 회원정보 출력 --> 
        <c:forEach items="${memberVO }" var="member">
        <tr>
            <td>${ member.member_id}</td>
            <td>${member.member_name}</td>
            <td>${member.member_phone}</td>
            <td>${member.member_rating}</td>
            <td>${member.member_email}</td>
            <td>${member.member_date}</td>
            <td>
                <a href="adMemberModify?id=${ member.member_id}">상세보기</a>
                <a href="adMemberDelete?id=${ member.member_id}">삭제</a>
            </td>
        </tr>
        </c:forEach>
        
    </table>
</body>

</html>
