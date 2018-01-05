<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/img/cjcl.png">
</head>
<body>
 <h1><a href="adIndex"><img src="${pageContext.request.contextPath}/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
 <h2>목동 1관 좌석표</h2> 
 <table border="1">
 	 <c:forEach items="${seat_row} " var="row" >
     <tr>
     <!-- 도저히 어떻게 할수가 없다. -->
     	<c:forEach items="${seat_column}" var="col">
         	<td>${row}${col}</td>
     	</c:forEach>
     </tr>
 	 </c:forEach>
 </table>
 <button onclick="history.back()">뒤로가기</button>
</body>
</html>