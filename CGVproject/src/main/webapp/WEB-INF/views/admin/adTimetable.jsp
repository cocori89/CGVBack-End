<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="${pageContext.request.contextPath }/resources/img/cjcl.png">
</head>
<body>
 <h1><a href="adIndex"><img src="${pageContext.request.contextPath }/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
 <h2>상영시간 시간 관리</h2>
 <table>
    <c:forEach items="${siteVO}" var="site">
	    <form action="adTimetableSite" method="get">
	     <tr>
	        <td><input type="text" name="site" value="${site.site_code }"></td>
	        <td>
	            <input type="date" name="date">
	        </td>
	        <td>
	            <input type="submit" value="보내기 ">
	        </td>
	    </tr>
	    </form>
    </c:forEach>
 </table>
</body>
</html>