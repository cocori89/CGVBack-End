<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
    <title>영화 그 이상의 감동. CGV</title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/img/cjcl.png">

    <!-- Start WOWSlider.com HEAD section -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
    <!-- End WOWSlider.com HEAD section -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.vticker-min.js"></script>

</head>

<body>
    <div id="cgvwrap">
        <header>
            <div class="head">
                <div class="main-service">
                    <ul class="main-service-left">
                        <li><a href="http://section.cgv.co.kr/event/appRenewal/default.aspx" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/cgvApp.png" alt="cgvAPP"></a></li>
                        <li><a href="https://www.facebook.com/CJCGV" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/facebookAPP.png" alt="facebookApp"></a></li>
                        <li><a href="https://www.instagram.com/cgv_korea/" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/instarApp.png" alt="instarApp"></a></li>
                    </ul>
                    <ul class="main-service-right">
                        <li>MyCGV</li>
                        <li>회원가입</li>
                        <li>로그인</li>
                    </ul>
                </div>
                <div class="main-nav-outer">
                    <div class="main-nav">
                        <h1><a href="index.html"><img src="${pageContext.request.contextPath}/resources/img/cgvlogo.png" alt=""></a></h1>

                        <div class="main-nav-mid">
                            <ul>
                                <li>
                                    <h2><img src="${pageContext.request.contextPath}/resources/img/h2_cultureplex.png" alt=""></h2>
                                </li>
                                <li>
                                    <ul>
                                        <!--공간확보-->
                                        <li></li>
                                        <li><a href="#">영화</a></li>
                                        <li><a href="#">예매</a></li>
                                        <li><a href="#">극장</a></li>
                                        <li><a href="#">이벤트&amp;컬처</a></li>
                                        <!--공간확보-->
                                        <li></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="main-nav-right">
                            <form action="">
                                <input type="text" placeholder="영화 검색">
                                <input type="submit" value="검색">
                            </form>
                        </div>
                    </div>
                </div>
                <div class="header-banner">
                    <img src="${pageContext.request.contextPath}/resources/img/header-banner.jpg" alt="">
                </div>
            </div>
        </header>
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
                                <h3>
                                    <img src="${pageContext.request.contextPath}/resources/img/ico_notice.png" alt=""> 공지사항
                                </h3>

                                <div class="notice">
                                    <ul>
                                        <li>notice-subject-test1</li>
                                        <li>notice-subject-test2</li>
                                        <li>notice-subject-test3</li>
                                        <li>notice-subject-test4</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!--공지사항을 나중에 제목만 리스트롤 뽑아 낼것임 공지 사항등록 한것중에 필요 한것들만 -->
                    </div>
                </div>

            </div>
        </section>
        <footer>
            <div class="footwrap">
                <iframe src="http://ad.cgv.co.kr/NetInsight/html/CGV/CGV_201401/main@Bottom" width="100%" height="240" title="광고-딜카" frameborder="0" scrolling="no" marginwidth="0" marginheight="0" name="Bottom" id="Bottom"></iframe>
            </div>
            <div class="sect-smuse">
                <ul>
                    <li><a href="#" class="dx">4dx</a></li>
                    <li><a href="#" class="imax">imax</a></li>
                    <li><a href="#" class="screenx">screenx</a></li>
                    <li><a href="#" class="spherex">spherex</a></li>
                    <li><a href="#" class="soundx">soundx</a></li>
                    <li><a href="#" class="tempur-cinema">tempur-cinema</a></li>
                    <li><a href="#" class="gold-class">gold-class</a></li>
                    <li><a href="#" class="cine-de-chef">cine-de-chef</a></li>
                    <li><a href="#" class="private-cinema">private-cinema</a></li>
                    <li><a href="#" class="cinekids">cinekids</a></li>
                </ul>
            </div>
            <div class="sect-cinfo">
                <div class="policy">
                    <ul>
                        <li><a href="#">회사소개</a></li>
                        <li><a href="#">IR</a></li>
                        <li><a href="#">채용정보</a></li>
                        <li><a href="#">광고/프로모션문의</a></li>
                        <li><a href="#">제휴문의</a></li>
                        <li><a href="#">출점문의</a></li>
                        <li><a href="#">이용약관</a></li>
                        <li><a href="#">편성기준</a></li>
                        <li><a href="#" id="personal">개인정보처리방침</a></li>
                        <li><a href="#">법적고지</a></li>
                        <li><a href="#">이메일주소무단수집거부</a></li>
                        <li><a href="#">상생경영</a></li>
                        <li><a href="#">사이트맵</a></li>
                    </ul>
                </div>
                <div class="com-cinfo">
                    <div class="logo"></div>
                    <div class="address">
                        (04377)서울특별시 용산구 한강대로 23길 55, 아이파크몰 6층(한강로동)<br/> 대표이사 : 서정 | 사업자등록번호 : 104-81-45690 | 통신판매업신고번호 : 2017-서울용산-0662<br/> 개인정보보호 책임자 : 마케팅 담당 정종민 | 대표이메일 : cjcgvmaster@cj.netCGV | 고객센터 : 1544-1122
                    </div>
                    <div class="share-outer">
                        <div class="share">
                            <a href="#" class="facebook"></a>
                            <a href="#" class="twitter"></a>
                            <a href="#" class="instagram"></a>
                            <form action="">
                                <select>
                                   <option>계열사 바로가기</option>
                                    <optgroup label="CJ그룹">
                                        <option value="">CJ주식회사</option>
                                    </optgroup>
                                    <optgroup label="엔터네이먼트 & 미디어">
                                        <option value="">CJ E&amp;M</option>
                                        <option value="">CJ CGV</option>
                                        <option value="">CJ Hello</option>
                                        <option value="">CJ 파워캐스트</option>
                                    </optgroup>
                                       <optgroup label="식품 & 식품서비스">
                                           <option value="">CJ 제일제당</option>
                                           <option value="">CJ 프레시웨이</option>
                                           <option value="">CJ 푸드빌</option>
                                           <option value="">CJ 엠디원</option>
                                       </optgroup>
                                       <optgroup label="생명공학">
                                           <option value="">CJ 제일제당</option>
                                           <option value="">CJ 헬스케어</option>
                                       </optgroup>
                                       <optgroup label="신유통">
                                           <option value="">CJ 오쇼핑</option>
                                           <option value="">CJ 대한통운</option>
                                           <option value="">CJ 텔레닉스</option>
                                           <option value="">CJ 올리네트웟스</option>
                                       </optgroup>
                                       <optgroup label="인프라">
                                           <option value="">CJ 건설</option>
                                       </optgroup>
                                        
                                </select>
                                <input type="submit" value="GO">
                            </form>
                        </div>
                        <div class="copyright">
                            © 2017 CJ CGV. All Rights Reserved
                        </div>
                    </div>
                </div>
            <div class="footer-bottom"></div>
            </div>
        </footer>
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
