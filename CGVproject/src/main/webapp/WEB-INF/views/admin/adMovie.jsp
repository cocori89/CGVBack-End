<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="img/cjcl.png">
</head>
<body>
 <h1><a href="adIndex"><img src="img/cgvlogo.png" alt="로그 이미지"></a></h1>
 <h2>영화 정보 관리</h2>
<ul>
    <li><a href="adMovieInsert">영화정보 등록 </a></li>
</ul>
    <form action="adMovie" method="post"> 
        <input type="text" placeholder="이름을 검색해주세요">
        <input type="submit" value="검색">
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
    <tr>
        <td>54</td>
        <td>변호인</td>
        <td>나아다</td>
        <td>20.157.453</td>
        <td>국내</td>
        <td>15세</td>
        <td>5</td>
        <td>
            <button onclick="javascript:location.href='adMovieUpdate'">수정하기</button>
            <button onclick="">삭제하기</button>
        </td>
    </tr>     
</table>
</body>
</html>