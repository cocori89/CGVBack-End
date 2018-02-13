<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/cseat.css">



</head>
<body>
  <section>
            <div class="contant">
                <form action="payment" method="get">
                    <div class="contents">
 	    	             <input type="hidden" name="reltitle" value="${reltitle }">
    	                 <input type="hidden" name="relsite" value="${relsite }">
                         <input type="hidden" name="relmonth" value="${relmonth }">
                         <input type="hidden" name="reltime" value="${reltime }">
                         <input type="hidden" name="reltheater" value="${reltheater }">
                         <input type="hidden" name="rely" value="${rely}">
                         <input type="hidden" name="relm" value="${relm}">
                         <input type="hidden" name="relseat" value="">
                        <div class="seat-title">
                            <span>인원/좌석</span>
                        </div>
                        <div class="seat-info">
                            <div class="si-people">
                                <ul>
                                    <li>
                                        <spqn>일반 -</spqn>
                                        <input type="radio" value="0" name="adult" id="adult0" checked><label for="adult0">0</label>
                                        <input type="radio" value="1" name="adult" id="adult1"><label for="adult1">1</label>
                                        <input type="radio" value="2" name="adult" id="adult2"><label for="adult2">2</label>
                                        <input type="radio" value="3" name="adult" id="adult3"><label for="adult3">3</label>
                                        <input type="radio" value="4" name="adult" id="adult4"><label for="adult4">4</label>
                                        <input type="radio" value="5" name="adult" id="adult5"><label for="adult5">5</label>
                                        <input type="radio" value="6" name="adult" id="adult6"><label for="adult6">6</label>
                                        <input type="radio" value="7" name="adult" id="adult7"><label for="adult7">7</label>
                                        <input type="radio" value="8" name="adult" id="adult8"><label for="adult8">8</label>
                                    </li>
                                    <li>
                                        <spqn>청소년 -</spqn>
                                        <input type="radio" value="0" name="teenager" id="teenager0" checked><label for="teenager0">0</label>
                                        <input type="radio" value="1" name="teenager" id="teenager1"><label for="teenager1">1</label>
                                        <input type="radio" value="2" name="teenager" id="teenager2"><label for="teenager2">2</label>
                                        <input type="radio" value="3" name="teenager" id="teenager3"><label for="teenager3">3</label>
                                        <input type="radio" value="4" name="teenager" id="teenager4"><label for="teenager4">4</label>
                                        <input type="radio" value="5" name="teenager" id="teenager5"><label for="teenager5">5</label>
                                        <input type="radio" value="6" name="teenager" id="teenager6"><label for="teenager6">6</label>
                                        <input type="radio" value="7" name="teenager" id="teenager7"><label for="teenager7">7</label>
                                        <input type="radio" value="8" name="teenager" id="teenager8"><label for="teenager8">8</label>
                                    </li>
                                </ul>
                            </div>
                            <div class="si-movie-info">
                                <div class="si-movie-info-top">
                                    <ul>
                                        <li>CGV ${relsite} </li>
                                        <li>|${reltheater} </li>
                                        <!--할수 있으면 하시길... -->
                                        <li>|남은좌석 155/178</li>
                                    </ul>
                                </div>
                                <div class="si-movie-info-bottom">
                                    <span>${rely }년 ${relm }월 ${relmonth}일 ${reltime}</span>
                                </div>
                            </div>
                        </div>
                        <div class="seat-picture">
                            <div class="seat-picture-inner">
                             <div class="screen">
                                <span>SCREEN</span>
                            </div>
                            
                            
                            <div class="seat">
                            	<c:forEach items="${cseat }" var="seat">
                            		<c:forEach items="${seat.row }" var="row">
	      		                      	<div class="srow">
	    	  		                      	<c:forEach items="${seat.column}" var="col" varStatus="status">
	                    	        			<div class="scol"><input type="checkbox" name="seat" value="${row}${col}" id="${row}${col}"><label for="${row}${col}">${row}${col}</label></div>
		      		                      	</c:forEach>
    	        	                	</div>
                            		</c:forEach>
                            	</c:forEach>
                            </div>
                            </div>
                        </div>
                        <div class="select-seat">
                            <div class="select-btn">
                                <button class="btn btn-danger" type="button" onclick="javascript:location.href='index'"><span>&larr;</span><br>영화선택</button>
                            </div>
                            <div class="select-info">
                                <ul>
                                   <!--전페이지 에서 날라 온다. -->
                                    <li class="sm">선택하신 영화 - <span class="info-movie">${reltitle }</span></li>
                                    <li class="st">극장 - <span class="info-site">${relsite } ${reltheater}</span></li>
                                    <!--년월을 바로 뽑아준다.-->
                                    <li class="sd">날짜 - ${rely }년 ${relm }월 <span class="info-date">${relmonth}</span>일<span class="selet-time"> ${reltime}</span></li>
                                </ul>
                            </div>
                            <div class="select-seat-info">
                                <ul>
                                    <li class="ss">선택하신좌석<span class="info-seat"></span></li>
                                </ul>
                            </div>
                            <script>
                                /*예약된 자리는 자바스크립트에 걸리지 않게 name값을 다르게 뿌려준다.*/
                                
                                /*인원수 대로 체크 하고 나서 체크 더이상 할수 없게 만들어야한다. */
                                /*인원수 선택은 성인도 0 청소년도 0 으로하면 체크 다풀림*/
                                $(function(){
                                	//(예약 되어있는것은 ajax로 모두 가져 와서 이미 체크되어있게 만들어 버린다. 그리고 나서 모든 함수에 적용 한다. 아이디가 id== 같으면으로 찾아 버리자 못클릭하고 백그라운드 바꿔 버리기)
                                	
                                    $(".si-people input").change(function(){
                                        var adult = $("input[name='adult']:checked").val();
                                        var teenager = $("input[name='teenager']:checked").val();
                                        var people = parseInt(teenager)+parseInt(adult);
                                        if(people==0){
                                            $("input[name='seat']:checkbox").prop('checked',false)
                                           }else{
                                            $("input[name='seat']:checkbox").prop('checked',false)
                                            $("input[name='seat']:checkbox").removeAttr("disabled");
                                           }
                                    })                                        
                                
                                    /*인원수 대로 체크 하고 인원수 0이면 체크 안됨*/
                                    $("input[name='seat']:checkbox").change(function(){
                                        var adult = $("input[name='adult']:checked").val();
                                        var teenager = $("input[name='teenager']:checked").val();
                                        var people = parseInt(teenager)+parseInt(adult);
                                        /*인원수 0일태 체크 안됨*/
                                        if(people==0){
                                            $(this).prop('checked',false)
                                           }
                                        /*인원수보다 많으면 다른 좌석 선택 못함*/
                                        if(people==$("input[name='seat']:checkbox:checked").length){
                                                 $(":checkbox:not(:checked)").attr("disabled", "disabled");
                                           }else{
                                               $("input[name='seat']:checkbox").removeAttr("disabled");
                                           }
                                        
                                        var selectSeat = "";
                                        $("input[name='seat']:checkbox:checked").each(function(){
                                            var oneSelectSeat = " "+$(this).val();
                                            selectSeat=selectSeat+oneSelectSeat;
                                        })
                                        $(".info-seat").text(selectSeat);
                                        $("input[name='relseat']").val(selectSeat);
                                    })
                                })
                            </script>
                            <div class="select-btn">
                                <button class="btn btn-danger" onclick="submit()"><span>&rarr;</span><br>결제</button>
                            </div>
                            
                        </div>
                    </div>
                </form>
            </div>
        </section>
</body>
</html>