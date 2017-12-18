<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/content.css">

</head>
<body>
	<section>
		<div class="contant">
			<div class="cols-content">
				<div class="col-aside">
					<div class="sub">
						<ul>
							<!--클릭후 변화는 자바스크립트로 할것-->
							<li><a href="">공지사항</a></li>
						</ul>
					</div>
					<!--여기는 배너 공간-->
					<div class="ad-area"></div>
				</div>
				<div class="col-detail">
					<div class="customer_top">
						<h2 class="tit">공지사항</h2>
						<p class="stit">CGV의 주요한 이슈 및 여러가지 소식들을 확인하실 수 있습니다.</p>
					</div>
					<div class="search_area">
						<form action="">
							<select name="slesearchfield" id="">
								<option value="제목">제목</option>
								<option value="내용">내용</option>
							</select> <input type="search" placeholder="검색어를 입력해 주세요"> <input
								type="submit" value="검색하기">
						</form>
					</div>
					<div class="c_tab_wrap">
						<ul>
							<li><a href="#">전체</a></li>
							<li><a href="#">시스템점검</a></li>
							<li><a href="#">극장</a></li>
							<li><a href="#">기타</a></li>
						</ul>
					</div>
					<div class="search_result">
						<span>총 ${noticeCount}건이 있습니다.</span>
					</div>
					<div class="tbl_area">
						<table class="table table-hover">
							<tr>
								<th>번호</th>
								<th>구분</th>
								<th>제목</th>
								<th>등록일</th>
								<th>조회수</th>
							</tr>
							<c:forEach items="${noticeVO}" var="notice">
								<tr>
									<td>${notice.notice_code}</td>
									<td>${notice.notice_kind }</td>
									<td><a href="noticeContent?notice_code=${notice.notice_code}">${notice.notice_title }<a/></td>
									<td>${notice.notice_date }</td>
									<td>${notice.notice_hit }</td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<div class="text-center">
						<div class="paging ">
							<ul>
								<c:set var="end" value="${start+5 }"/>
								<!-- 마지막 블록 -->
								<c:if test="${end>pageBlock }">
									<c:set var="end" value="${pageBlock }"/>
									<li><a href="noticeListPage?listNum=${start-4}&pageStartNum=${start-5}">이전</a></li>
									<c:forEach var="page" begin="${start+1}" end="${end}" >
										<li><a href="noticeListPage?listNum=${page}&pageStartNum=${start}">${page}</a></li>
									</c:forEach> 
									<li><a>다음</a></li>
								</c:if>
								<!-- 첫블록 -->
								<c:if test="${end<pageBlock }">
									<c:if test="${start == 0}" >	
										<li><a>이전</a></li>
									</c:if>
									<c:if test="${start > 0}" >	
										<li><a href="noticeListPage?listNum=${start-4}&pageStartNum=${start-5}">이전</a></li>
									</c:if>
						 			<c:forEach var="page" begin="${start+1}" end="${end}" >
										<li><a href="noticeListPage?listNum=${page}&pageStartNum=${start}">${page}</a></li>
								 	</c:forEach> 
									<li><a href="noticeListPage?listNum=${end+1}&pageStartNum=${end}">다음</a></li> 
								</c:if>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>