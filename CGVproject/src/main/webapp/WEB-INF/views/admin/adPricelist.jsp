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
 <h2>가격 정보 관리</h2>
  <ul>
        <li><a href="adPricelistInsert">가격 정보 등록</a></li>
  </ul>
  <form action="adPricelist" method="post">
        <select name="code" id="">
            <option value="2D">일반(2D)</option>
            <option value="3D">일반(3D)</option>
            <option value="screenx2D">SCREENX(2D)</option>
            <option value="sweetbox2D">SWEETBOX(2D)</option>
            <option value="sweetbox3D">SWEETBOX(3D)</option>
        </select>
        <input type="submit" value="영화종류 검색">
  </form>
  
<table>
    <tr>
        <th>가격 코드</th>
        <th>영화종류</th>
        <th>시간대</th>
        <th>주말/일반</th>
        <th>등급</th>
        <th>가격</th>
        <th></th>
    </tr>
    <c:forEach items="${pricelistVO}" var="pricelist">
	    <tr>
	        <td>${pricelist.pricelist_code }</td>
	        <td>${pricelist.pricelist_kind }</td>
	        <td>${pricelist.pricelist_time }</td>
	        <td>${pricelist.pricelist_date }</td>
	        <td>${pricelist.pricelist_grade }</td>
	        <td>${pricelist.pricelist_price }</td>
	        <td>
	            <button onclick="javascript:location.href='adPricelistDelete?pricelist_code=${pricelist.pricelist_code }'">삭제하기</button>
	        </td>
	    </tr>
    </c:forEach>
    
</table>
</body>
</html>