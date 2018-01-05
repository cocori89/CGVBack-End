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
 <h2>사이트 등록</h2>
 
 <form action="adSiteInsert" method="post">
     <table>
         <tr>
             <td>사이트 코드</td>
             <td><input type="text" name="code"></td>
         </tr>
         <tr>
             <td>전화번호</td>
             <td><input type="tel" name="phone"></td>
         </tr>
         <tr>
             <td>주소</td>
             <td><input type="text" name="addr"></td>
         </tr>
         <tr>
             <td>관 개수</td>
             <td><input type="text" name="num"></td>
         </tr>
         <tr>
             <td>점장</td>
             <td><input type="text" name="manager"></td>
         </tr>
         <tr>
             <td colspan="2">
                 <input type="submit" value="사이트 등록하기">
                 <input type="button" value="취소" onclick="javascript:location.href='adSite'">
             </td>
         </tr>
     </table>
 </form>
</body>
</html>