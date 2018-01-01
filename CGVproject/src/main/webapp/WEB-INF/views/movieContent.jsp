<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/movie.css">

</head>
<body>
<section>
            <div class="contant">
                <div class="movie-content">
                    <div class="movie-tit">
                        <h2>영화 상세</h2>
                    </div>
                    <div class="movie-info">
                        <div class="movie-info-poster">
                            <img src="${pageContext.request.contextPath }/resources/img/movie/${movie.movie_poster}" alt="강철비 포스터">
                        </div>
                        <div class="movie-info-content">
                            <h3>${movie.movie_title}</h3>
                            <div>
                                <p>예매율 ${movie.movie_bookingrate }%</p>
                            </div>
                            <table>
                                <tr>
                                    <td>감독:${movie.movie_director }</td>
                                    <td>배우:${movie.movie_acter}</td>
                                </tr>
                                <tr>
                                    <td>장르:${movie.movie_genre }</td>
                                    <td>기본:${movie.movie_grade }, ${movie.movie_time }분, ${movie.movie_nation }</td>
                                </tr>
                                <tr>
                                    <td colspan="2">개봉 :${movie.movie_date }</td>
                                </tr>
                                <tr>
                                    <td>공식사이트:</td>
                                </tr>
                            </table>
                              <div class="">
                            <button class="btn btn-danger">예매하기</button>
                        </div>
                        </div>
                      
                    </div>
                    <div class="movie-detail">
                    	<textarea class="form-control" rows="10" cols="50">
	                        ${movie.movie_plot }
                    	</textarea>
                    </div>
                    <!--아직손봐야할 구간 -->
                    <div class="starpint">
                        <table>
                            <tr>
                                <td>coco</td>
                                <td>좋은 영화입니다. </td>
                                <td>2017.12.20</td>
                            </tr>
                            <tr>
                                <td>bluehole</td>
                                <td>별로인 영화입니다. </td>
                                <td>2017.12.20</td>
                            </tr>
                            <tr>
                                <td>whotthe</td>
                                <td>정우성 사랑해요 영화입니다. </td>
                                <td>2017.12.20</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </section>
</body>
</html>