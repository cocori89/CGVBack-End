<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="${pageContext.request.contextPath }/resources/img/cjcl.png">
</head>

<body>
    <h1><a href="adIndex"><img src="${pageContext.request.contextPath }/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
    <h2>공지사항 관리 </h2>
    <ul>
        <li><a href="adNoticeInsert">공지사항 등록</a></li>
    </ul>

    <form action="adNotice" method="post">
        <div>
          <label for="kind">공지 종류</label>
           <select name="kind" id="kind">
               <option value="전체">전체</option> 
               <option value="시스템점검">시스템점검</option> 
               <option value="극장">극장</option> 
               <option value="제휴이벤트">제휴이벤트</option> 
               <option value="행사/이벤트">행사/이벤트</option> 
               <option value="기타">기타</option> 
           </select>
           <input type="submit" value="종류검색">
        </div>
    </form>
    <form action="adNoticeTitle" method="post">
        <input type="text" placeholder="제목으로 검색하기" name="title">
        <input type="submit" value="제목검색">
    </form>
   
    <table>
        <tr>
            <th>번호</th>
            <th>종류</th>
            <th>제목</th>
            <th>중요등급</th>
            <th>등록일</th>
            <th></th>
        </tr>
        <c:forEach items="${noticeVO }" var="notice">
	        <tr>
	            <td>${notice.notice_code }</td>
	            <td>${notice.notice_kind }</td>
	            <td>${notice.notice_title }</td>
	            <td>${notice.notice_use }</td>
	            <td>${notice.notice_date }</td>
	            <td>
	                <button onclick="javascropt:location.href='adNoticeUpdate?notice_code=${notice.notice_code}'">수정하기</button>
	                <button onclick="javascropt:location.href='adNoticeDelete?notice_code=${notice.notice_code}'">삭제하기</button>
	            </td>
	        </tr>
        </c:forEach>
    </table>
</body>

</html>
