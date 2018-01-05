<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <title>관리 시스템 로그인 </title>
    <link rel="icon" href="${pagaContext.request.contextPath }/resources/img/cjcl.png">
</head>

<body>
    <h1><a href="adIndex"><img src="${pageContext.request.contextPath}/resources/img/cgvlogo.png" alt="로그 이미지"></a></h1>
    <h2>사이트 관리</h2>
    <h3><a href="adSiteInsert">사이트 등록</a></h3>

    <form action="adSite" method="post">
        <input type="text" placeholder="사이트 코드(이름)로 찾기" name="code">
        <input type="submit" value="사이트 검색">
    </form>

    <table>
        <tr>
            <th>사이트 코드</th>
            <th>전화번호</th>
            <th>주소</th>
            <th>관개수</th>
            <th>점장</th>
            <th></th>
        </tr>
        <c:forEach items="${siteVO }" var="site">
        <tr>
            <td>${site.site_code}</td>
            <td>${site.site_phone}</td>
            <td>${site.site_addr}</td>
            <td>${site.site_num}개 관</td>
            <td>${site.site_manager}</td>
            <td><a href="adSiteUpdate?site_code=${site.site_code}">수정</a><a href="adSiteDelete?site_code=${site.site_code}">삭제</a></td>
        </tr>
        </c:forEach>
    </table>
</body>

</html>
