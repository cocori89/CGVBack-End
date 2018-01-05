<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 <h2>영화관 정보 관리</h2>
    <form action="adTheater" method="post">
        <select name="site" id="">
        	<c:forEach items="${siteVO}" var="site">
		                <option value="${site.site_code}">${site.site_code}</option>
			</c:forEach>
        </select>
        <input type="submit" value="사이트 코드 검색">
    </form>
<h3><a href="adTheaterInsert">영화관 정보 등록</a></h3>
     
     <table>
         <tr>
             <th>관 고유번호</th>
             <th>사이트</th>
             <th>관 번호</th>
             <th>수용 인원</th>
             <th>관종류</th>
             <th></th>
         </tr>
         <c:forEach items="${theaterVO}" var="theater">
	         <tr>
	             <td>${theater.theater_code }</td>
	             <td>${theater.site_code }</td>
	             <td>${theater.theater_num }관</td>
	             <td>${theater.theater_people }명</td>
	             <td>${theater.theater_kind }</td>
	             <td><a href="adSeat?theater_code=${theater.theater_code }">상영관좌석보기</a><a href="adTheaterUpdate?theater_code=${theater.theater_code }">수정하기</a><a href="adTheaterDelete?theater_code=${theater.theater_code }">삭제</a></td>
	         </tr>
         </c:forEach>
     </table>
      
</body>
</html>