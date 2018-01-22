<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/common.css">


<!-- Start WOWSlider.com HEAD section -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<!-- End WOWSlider.com HEAD section -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.vticker-min.js"></script>
</head>


<body>
	<div id="cgvwrap">
		<header>
			<div class="head">
				<div class="main-service">
					<ul class="main-service-left">
						<li><a
							href="http://section.cgv.co.kr/event/appRenewal/default.aspx"
							target="_blank"><img
								src="${pageContext.request.contextPath}/resources/img/cgvApp.png"
								alt="cgvAPP"></a></li>
						<li><a href="https://www.facebook.com/CJCGV" target="_blank"><img
								src="${pageContext.request.contextPath}/resources/img/facebookAPP.png"
								alt="facebookApp"></a></li>
						<li><a href="https://www.instagram.com/cgv_korea/"
							target="_blank"><img
								src="${pageContext.request.contextPath}/resources/img/instarApp.png"
								alt="instarApp"></a></li>
					</ul>
					<ul class="main-service-right">
						<li><a href="mypage">MyCGV</a></li>
						<li><a href="memberInsert">회원가입</a></li>
						<li><a href="login">로그인</a></li>
					</ul>
				</div>
				<div class="main-nav-outer">
					<div class="main-nav">
						<h1>
							<a href="index"><img
								src="${pageContext.request.contextPath}/resources/img/cgvlogo.png"
								alt=""></a>
						</h1>

						<div class="main-nav-mid">
							<ul>
								<li>
									<h2>
										<img
											src="${pageContext.request.contextPath}/resources/img/h2_cultureplex.png"
											alt="">
									</h2>
								</li>
								<li>
									<ul>
										<!--공간확보-->
										<li></li>
										<li><a href="movie">영화</a></li>
										<li><a href="#">예매</a></li>
										<li><a href="theater">극장</a></li>
										<li><a href="event">이벤트&amp;컬처</a></li>
										<!--공간확보-->
										<li></li>
									</ul>
								</li>
							</ul>
						</div>
						<div class="main-nav-right">
							<form action="">
								<input type="text" placeholder="영화 검색"> <input
									type="submit" value="검색">
							</form>
						</div>
					</div>
				</div>
				<div class="header-banner">
					<img
						src="${pageContext.request.contextPath}/resources/img/header-banner.jpg"
						alt="">
				</div>
			</div>
		</header>
	</div>

</body>
</html>
