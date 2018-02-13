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
    <h2>쿠폰 관리</h2>
    <ul>
        <li><a href="adCouponInsert">쿠폰 등록</a></li>
        <li><a href="adCouponDelete">쿠폰 삭제</a></li>
    </ul>
    <form action="adCoupon" method="post">
        <input type="text" name="id" placeholder="아이디를 입력하세요">
        <input type="submit" value="쿠폰검색">
    </form>
        <table>
            <tr>
                <td>쿠폰번호</td>
                <td>할인가격</td>
                <td>아이디</td>
                <td>사용유무</td>
                <td>사용기한</td>
                <td></td>
                <td></td>
            </tr>
         <c:forEach items="${couponVO }" var="coupon">
         	<form action="adCouponUseUpdate" method="post">
            <tr>
                <td><input type="text" value="${coupon.coupon_code}" readonly="readonly" name="code"></td>
                <td><input type="text" value="${coupon.coupon_price}" readonly="readonly" name="price">원</td>
                <td><input type="text" value="${coupon.member_id}" readonly="readonly" name="id"></td>
                <td><input type="date" value="${coupon.coupon_end}" readonly="readonly" name="end"></td>
                <td>
                    <select name="use" id="use">
                   		<c:if test="${coupon.coupon_use==1}">
	                         <option value="1" selected="selected">사용</option>
	                         <option value="0">비사용</option>
                   		</c:if>
                   		<c:if test="${coupon.coupon_use==0}">
	                         <option value="1" >사용</option>
	                         <option value="0" selected="selected">비사용</option>
                   		</c:if>
                    </select>
                </td>
                <td><input type="submit" value="수정하기"></td>
            </tr>
            </form>
         </c:forEach>   
        </table>
</body>

</html>
