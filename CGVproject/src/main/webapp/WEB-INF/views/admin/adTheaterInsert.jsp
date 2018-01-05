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
    <h2>상영관 정보 등록</h2>
    <form action="adTheaterInsert" method="post">
       <table>
	        <tr>
	            <td>관고유번호</td>
	            <td><input type="text" name="code" placeholder="ex)목동1에 3관  = 목동03로 한다 "></td>
	        </tr>
	        <tr>
	            <td>사이트</td>
	            <td>
	                <!--이것은 사이트가 먼저 등록되어 있어야 하는 것이다. -->
	                <select name="site" id="">
						<c:forEach items="${siteVO}" var="site">
		                	<option value="${site.site_code}">${site.site_code}</option>
						</c:forEach>
	             	</select>
	            </td>
	        </tr>
	        <tr>
	            <td>관번호</td>
	            <td><input type="number" name="num"></td>
	        </tr>
	        <tr>
	            <td>수용인원</td>
	            <td><input type="number" name="people"></td>
	        </tr>
	        <tr>
	            <td>종류</td>
	            <td>
	                <select name="kind" id="">
	                    <option value="일반">일반</option>
	                    <option value="3D">3D</option>
	                    <option value="screenX">screenX</option>
	                    <option value="sphereX">sphereX</option>
	                    <option value="soundX">soundX</option>
	                    <option value="starium">starium</option>
	                    <option value="veatbox">veatbox</option>
	                    <option value="goldclass">goldclass</option>
	                    <option value="sweetbox">sweetbox</option>
	                </select>
	            </td>
	        </tr>
	        <tr>
	            <td colspan="2">
	                <input type="submit" value="상영관 등록">
	                <input type="button" value="취소" onclick="javascript:location.href='adTheater'">
	            </td>
	        </tr>
        </table>
    </form>
</body>

</html>

