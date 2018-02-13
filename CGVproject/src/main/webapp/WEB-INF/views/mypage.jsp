<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/mypage.css">

</head>
<body>
	<div class="contant">
		<!-- 여기에 아이디 들어가기 -->
		<h2>${name }님의 mypage</h2>
		<button class="btn btn-warning" onclick="javascript:location.href='memberUpdate'">회원정보 수정</button>
		<button class="btn btn-warning" onclick="javascript:location.href='reservation'">예약확인</button>
		<button class="btn btn-warning" onclick="javascript:location.href=''">관람권/쿠폰</button>
	</div>
</body>
</html>