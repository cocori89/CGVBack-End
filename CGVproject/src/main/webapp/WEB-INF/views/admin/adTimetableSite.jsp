<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="${pageContext.request.contextPath }/resources/img/cjcl.png">
    <script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    
</head>
<body>
 <h1><a href="adIndex"><img src="${pageContext.request.contextPath }/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
 <h2>(${site } : ${date })상영관별 상영시간 관리</h2>
 
 <table border="1">
     <!-- 출력DTO 껍질까기 -->
     <c:forEach items="${tttVO}" var="ttt">
     	<!-- 상영영관 정보 껍질까기 -->
		 <tr>
        	 <td><a href="adTimetableInsert?site=${site}&date=${date}&theater_code=${ttt.theaterVO.theater_code}&theater_num=${ttt.theaterVO.theater_num}">${ttt.theaterVO.theater_num}관</a></td>
        	  <c:forEach items="${ttt.timetableVO}" var="timetable">
    	     <td>${timetable.timetable_order}회차</td>
	         <td>시작:${timetable.timetable_start} ~ ${timetable.timetable_end}</td>
        	 <td>${timetable.movie_title}</td><!-- 실행되면 ajax로 변경해보자  -->
    	     <td><a href="">삭제</a></td>
  	       	 </c:forEach>
	     </tr>
     </c:forEach>
 </table>
</body>
</html>