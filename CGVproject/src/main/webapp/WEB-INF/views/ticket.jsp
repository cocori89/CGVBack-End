<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/ticket.css">
</head>
<body>
        <section>
            <div class="contant">
                <div class="contents">
                    <div class="ticket">
                        <form action="cseat" method="get">
                            <div class="ticket-top">
                                <div class="tt-movie">영화</div>
                                <div class="tt-site">극장</div>
                                <div class="tt-date">날짜</div>
                                <div class="tt-time">시간</div>
                            </div>
                            <div class="ticket-bottom">
                                <div class="tb-movie">
									
                                    <ul>
                                    	<c:forEach items="${movieVO}" var="movie" varStatus="status">
                                    		<li>
                                       		    <input type="radio" name="title" class="tb-movie-btn" id="tb-movie${status.count}" value="${movie.movie_title}">
                                         		<label for="tb-movie${status.count}">${movie.movie_title}</label>
                                        	</li>
                                    	</c:forEach>
                                    </ul>
                                </div>
                                <div class="tb-site">
                                    <div class="tb-left">
                                        <ul>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left1" value="1">
                                                <label for="tb-left1">서울</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left2" value="2">
                                                <label for="tb-left2">경기</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left3" value="3">
                                                <label for="tb-left3">인천</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left4" value="4">
                                                <label for="tb-left4">강원</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left5" value="5">
                                                <label for="tb-left5">대전/충청</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left6" value="6">
                                                <label for="tb-left6">부산/울산</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left7" value="7">
                                                <label for="tb-left7">경상</label>
                                            </li>
                                            <li>
                                                <input type="radio" name="location" class="tb-left-btn" id="tb-left8" value="8">
                                                <label for="tb-left8">광주/전라/제주</label>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="tb-right">
                                  
                                        <ul>
                                        </ul>
                                    </div>
                                </div>
                                <div class="tb-date">
                                    <div class="tb-year"></div>
                                    <div class="tb-month"></div>
                                    <ul>
                                    </ul>
                                </div>
                                <div class="tb-time">
                                    <ul>
                                    </ul>
                                </div>
                            </div>
                            <div class="select-go">
                                <div class="select-info">
                                   <ul>
                                    <li class="sm">선택하신 영화 - <span class="info-movie"></span></li>
                                    <li class="st">극장 - <span class="info-site"></span></li>
                                    <!--년월을 바로 뽑아준다.-->
                                    <li class="sd">날짜 - <span class="info-y"></span>년<span class="info-m"></span>월 <span class="info-date"></span>일 시간<span class="selet-time"></span></li>
                                    
                                </ul> 
                                </div>
                                <div class="selet-btn">
                                    <input type="hidden" name="reltitle" value="">
                                    <input type="hidden" name="relsite" value="">
                                    <input type="hidden" name="reltheater" value="">
                                    <input type="hidden" name="relmonth" value="">
                                    <input type="hidden" name="reltime" value="">
                                    <input type="hidden" name="relm" value="">
                                    <input type="hidden" name="rely" value="">
                                    <button class="btn btn-danger" onclick="submit()"><span>&rarr;</span><br>좌석선택</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
  	<script>
  		$(function(){
  			// 클릴했을때 영화 정보 나올수 있게 해주는 메서드 
  			var selInfo = function(){
  				$(".sm").show();
  			var title1 = $(".tb-movie-btn:checked+label").text();
                  $(".info-movie").text(title1)/// 선택 된것을 보여줘야 한다. 
                    $(".tb-movie>ul>li").on("click",function(){
                        var title = $(this).find("label").text();
                        $(".sm").show();
                        $(".info-movie").text(title);
                        $("input[name='reltitle']").val(title);
                    })
                    $(".tb-right>ul>li").on("click",function(){
                        var site = $(this).find("label").text();
                        $(".st").show();
                        $(".info-site").text(site);
                        $("input[name='relsite']").val(site);
                    })
             
                    $(".tb-date>ul>li").on("click",function(){
                        var month = $(this).find("label").text();
                        $(".sd").show();
                        $(".info-date").text(month);
                        $("input[name='relmonth']").val(month);
                    })
                    $(".tb-time-btn").on("click",function(){
                        var time = $(this).next("label").text();
                        $(".sd").show();
                        $(".selet-time").text(time);
                        $("input[name='reltime']").val(time);
                        var thaeater3 = $("input[name='reltheater']").val($(this).parent().parent().prev().find("li:nth-of-type(2)").text());
                        $("input[name='reltheater']").val(thaeater3.val());
                        console.log(thaeater3.val()+"")
                    })
  			}
  			//상영관 클릭하면 날짜 나오게 해야함.
  			var selSite = function(){
  				$(".tb-date ul").empty();

    			$(".tb-right-btn").on("click",function(){
    				var site2 = $("input[name='site']:checked").val();
    				var title2 = $("input[name='title']:checked").val();
    				  $.ajax({
     					url:"${pageContext.request.contextPath }"+"/ticketDate",
     					type: "get",
     					data:{
           					"site_code" : site2,
           					"movie_title" : title2
     					},
     					success: function(data){
     						var date = JSON.parse(data);
     						$(".tb-date ul").empty();
     						console.log("객체"+date);
     						var strYear = date[0].substring(0,4);
     						var strMonth = date[0].substring(5,7);
     						console.log("출력될 년"+strYear);//삭제
     						console.log("출력할s 월"+strMonth);//삭제
     						for(var i = 0 ; i<date.length; i++){
      							var strDate = date[i].substring(8,10);
       						console.log(date[i]);//삭체
       						console.log(strDate);//삭제
       						var week = ['일', '월', '화', '수', '목', '금', '토'];
       						var dayOfWeek = week[new Date(date[i]).getDay()];
       						console.log(dayOfWeek);//삭제
       						$(".tb-date ul").append('<li><input type="radio" name="date" class="tb-month-btn" id="tb-month'+(i+1)+'" value="'+strDate+'"><label for="tb-month'+(i+1)+'">'+dayOfWeek+strDate+'</label></li>');

     						}
     						$(".tb-year").text(strYear);
     						$(".tb-month").text(strMonth);
     						$(".info-y").text(strYear);
     						$(".info-m").text(strMonth);
     						$("input[name='rely']").val(strYear);
     						$("input[name='relm']").val(strMonth);
     						
     						selInfo();
     						selDate();
     					}
    					});//ajax end   
   			})	
  			}
  			//시간이 나타나야함.
  			var selDate = function(){
   			$(".tb-month-btn").on("click",function(){
   				/* 
   				 날짜(년+월+일 ) + 사이트 코드 + 영화 제목 => 시간 뽑아 오기 
   				*/
   				var year = $(".tb-year").text();
   				var month = $(".tb-month").text();
   				var date = $("input[name='date']:checked").val();
   				var date3 = year+"-"+month+"-"+date;
   				var site3 = $("input[name='site']:checked").val();
   				var title3 = $("input[name='title']:checked").val();
   				$.ajax({
   					url:"${pageContext.request.contextPath }"+"/ticketTime",
   					type: "get",
   					data:{
     					"site_code" : site3,
     					"movie_title" : title3,
     					"timetable_date" : date3
   					},
   					success: function(data){
   						var time = JSON.parse(data);
   						var theater_code = time.theater_code;
   						
   						//키값 뽑기
   						var keys=[];
   							for(var k in time){
   								keys.push(k);
   								console.log(k)
   								console.log(time[k])
   							}
   						//키값
   						$(".tb-time>ul").empty();
   						 console.log("데이터 결과 값(상영관) =" + time.theater_code);
   						var k = 0;
   						for(var i = 0; i<theater_code.length; i++ ){
   							var start =time[keys[i+1]];//시작 시간 키값
   							var strcode = theater_code[i].substring(theater_code[i].length-2,theater_code[i].length)//관 숫자
   							$(".tb-time>ul").append('<li><ul class="time-top"><li>2D</li><li>'+strcode+'관</li><li>(총 178석)</li></ul><ul class="time-bottom'+i+'"></ul>');
   							for(var j=0; j<start.length;j++){
   								var g= k++;
   								$(".time-bottom"+i).append('<li><input type="radio" name="start" class="tb-time-btn" id="tb-time'+g+'" value="'+start[j]+'"><label for="tb-time'+g+'">'+start[j]+'</label></li>');
   							console.log(start[j]);
   							}
   						} 
   						selInfo();
   					 $("input[name='reltitle']").val(title3);
   					}
  					});//ajax end
   			});
  			}
  			
  			// 페이지 시작시 영화 정보 숨김
  			$(".sm").hide();
              $(".st").hide();
              $(".sd").hide();
              //영화 클릭하면 상영 하는 상영관 정보 보여줌
  			$(".tb-movie label").on("click",function(){
  				var title = $(this).prev(".tb-movie-btn").val();
  				var location = $("input[name='location']:checked").val();
  				//alert("눌림")
  				 $.ajax({
  					url:"${pageContext.request.contextPath }"+"/ticketSite",
  					type: "get",
  					data:{
    					"movie_title" : title,
				"location_num" : location		                                    						
  					},
  					success: function(data){
  						var a = JSON.parse(data)
  						$(".tb-right ul").empty();
  						for(var i=0; i<a.length;i++){
  							$(".tb-right ul").append('<li><input type="radio" name="site" class="tb-right-btn" id="tb-righr'+(i+1)+'" value="'+a[i]+'"><label for="tb-righr'+(i+1)+'">'+a[i]+'</label></li>');
  						}
  						selInfo();
  						selSite();
  					}
  				});//ajax end 
  			});
              //지역 클릭하면 사영 하는 상영관 보여줌
  			$(".tb-left label").on("click",function(){
  				var location = $(this).prev(".tb-left-btn").val();
  				var title = $("input[name='title']:checked").val();
  				 $.ajax({
  					url:"${pageContext.request.contextPath }"+"/ticketSite",
  					type: "get",
  					data:{
    					"movie_title" : title,
				"location_num" : location		                                    						
  					},
  					success: function(data){
  						var a = JSON.parse(data)
  						$(".tb-right ul").empty();
  						for(var i=0; i<a.length;i++){
  							$(".tb-right ul").append('<li><input type="radio" name="site" class="tb-right-btn" id="tb-righr'+(i+1)+'" value="'+a[i]+'"><label for="tb-righr'+(i+1)+'">'+a[i]+'</label></li>');
  						}
  						selInfo();
  						selSite();
  					}
  				});//ajax end 
  			});
  		});
  	</script>
</body>
</html>