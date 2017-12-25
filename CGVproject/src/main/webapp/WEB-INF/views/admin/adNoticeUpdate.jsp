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
 <h2>공지사항 수정</h2>

    <form action="adNoticeUpdate" method="post">
        <table>
            <tr>
                <td>제목</td>
                <td><input type="text" name="title" value="${notice.notice_title }"></td>
            </tr>
            <tr>
                <td>종류</td>
                <td>현상태 : ${notice.notice_kind }
                    <select name="kind" id="">
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
                <td>현생태: ${notice.notice_use }
                    <select name="use" id="">
                        <option value="0">일반 공지사항</option>
                        <option value="3">중요 공지사항</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea name="content" rows="10" cols="40">
                	 ${notice.notice_content }
                </textarea></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="공지사항 수정">
                    <input type="button" value="취소하기" onclick="javascript:location.href='adNotice'">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>