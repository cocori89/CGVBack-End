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
 <h1><a href="adIndex"><img src="${pageContext.request.contextPath }/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
 <h2>이벤트 정보 관리</h2>   
  <ul>
    <li><a href="adEventInsert">영화정보 등록 </a></li>
</ul>
 <form action="adEvent" method="post">
     <input type="text" name="title">
     <input type="submit" value="제목검색">
 </form>
 
 <table>
     <tr>
         <th>등록번호</th>
         <th>제목</th>
         <th>시작시간</th>
         <th>종료기간</th>
         <th>종류</th>
         <th>중요도</th>
         <th></th>
     </tr>
     <c:forEach items="${eventVO }" var="event">
	     <tr>
	         <td>${event.event_code }</td>
	         <td>${event.event_title }</td>
	         <td>${event.event_startdate }</td>
	         <td>${event.event_enddate }</td>
	         <td>${event.event_kind }</td>
	         <td>${event.event_important }</td>
	         <td>
	             <button onclick="javascript:location.href='adEventUpdate?event_code=${event.event_code }'">수정하기</button>
	             <button onclick="javascript:location.href='adEventDelete?event_code=${event.event_code }'">삭제하기</button>
	         </td>
	     </tr>
     </c:forEach>
     
 </table>
 
</body>
</html>