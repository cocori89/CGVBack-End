<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/movie.css">
</head>
<body>
 <section>
            <div class="contant">
                <div class="contents">
                   <!--무비차트-->
                   <div class="wrap-movie-chart">
                        <div class="tit-heading-wrap">
                            <h3>무비차트</h3>
                            <div class="submenu">
                                <ul>
                                    <li><a href="#">무비차트</a></li>
                                    <li><a href="#">상역예정작</a></li>
                                    <li><a href="#">CGV아트하우스</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="sect-sorting">
                            <div class="nowshow">
                                <input type="checkbox" title="현제선택됨" id="chk_nowshow" checked/>
                                <label for="chk_nowshow">현제 상영작만 보기</label>
                            </div>
                        </div>
                        <!--실제 무비 차트-->
                        <div class="sect-movie-chart">
                            <ol>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.1</strong>
                                        <a href="movieContent?movie_code=${movie1.movie_code}">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/${movie1.movie_poster}">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="movieContent?movie_code=${movie1.movie_code}">
                                            <strong class="title">${movie1.movie_title}</strong>
                                        </a>
                                        <div class="parcent">예매율<span>${movie1.movie_bookingrate}%</span></div>
                                        <span><strong>${movie1.movie_date}<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.2</strong>
                                        <a href="movieContent?movie_code=${movie2.movie_code}">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/${movie2.movie_poster}">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="movieContent?movie_code=${movie2.movie_code}">
                                            <strong class="title">${movie2.movie_title}</strong>
                                        </a>
                                        <div class="parcent">예매율<span>${movie2.movie_bookingrate}%</span></div>
                                        <span><strong>${movie2.movie_date}<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.3</strong>
                                        <a href="movieContent?movie_code=${movie3.movie_code}">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/${movie3.movie_poster}">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="movieContent?movie_code=${movie3.movie_code}">
                                            <strong class="title">${movie3.movie_title}</strong>
                                        </a>
                                        <div class="parcent">예매율<span>${movie3.movie_bookingrate}%</span></div>
                                        <span><strong>${movie3.movie_date}<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.4</strong>
                                        <a href="movieContent?movie_code=${movie4.movie_code}">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/${movie4.movie_poster}">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="movieContent?movie_code=${movie4.movie_code}">
                                            <strong class="title">${movie4.movie_title}</strong>
                                        </a>
                                        <div class="parcent">예매율<span>${movie4.movie_bookingrate}%</span></div>
                                        <span><strong>${movie4.movie_date}<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.5</strong>
                                        <a href="movieContent?movie_code=${movie5.movie_code}">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/${movie5.movie_poster}">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="movieContent?movie_code=${movie5.movie_code}">
                                            <strong class="title">${movie5.movie_title}</strong>
                                        </a>
                                        <div class="parcent">예매율<span>${movie5.movie_bookingrate}%</span></div>
                                        <span><strong>${movie5.movie_date}<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.6</strong>
                                        <a href="movieContent?movie_code=${movie6.movie_code}">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/${movie6.movie_poster}">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="movieContent?movie_code=${movie6.movie_code}">
                                            <strong class="title">${movie6.movie_title}</strong>
                                        </a>
                                        <div class="parcent">예매율<span>${movie6.movie_bookingrate}%</span></div>
                                        <span><strong>${movie6.movie_date}<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                            </ol>
                        </div>
                   </div>               
                   <!--영화 벤허 광고-->
                   <div class="chart-ad-bottom">
                      <a href="">
                        <img src="${pageContext.request.contextPath}/resources/img/movie/adbottom.jpg" alt="벤허 광고">
                      </a>
                   </div>  
                   <!--포토티켓 광고 -->             
                   <div class="sect-ad-benner">
                        <a href="#">
                            <img src="${pageContext.request.contextPath}/resources/img/movie/phototicket.jpg" alt="포토티켓 광고">    
                        </a>
                   </div>  
                   <!--인기 틀레일러 실시간 인기 검색어-->            
                   <div class="cols-rank">
                       <div class="col-rank-trailer">
                           <div class="sect-popular-trailer">
                           <h3>인기 트레일러</h3>
                               <div class="box-image trailer">
                                   <iframe width="378.993" height="152.014" src="https://www.youtube.com/embed/GUfk7Y6xBSs" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                               </div>
                               <div class="box-image">
                                   <img src="${pageContext.request.contextPath}/resources/img/movie/1987.jpg" alt="1987 포스터">
                               </div>
                               <div class="box-contents">
                                   <a href="">
                                       <span>1987<br/>드라마<br>
                                       <span>2017.12.27</span>개봉
                                       </span>
                                       <strong>D-8</strong>
                                   </a>
                               </div>
                           </div>
                           <ul>
                               <li>
                                   <div class="box-image"><a href="">
                                       <iframe width="127" height="71" src="https://www.youtube.com/embed/3toKWj9gkpU" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                   </a></div>
                                   <div class="box-contents"><a href="">메이지 러너: 제스 큐어 <br/>액션,SF, 스릴러<br/>2018.01 개봉예정</a></div>
                               </li>
                               <li>
                                   <div class="box-image"><a href="">
                                       <iframe width="127" height="71" src="https://www.youtube.com/embed/rZnTeTRtRzU" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                   </a></div>
                                   <div class="box-contents"><a href="">위대한 쇼맨<br/>드라마, 뮤지컬 <br/> 2017.12.20 개봉</a></div>
                               </li>
                               <li>
                                   <div class="box-image"><a href="">
                                       <iframe width="127" height="71" src="https://www.youtube.com/embed/sWAZAlM9kHU" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                   </a></div>
                                   <div class="box-contents"><a href="">코코<br/>애니메이션<br/>2018.01.11개봉</a></div>
                               </li>
                               <li>
                                   <div class="box-image"><a href="">
                                       <iframe width="127" height="71" src="https://www.youtube.com/embed/cOsTkVLXcmY" frameborder="0" gesture="media" allow="encrypted-media" allowfullscreen></iframe>
                                   </a></div>
                                   <div class="box-contents"><a href="">윈더<br/>드라마<br/>2017.12.27개봉</a></div>
                               </li>
                           </ul>
                            <div class="col-rank-search">
                               <h3>실시간 인기 검색어</h3>
                               <ol>
                               <li>
                                   <a href="">강철비</a>
                               </li>
                               <li>
                                   <a href="">1987</a>
                               </li>
                               <li>
                                   <a href="">스노우맨</a>
                               </li>
                               <li>
                                   <a href="">라라랜드</a>
                               </li>
                               <li>
                                   <a href="">러브레터</a>
                               </li>
                               <li>
                                   <a href="">뽀로로</a>
                               </li>
                               <li>
                                   <a href="">신과함께 죄와벌</a>
                               </li>
                               <li>
                                   <a href="">신과함께</a>
                               </li>
                               <li>
                                   <a href="">포켓몬스터</a>
                               </li>
                               <li>
                                   <a href="">시사회</a>
                               </li>
                           </ol>
                           <p>2017.12.19기준</p>
                           </div>
                       </div>

                   </div>               
                </div>
            </div>
        </section>
</body>
</html>