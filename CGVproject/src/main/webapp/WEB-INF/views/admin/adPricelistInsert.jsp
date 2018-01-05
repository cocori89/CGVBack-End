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
 <h2>가격 정보 등록</h2>
     <form action="adPricelistInsert" method="post">
         <table>
            <tr>
                <td>가격코드</td>
                <td><input type="text" placeholder="예)2D프평일 = 일반프라임평일일반" name="code"></td>
            </tr>  
            <tr>
                 <td>영화종류</td>
                 <td>
                     <input type="radio" value="2D"  name="kind" id="p2d">
                     <label for="p2d">일반(2D)</label>
                     <input type="radio" value="3D"  name="kind" id="p3d">
                     <label for="p3d">일반(3D)</label>
                     <input type="radio" value="screenx2D"  name="kind" id="ps2d">
                     <label for="ps2d">SCREENX(2D)</label>
                     <input type="radio" value="sweetbox2D"  name="kind" id="psw2d">
                     <label for="psw2d">SWEETBOX(2D)</label>
                     <input type="radio" value="sweetbox3D"  name="kind" id="psw3d">
                     <label for="psw3d">SWEETBOX(3D)</label>
                 </td>
             </tr>           
             <tr>
                 <td>시간대</td>
                 <td>
                     <input type="radio" value="모닝"  name="time" id="pm">
                     <label for="pm">모닝(06:00~)</label>
                     <input type="radio" value="브런치" name="time" id="pb">
                     <label for="pb">브런치(10:01~)</label>
                     <input type="radio" value="데이라이트" name="time" id="pd">
                     <label for="pd">데이라이트(16:01~)</label>
                     <input type="radio" value="문라이트" name="time" id="pmo">
                     <label for="pmo">문라이트(22:01~)</label>
                     <input type="radio" value="라이트" name="time" id="pl">
                     <label for="pl">라이트(24:01~)</label>
                 </td>
             </tr>
             <tr>
                 <td>평일/주말</td>
                 <td>
                     <input type="radio" value="평일(월~목)" name="date" id="pp">
                     <label for="pp">평일(월~목)</label>
                     <input type="radio" value="주말(금~일)" name="date" id="pj">
                     <label for="pj">주말(금~일)</label>
                 </td>
             </tr>
             <tr>
                 <td>등급</td>
                 <td>
                     <input type="radio" value="일반" name="grade" id="pa">
                     <label for="pa">일반</label>
                     <input type="radio" value="청소년" name="grade" id="py">
                     <label for="py">청소년</label>
                 </td>
             </tr>
             <tr>
                 <td>가격</td>
                 <td><input type="number" name="price">원</td>
             </tr>
             <tr>
                 <td colspan="2">
                 	<input type="submit" value="저장">
                 	<input type="button" value="취소" onclick="javacript:location.href='adPricelist'">
                 </td>
             </tr>
         </table>
     </form>
</body>
</html>