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
    <h2>영화 정보 수정</h2>
    <form action="adMoviceUpdate" method="post">
        <table>
           <tr>
               <td>영화 상태</td>
               <td>
                   <select name="state" id="">
                       <option value="">상영전</option>
                       <option value="">상영중</option>
                       <option value="">상영종료</option>
                   </select>
               </td>
           </tr>
            <tr>
                <td>포스터등록</td>
                <td><input type="file" name="poster" ></td>
            </tr>
            <tr>
                <td>영화 제목</td>
                <td><input type="text" name="title" value=""></td>
            </tr>
            <tr>
                <td>감독</td>
                <td><input type="text" name="director" value=""></td>
            </tr>
            <tr>
                <td>프류듀서</td>
                <td><input type="text" name="producer" value=""></td>
            </tr>
            <tr>
                <td>배우</td>
                <td><input type="text" name="acter" value=""></td>
            </tr>
            <tr>
                <td>영화 등급</td>
                <td>
                    <select name="" id="">
                        <option value="전체관람가">전체관람가</option>
                        <option value="12세관람가">12세이상관람가</option>
                        <option value="15세관람가">15세이상관람가</option>
                        <option value="청소년관람불가">청소년관람불가</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>상영시간</td>
                <td><input type="text" name="time" value=""></td>
            </tr>
            <tr>
                <td>국가</td>
                <td><input type="text" name="nation" value=""></td>
            </tr>
            <tr>
                <td>영화사이트</td>
                <td><input type="text" name="site" value=""></td>
            </tr>
            <tr>
                <td>개봉일</td>
                <td><input type="text" name="date" value=""></td>
            </tr>
            <tr>
                <td>줄거리</td>
                <td>
                    <textarea name="plot"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="영화정보 수정">
                    <input type="button" value="취소" onclick="javescript:location.href='adMovie'">
                </td>
            </tr>
           
        </table>
    </form>
</body>

</html>
