<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/img/cjcl.png">
</head>

<body>
    <h1><a href="adIndex"><img src="${pageContext.request.contextPath}/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
    <h2>쿠폰 등록</h2>
    <table>
            <tr>
                <td>할인가격</td>
                <td>아이디(*사용시 쿠폰부여조건 기타 체크)</td>
                <td>사용기한</td>
                <td>쿠폰 부여 조건</td>
                <td></td>
                <td></td>
            </tr>
        <form action="adCouponInsert" method="post">
            <tr>
                <td><input type="text" value=""  name="price" placeholder="할인가격">원</td>
                <td><input type="text" value=""  name="id" placeholder="**특정 아이디 등록시만 사용"></td>
                <td><input type="date" value="" name="end" ></td>
                <td>
                   <!--2~7 까지가 회원 7 일반 6 vip 5 Rvip 4vvip-->
                    <input type="radio" value="7" id="all" name="rating">
                    <label for="all">모든회원</label>
                    <input type="radio" value="6" id="vip" name="rating">
                    <label for="vip">VIP이상</label>
                    <input type="radio" value="5" id="rvip" name="rating">
                    <label for="rvip">RVIP이상</label>
                    <input type="radio" value="4" id="vvip" name="rating">
                    <label for="vvip">VVIP이상</label>
                    <input type="radio" value="0" id="vvip" name="rating">
                    <label for="vvip">기타</label>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="등록">
                    <input type="button" value="취소" onclick="javascript:location.href='adCoupon'">
                </td>
            </tr>
            </form>
        </table>
</body>

</html>
