<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/reservation.css">

</head>
<body>
        <section>
            <div class="contant">    
                <div class="aside">
                    <div class="asidehome">
                        <a href="">MY CGV HOME</a>
                    </div>
                    <ul>
                        <li><a href="">회원정보 수정</a></li>
                        <li><a href="">예약 확인</a></li>
                        <li><a href="">관람권/쿠폰</a></li>
                    </ul>
                </div>
                
                <div class="contants">
                <c:forEach items="${reservationVO }" var="reservation">
                <c:if test="${reservation.reservation_cancel == 0}">
                <div class="reservation">
                        <div class="reimg">
                           <a href="movieContent?movie_code=${reservation.movie_code}">
                                <img src="${pageContext.request.contextPath }/resources/img/movie/${reservation.movie_poster}" alt="">
                           </a>
                        </div>
                        <div class="recontent">
                            <div class="rec-title"><a href="movieContent?movie_code=${reservation.movie_code }">${reservation.movie_title}</a></div>
                            <div class="rec-date">관람 일시 : <a href="movieContent?movie_code=${reservation.movie_code}">${reservation.timetable_date}(${reservation.timetable_day}) ${reservation.timetable_start}~${reservation.timetable_end}</a></div>
                            <div class="rec-info">관람 장소 : <a href="movieContent?movie_code=${reservation.movie_code}">CGV ${reservation.site_code} ${reservation.theater_num}관/${reservation.reservation_people}명</a></div>
							<c:if test="${reservation.reservation_star == 0}">
	                            <div class="rec-star"><a>이영화를 평가 해주세요</a></div>
	                            <div class="rec-menu">
                                <form action="star" class="form-group" method="post">
                                    <span class="selspan">영화의 점수를 평가해 주세요! </span>
                                    <select name="star" id="" class="form-control selstar" width="5px">
                                        <option value="1">1점</option>
                                        <option value="1.5">1.5점</option>
                                        <option value="2">2점</option>
                                        <option value="2.5">2.5점</option>
                                        <option value="3">3점</option>
                                        <option value="3.5">3.5점</option>
                                        <option value="4">4점</option>
                                        <option value="4.5">4.5점</option>
                                        <option value="5">5점</option>
                                    </select>
                                    <input type="submit" value="평가하기" class="btn btn-info">
                                    <input type="hidden" value="${reservation.reservation_code}" name="reservation_code">
                                    <input type="hidden" value="${reservation.movie_code}" name="movie_code">
                                </form>
                            </div>
							</c:if>
							<c:if test="${reservation.reservation_star == 1}">
	                            <div class="rec-star"><a>고객님께서 이 영화는 평가 하셨습니다.</a></div>
							</c:if>
                        </div>
                        <div class="reprice">
                            <div class="rec-day">결제 날짜 <span>${reservation.reservation_date}</span></div>
                            <div class="rec-price">결제 금액 <span>${reservation.reservation_price}</span>원</div>
                           <form action="reservationDelete" class="cencel-info" method="post">
                            <div class="rec-cancel"><button class="btn btn-danger cancel" type="submit">예약 취소</button></div>
                               <input type="hidden" value="${reservation.reservation_code}" name="reservation_code">
                           </form>
                        </div>
                    </div>
                </c:if>
                </c:forEach>
                </div>
            </div>
        </section>
         <script>
             $(function(){
            	 $(".rec-menu").hide();
                 $(".rec-star").on("click",function(){
                     $(this).next(".rec-menu").toggle();
                 });  
                $(".cancel").on("click",function(){
                    confirm("예약을 취소하시겠습니까?")
                    return
                })  
             })                 
         </script>

</body>
</html>