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
                                        <a href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/stillrain.jpg" alt="강철비 포스터">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="#">
                                            <strong class="title">강철비</strong>
                                        </a>
                                        <div class="parcent">예매율<span>12.6%</span></div>
                                        <span><strong>2017.12.14<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.2</strong>
                                        <a href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/starwars.jpg" alt="스타워즈 포스터">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="#">
                                            <strong class="title">스타우즈: 라스트 제다이</strong>
                                        </a>
                                        <div class="parcent">예매율<span>11.2%</span></div>
                                        <span><strong>2017.12.14<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.3</strong>
                                        <a href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/mularder.jpg" alt="세 번째 살인 포스터">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="#">
                                            <strong class="title">세 번째 살인</strong>
                                        </a>
                                        <div class="parcent">예매율<span>1.2%</span></div>
                                        <span><strong>2017.12.14<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.4</strong>
                                        <a href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/piber.jpg" alt="튤립피버 포스터">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="#">
                                            <strong class="title">튤립 피버</strong>
                                        </a>
                                        <div class="parcent">예매율<span>1.1%</span></div>
                                        <span><strong>2017.12.14<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.5</strong>
                                        <a href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/remember.jpg" alt="기억의 밤 포스터">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="#">
                                            <strong class="title">기억의 밤</strong>
                                        </a>
                                        <div class="parcent">예매율<span>1.2%</span></div>
                                        <span><strong>2017.12.14<span>개봉</span></strong></span>
                                        <div><a href="#">예매하기</a></div>
                                    </div>
                                </li>
                                <li>
                                    <div class="box-image">
                                        <strong class="rank">No.6</strong>
                                        <a href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/movie/loveletter.jpg" alt="러브레터 포스터">
                                        </a>
                                    </div>
                                    <div class="box-contents">
                                        <a href="#">
                                            <strong class="title">러븥레터</strong>
                                        </a>
                                        <div class="parcent">예매율<span>0.8%</span></div>
                                        <span><strong>2017.12.13<span>개봉</span></strong></span>
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
                                       <sprong>D-8</sprong>
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