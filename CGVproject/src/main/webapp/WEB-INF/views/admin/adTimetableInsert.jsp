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
 <h2>(${site } : ${date } : ${theater_num}관)상영 시간표 등록</h2>
 <form action="adTimetableInsert" method="post">
 <table>
     <tr>
         <td>사이트 코드</td>
         <td><input type="text" value="${site }" name="site"></td>
     </tr>
     <tr>
         <td>상영관 코드</td>
         <td><input type="text" value="${theater_code }" name="theater" id="theater"></td>
     </tr>
     <tr>
         <td>날짜</td>
         <td><input type="date" value="${date}" name="date" id="date"></td>
     </tr>
     <tr>
         <td>차수</td>
         <td><input type="number" name="order" id="order" value=""></td>
     </tr>
     <tr>
         <td>시작 시간</td>
         <td><input type="time" name="start" id="start" value="" ></td>
     </tr>
     <script>
    		//들어오면 정보 가져와서 회차와 시작 시간 정보 자동입력 
          	$(function(){
				$.ajax({
					url :"${pageContext.request.contextPath}"+"/admin/oderStart",
					type : "get",
					data: { 
						"timetable_date" : $("#date").val(),
						"theater_code" : $("#theater").val()
					},
					success :  function(data){
          					var i = JSON.parse(data);
           					$("#order").val(i.order);
           					$("#start").val(i.start);
					}//성공시 실행되는 메서드
				});//ajax 끝						             			
           	})
     </script>
     
     <tr>
         <td>상영 영화 정보 </td>
         <td>
             <select name="movie" id="movie">
             	 <option value="">영화를선택해주세요</option>
             	 <c:forEach items="${movieVO}" var="movie">
	                 <option value="${movie.movie_code}">${movie.movie_title}</option>
             	 </c:forEach>	
             </select>
             <!-- ajax 생성 구간 -->
             <script>
             	$(function(){
             		$("#movie").on('change',function(){
						$.ajax({
							url :"${pageContext.request.contextPath}"+"/admin/theaterRunTime",
							type : "get",
							data: { 
								"movie_code" : $("#movie").val(),
								"startTime" : $("#start").val()
							},
							success :  function(data){
								var endtime = data;
								$("#end").val(endtime)//종료 시간 삽입
							}//성공시 실행되는 메서드
						});//ajax 끝						             			
             		});
             	})
             </script>
             <!-- ajax 생성 구간 -->
         </td>
     </tr>
     <tr>
         <td>종료 시간</td>
         <td><input type="time" name="end" id="end" value=""></td>
     </tr>
     <tr>
         <td colspan="2">
             <input type="submit" value="등록">
             <input type="button" value="취소" onclick="history.back()">
         </td>
     </tr>
 </table>
 </form>
</body>
</html>