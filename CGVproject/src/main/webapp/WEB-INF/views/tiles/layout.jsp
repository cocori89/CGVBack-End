<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 그 이상의 감동. CGV</title>
<link rel="icon"
	href="${pageContext.request.contextPath}/resources/img/cjcl.png">
    <!--bootstrap-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.min.css">
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
    <!--bootstrap-->
</head>
<body>
	<header id="header">
		<tiles:insertAttribute name="header"/>
	</header>
	<section id="section">
		<tiles:insertAttribute name="section"/>
	</section>
	<footer id="footer">
		<tiles:insertAttribute name="footer"/>
	</footer>
</body>
</html>