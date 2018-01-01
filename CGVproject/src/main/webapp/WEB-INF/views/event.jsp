<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/event.css">

</head>
<body>
<section>
            <div class="contant">
                <div class="event-top">
                    <div class="event-top-title">
                        <h3>EVENT</h3>
                    </div>
                    <div class="event-top-contents">
                        <div class="event-top-content">
                            <ul>
                                <li><a href="eventContent?event_code=${specailEvent1.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${specailEvent1.event_somenail}" alt=""></a></li>
                                <li><a href="eventContent?event_code=${specailEvent1.event_code}">${specailEvent1.event_important } 이벤트</a></li>
                                <li><a href="eventContent?event_code=${specailEvent1.event_code}">${specailEvent1.event_title }</a></li>
                                <li><a href="eventContent?event_code=${specailEvent1.event_code}">기간 : ${specailEvent1.event_startdate } ~ ${specailEvent1.event_enddate }</a></li>
                            </ul>
                        </div>
                        <div class="event-top-content">
                            <ul>
                                <li><a href="eventContent?event_code=${specailEvent2.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${specailEvent2.event_somenail}" alt=""></a></li>
                                <li><a href="eventContent?event_code=${specailEvent2.event_code}">${specailEvent2.event_important } 이벤트</a></li>
                                <li><a href="eventContent?event_code=${specailEvent2.event_code}">${specailEvent2.event_title }</a></li>
                                <li><a href="eventContent?event_code=${specailEvent2.event_code}">기간 : ${specailEvent2.event_startdate } ~ ${specailEvent2.event_enddate }</a></li>
                            </ul>
                        </div>
                        <div class="event-top-content">
                            <ul>
                                <li><a href="eventContent?event_code=${specailEvent3.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${specailEvent3.event_somenail}" alt=""></a></li>
                                <li><a href="eventContent?event_code=${specailEvent3.event_code}">${specailEvent3.event_important } 이벤트</a></li>
                                <li><a href="eventContent?event_code=${specailEvent3.event_code}">${specailEvent3.event_title }</a></li>
                                <li><a href="eventContent?event_code=${specailEvent3.event_code}">기간 : ${specailEvent3.event_startdate } ~ ${specailEvent3.event_enddate }</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="event-bottom">
                    <div class="event-bottom-nav">
                        <ul>
                            <li><a href="">전체</a></li>
                            <li><a href="">맴버십</a></li>
                            <li><a href="">영화/예매</a></li>
                            <li><a href="">CGV아트하우스</a></li>
                            <li><a href="">제휴/할인</a></li>
                            <li><a href="">시사/무대인사</a></li>
                            <li><a href="">CGV극장별</a></li>
                        </ul>
                    </div>
                    <div class="event-bottom-contents">
                        <div class="event-bottom-top"></div>
                        <div class="event-bottom-mid">
                            <div class="event-bottom-content">
                            <div class="content-one">
                                <ul>
                                    <li><a href="eventContent?event_code=${normalEvent1.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent1.event_somenail}" alt=""></a></li>
                                    <li><a href="eventContent?event_code=${normalEvent2.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent2.event_somenail}" alt=""></a></li>
                                    <li><a href="eventContent?event_code=${normalEvent3.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent3.event_somenail}" alt=""></a></li>
                                </ul>
                            </div>
                            <div class="content-two">
                                <ul>
                                    <li><a href="eventContent?event_code=${normalEvent4.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent4.event_somenail}" alt=""></a></li>
                                    <li><a href="eventContent?event_code=${normalEvent5.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent5.event_somenail}" alt=""></a></li>
                                    <li><a href="eventContent?event_code=${normalEvent6.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent6.event_somenail}" alt=""></a></li>
                                </ul>
                            </div>
                            <div class="content-three">
                                <ul>
                                    <li><a href="eventContent?event_code=${normalEvent7.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent7.event_somenail}" alt=""></a></li>
                                    <li><a href="eventContent?event_code=${normalEvent8.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent8.event_somenail}" alt=""></a></li>
                                    <li><a href="eventContent?event_code=${normalEvent9.event_code}"><img src="${pageContext.request.contextPath }/resources/img/event/${normalEvent9.event_somenail}" alt=""></a></li>
                                </ul>
                            </div>
                        </div>
                        </div>
                        <div class="event-bottom-bot">
                            
                        </div>
                        
                    </div>
                </div>
            </div>
        </section>
</body>
</html>