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
 <h1><a href="adIndex"><img src="${pageContext.request.contextPath }/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
 <h2>이벤트 정보 입력</h2>
 <form action="adEventInsert" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>섬네일 이미지</td>
            <td><input type="file" name="somenail"></td>
        </tr>
        <tr>
            <td>이벤트 내용 이미지</td>
            <td><input type="file" name="contentimg"></td>
        </tr>
        <tr>
            <td>이벤트 제목</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>이벤트 시작날짜</td>
            <td><input type="date" name="startdate"></td>
        </tr>
        <tr>
            <td>이벤트 종료 날짜</td>
            <td><input type="date" name="enddate"></td>
        </tr>
        <tr>
            <td>이벤트 종류</td>
            <td>
                <select name="kind" id="">
                    <option value="맴버쉽">맴버쉽</option>
                    <option value="영화/예매">영화/예매</option>
                    <option value="CGV아트하우스">CGV아트하우스</option>
                    <option value="제휴/할인">제휴/할인</option>
                    <option value="시사/무대인사">시사/무대인사</option>
                    <option value="CGV극장별">CGV극장별</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>중요도 종류</td>
            <td>
                <select name="important" id="">
                    <option value="일반">일반</option>
                    <option value="스폐셜">스페셜</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"> 
                <input type="submit" value="저장">
                <input type="button" value="취소" onclick="javascript:location.href='adEvent'">
            </td>
        </tr>
        
    </table>     
     
</form>
</body>
</html>