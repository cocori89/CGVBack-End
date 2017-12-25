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
 <h2>공지사항 등록</h2>

    <form action="adNoticeInsert" method="post">
        <table>
            <tr>
                <td>제목</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>글쓴이</td>
                <td><input type="text" name="writer" value="관리자"></td>
            </tr>
            <tr>
                <td>종류</td>
                <td>
                    <select name="kind" id="kind">
		               <option value="전체">전체</option> 
		               <option value="시스템점검">시스템점검</option> 
		               <option value="극장">극장</option> 
		               <option value="제휴이벤트">제휴이벤트</option> 
		               <option value="행사/이벤트">행사/이벤트</option> 
		               <option value="기타">기타</option> 
           			</select>
                </td>
            </tr>
            <tr>
                <td>중요공지사항 등록</td>
                <td>
                    <select name="use" id="">
                        <option value="0" selected="selected">일반 공지사항</option>
                        <option value="3">중요 공지사항</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea name="content" rows="10" cols="40"></textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="공지사항등록">
                    <input type="button" value="등록 취소" onclick="javascript:location.href='adNotice'">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>