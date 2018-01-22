<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/theataer.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/theater.css">
</head>

<body>
	<section>
		<div class="contant">
			<div class="theater-menu">
				<!--벽돌배경넣어주세요-->
				<div class="theater-inner">
					<div class="sect-city">
						<ul>
							<li>
								<div class="city">서울</div>
								<div class="area" id="area-select">
									<ul>
										<c:forEach items="${seoulVO}" var="seoul">
											<li><a href="theaterSite?site_code=${seoul.site_code }">CGV${seoul.site_code }</a></li>
										</c:forEach>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">경기</div>
								<div class="area">
									<ul>
										<li><a href="">CGV경기광주</a></li>
										<li><a href="">CGV광명철산</a></li>
										<li><a href="">CGV구리</a></li>
										<li><a href="">CGV김포</a></li>
										<li><a href="">CGV김포운항</a></li>
										<li><a href="">CGV김포풍무</a></li>
										<li><a href="">CGV동백</a></li>
										<li><a href="">CGV동수원</a></li>
										<li><a href="">CGV동탄</a></li>
										<li><a href="">CGV배곧</a></li>
										<li><a href="">CGV방계</a></li>
										<li><a href="">CGV부천</a></li>
										<li><a href="">CGV부천역</a></li>
										<li><a href="">CGV북수원</a></li>
										<li><a href="">CGV산본</a></li>
										<li><a href="">CGV서현</a></li>
										<li><a href="">CGV소풍</a></li>
										<li><a href="">CGV수원</a></li>
										<li><a href="">CGV시흥</a></li>
										<li><a href="">CGV안산</a></li>
										<li><a href="">CGV야탑</a></li>
										<li><a href="">CGV역곡</a></li>
										<li><a href="">CGV오리</a></li>
										<li><a href="">CGV용인</a></li>
										<li><a href="">CGV의정부</a></li>
										<li><a href="">CGV의정부태흥</a></li>
										<li><a href="">CGV이천</a></li>
										<li><a href="">CGV일산</a></li>
										<li><a href="">CGV죽전</a></li>
										<li><a href="">CGV파주문산</a></li>
										<li><a href="">CGV판교</a></li>
										<li><a href="">CGV평촌</a></li>
										<li><a href="">CGV평택</a></li>
										<li><a href="">CGV평택비전</a></li>
										<li><a href="">CGV평택소사</a></li>
										<li><a href="">CGV화정</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">인천</div>
								<div class="area">
									<ul>
										<li><a href="">CGV계양</a></li>
										<li><a href="">CGV남주안</a></li>
										<li><a href="">CGV부평</a></li>
										<li><a href="">CGV연수역</a></li>
										<li><a href="">CGV인청</a></li>
										<li><a href="">CGV인청공항</a></li>
										<li><a href="">CGV인천논현</a></li>
										<li><a href="">CGV인천연수</a></li>
										<li><a href="">CGV주안역</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">강원</div>
								<div class="area">
									<ul>
										<li><a href="">CGV강릉</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">대전/충청</div>
								<div class="area">
									<ul>
										<li><a href="">CGV당진</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">대구</div>
								<div class="area">
									<ul>
										<li><a href="">CGV대구</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">부산/울산</div>
								<div class="area">
									<ul>
										<li><a href="">CGV남포</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">경상</div>
								<div class="area">
									<ul>
										<li><a href="">CGV거제</a></li>
									</ul>
								</div>
							</li>
							<li>
								<div class="city">광주/전라/제주</div>
								<div class="area">
									<ul>
										<li><a href="">CGV광양</a></li>
									</ul>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="theater">
				<div class="theater-top">
					<img src="${pageContext.request.contextPath }/resources/img/theater/h3_theater.gif" alt="">
				</div>
				<div class="theater-content">
					<h3>CGV목동</h3>
					<img src="${pageContext.request.contextPath }/resources/img/theater/mok01.jpg" alt="">
					<div class="theater-addr">${site.site_addr }</div>
					<div class="theater-phone">${site.site_phone }</div>
					<div class="theater-info">${site.site_num}관<!-- 여기다가는 모든 theater_people 더하면 됨 --></div>
				</div>
			</div>
			<div class="timetable">
				<div class="timetable-top">상영시간표</div>
				<div class="timetable-date">
					<ul>
						<c:forEach items="${screeningDate}" var="date">
							<li><a href="theaterSiteDate?site_code=${site_code}&timetable_date=${date.yy}-${date.mm}-${date.dd}">
									<div>
										<ul>
											<li class="date-month">${date.mm}월</li>
											<li class="date-day-fo-the-week">${date.ee}</li>
										</ul>
									</div>
									<div class="date-day">${date.dd}</div>
							</a></li>
						</c:forEach>
					</ul>
				</div>
				<!-- test area-->
				<div class="timetable-content">
					<c:forEach items="${resultList}" var="iiii">
						<c:set var="movi" value="${iiii.movieVO}"></c:set>
						<div class="content-info">
							${movi.movie_title}<span> ${movi.movie_genre} / ${movi.movie_time} 분 / ${movi.movie_date} 개봉</span>
						</div>
						<c:forEach items="${iiii.timetableVO}" var="timetable"> 
						<div class="content-time">
							<ul>
								<li>
									<ul class="time-top">
										<li>2D</li>
										<li>${timetable.theater_code}관</li>
										<li>총 178석</li>
									</ul>
									<ul class="time">
										<c:forEach items="${timetable.theater_start}" var="start">
										<li><a href="">
												<ul>
													<li>${start}</li>
													<li>178석</li>
												</ul>
										</a></li>
										</c:forEach>
									</ul>
								</li>
							</ul>
						</div>
						</c:forEach>
					</c:forEach>
				</div>
				<!-- test area -->
			</div>
			<div class="related-event">
				<div class="relarelated-event-top">
					<h3>
						<img src="${pageContext.request.contextPath }/resources/img/theater/h3_relation_event.gif" alt="">
					</h3>
				</div>
				<div class="relarelated-event-content">
					<ul>
						<li><a href="">
								<ul>
									<li><img src="${pageContext.request.contextPath }/resources/img/theater/releatedenent1.jpg" alt=""></li>
									<li>CGV극장별</li>
									<li>신라인터넷면세점신규화원가입하기</li>
									<li>기간 : 2017.09.27 ~ 2018.03.31</li>
								</ul>
						</a></li>
						<li><a href="">
								<ul>
									<li><img src="${pageContext.request.contextPath }/resources/img/theater/releatedenent2.jpg" alt=""></li>
									<li>CGV극장별</li>
									<li>[CGV서울 외 97개 극장]겨울 한정판</li>
									<li>기간 : 2017.12.22 ~ 2018.01.31</li>
								</ul>
						</a></li>
						<li><a href="">
								<ul>
									<li><img src="${pageContext.request.contextPath }/resources/img/theater/releatedenent3.jpg" alt=""></li>
									<li>CGV극장별</li>
									<li>국립공원 문화 운동 캠페인_그린포인트</li>
									<li>기간 : 2017.06.27 ~ 2018.05.31</li>
								</ul>
						</a></li>

					</ul>
				</div>
			</div>
		</div>
	</section>
</body>

</html>
