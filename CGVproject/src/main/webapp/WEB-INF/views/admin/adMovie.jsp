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
 <h2>영화 정보 관리</h2>
<ul>
    <li><a href="adMovieInsert">영화정보 등록 </a></li>
</ul>
    <form action="adMovie" method="post"> 
        <input type="text" placeholder="영화 제목을 검색해주세요" name="title">
        <input type="submit" value="영화 제목 검색">
    </form>
   
<table>
    <tr>
        <th>영화코드</th>
        <th>영화제목</th>
        <th>감독</th>
        <th>개봉일</th>
        <th>외화/국내</th>
        <th>등급</th>
        <th>별점</th>
        <th></th>
    </tr>   
    <c:forEach items="${movieVO }" var="movie">
	    <tr>
	        <td>${movie.movie_code }</td>
	        <td>${movie.movie_title }</td>
	        <td>${movie.movie_director }</td>
	        <td>${movie.movie_date }</td>
	        <td>${movie.movie_nation }</td>
	        <td>${movie.movie_grade }</td>
	        <td>${movie.movie_star }</td>
	        <td>
	            <button onclick="javascript:location.href='adMovieUpdate?movie_code=${movie.movie_code }'">수정하기</button>
	            <button onclick="javascript:location.href='adMovieDelect?movie_code=${movie.movie_code }'">삭제하기</button>
	        </td>
	    </tr>
    </c:forEach>
</table>
</body>
</html>