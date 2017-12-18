<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <!-- Start WOWSlider.com HEAD section -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
    <!-- End WOWSlider.com HEAD section -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.vticker-min.js"></script>

</head>

<body>
    <div id="cgvwrap">
        <section>
            <div class="contant">
                <div class="slider">
                    <!-- Start WOWSlider.com BODY section -->
                    <div id="wowslider-container1">
                        <div class="ws_images">
                            <ul>
                                <li><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider1.jpg" alt="slider1" title="slider1" id="wows1_0" /></li>
                                <li><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider2.jpg" alt="slider2" title="slider2" id="wows1_1" /></li>
                                <li><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider3.jpg" alt="slider3" title="slider3" id="wows1_2" /></li>
                                <li><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider4.jpg" alt="slider4" title="slider4" id="wows1_3" /></li>
                                <li><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider5.jpg" alt="slider5" title="slider5" id="wows1_4" /></li>
                                <li><a href="http://wowslider.net"><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider6.jpg" alt="image carousel" title="slider6" id="wows1_5"/></a></li>
                                <li><img src="${pageContext.request.contextPath}/resources/img/data1/images/slider7.jpg" alt="slider7" title="slider7" id="wows1_6" /></li>
                            </ul>
                        </div>
                        <div class="ws_bullets">
                            <div>
                                <a href="#" title="slider1"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider1.jpg" alt="slider1"/>1</span></a>
                                <a href="#" title="slider2"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider2.jpg" alt="slider2"/>2</span></a>
                                <a href="#" title="slider3"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider3.jpg" alt="slider3"/>3</span></a>
                                <a href="#" title="slider4"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider4.jpg" alt="slider4"/>4</span></a>
                                <a href="#" title="slider5"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider5.jpg" alt="slider5"/>5</span></a>
                                <a href="#" title="slider6"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider6.jpg" alt="slider6"/>6</span></a>
                                <a href="#" title="slider7"><span><img src="${pageContext.request.contextPath}/resources/img/data1/tooltips/slider7.jpg" alt="slider7"/>7</span></a>
                            </div>
                        </div>
                        <div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.net">slider</a> by WOWSlider.com v8.8</div>
                        <div class="ws_shadow"></div>
                    </div>
                    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/wowslider.js"></script>
                    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
                    <!-- End WOWSlider.com BODY section -->

                </div>
                <div class="movie-selection">
                    <h3>
                        <img src="${pageContext.request.contextPath}/resources/img/h3_movie_selection.gif" alt="movie selection">
                    </h3>
                    <div class="cons-movie">
                        <iframe width="733" height="388" src="https://www.youtube.com/embed/0lUYfSRmcEE" frameborder="0" allowfullscreen></iframe>
                        <!--이미지 크기 메모 240x388-->
                        <img src="${pageContext.request.contextPath}/resources/img/MurderontheOrientExpress.jpg" alt="오리엔탈 특급살인">
                    </div>
                </div>
                <div class="event">
                    <h3>
                        <img src="${pageContext.request.contextPath}/resources/img/h3_event.gif" alt="event">
                    </h3>
                    <div class="tab-menu">
                        <ul>
                            <li></li>
                            <li><a href="#">CGV스페셜</a></li>
                            <li><a href="#">영화/예매</a></li>
                            <li><a href="#">CGV아트하우스</a></li>
                            <li><a href="#">제휴/할인</a></li>
                            <li><a href="#">멤버십</a></li>
                            <li></li>
                        </ul>
                        <!--링크는 임시로 만들어주세요-->
                        <div class="sect-event">
                            <ul>
                                <li title=""><a href="#"><img src="${pageContext.request.contextPath}/resources/img/sect-event1.jpg" alt=""></a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/resources/img/sect-event2.jpg" alt=""></a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/resources/img/sect-event3.jpg" alt=""></a></li>
                                <li><a href="#"><img src="${pageContext.request.contextPath}/resources/img/sect-event4.jpg" alt=""></a></li>
                            </ul>
                        </div>
                        <div class="cols-banner">
                            <div class="cols-banner1"><img src="${pageContext.request.contextPath}/resources/img/cols-banner1.jpg" alt=""></div>
                            <div class="cols-banner2"><img src="${pageContext.request.contextPath}/resources/img/cols-banner2.jpg" alt=""></div>
                            <div class="cols-banner3"><img src="${pageContext.request.contextPath}/resources/img/cols-banner3.jpg" alt=""></div>
                        </div>
                        <!--공지사항을 나중에 제목만 리스트롤 뽑아 낼것임 공지 사항등록 한것중에 필요 한것들만 -->
                        <div class="notice-outer-outer">
                            <div class="notice-outer">
                                     <p><img src="${pageContext.request.contextPath}/resources/img/ico_notice.png" alt=""> 공지사항&nbsp;</p>
                                <div class="notice">
                                    <ul>
                                    	
 	                                   <c:forEach var="noticeVO" items="${noticeVO}">
 	                                   		<li><a href="noticeList">${noticeVO.notice_title }</a></li>
 	                                   </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!--공지사항을 나중에 제목만 리스트롤 뽑아 낼것임 공지 사항등록 한것중에 필요 한것들만 -->
                    </div>
                </div>

            </div>
        </section>
        <aside></aside>
    </div>
</body>
<!--js파일로 이동해야함-->
<script>
    $(function() {
        $('.notice').vTicker({
            // 스크롤 속도(default: 700)  
            speed: 500,
            // 스크롤 사이의 대기시간(default: 4000)  
            pause: 3000,
            // 스크롤 애니메이션  
            animation: 'fade',
            // 마우스 over 일때 멈출 설정  
            mousePause: false,
            // 한번에 보일 리스트수(default: 2)  
            showItems: 4,
            // 스크롤 컨테이너 높이(default: 0)  
            height: 0,
            // 아이템이 움직이는 방향, up/down (default: up)  
            direction: 'up'
        });
    });

</script>
<!--js파일로 이동해야함-->

</html>
