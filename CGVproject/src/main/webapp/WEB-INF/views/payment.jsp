<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/payment.css">
</head>
<body>
        <section>
            <div class="contant">
                <form action="paycon" method="post">
                    <input type="hidden" name="title" value="${reltitle}">                    
                    <input type="hidden" name="site" value="${relsite}">                    
                    <input type="hidden" name="start" value="${relstart}">                    
                    <input type="hidden" name="end" value="${end}">                    
                    <input type="hidden" name="theater" value="${reltheater}">                    
                    <input type="hidden" name="date" value="${date}">                    
                    <input type="hidden" name="day" value="${day }">                   
                    <input type="hidden" name="seat" value="${relseat}">                    
                    <input type="hidden" name="adult" value="${adult}">                    
                    <input type="hidden" name="teenager" value="${teenager}">    
                    <input type="hidden" name="people" value="${adult+teenager}">    
                    <input type="hidden" name="price" value="${price}">    
                    <table>
                       <tr>
                           <td colspan="2">
                               <img class="poster" src="${pageContext.request.contextPath }/resources/img/movie/${poster}" alt="">
                           </td>
                       </tr>
                        <tr>
                            <td class="fcol">제목 :</td>
                            <td class="scol"> ${reltitle}</td>
                        </tr>
                        <tr>
                            <td class="fcol">날짜 : </td>
                            <td class="scol">${rely }년${relm }월 ${reld}일 ${relstart}~${end }</td>
                        </tr>
                        <tr>
                            <td class="fcol">장소 : </td>
                            <td class="scol">CGV ${relsite}</td>
                        </tr>
                        <tr>
                            <td class="fcol">상영관 : </td>
                            <td class="scol">${reltheater}</td>
                        </tr>
                        <tr>
                            <td class="fcol">인원 : </td>
                            <td class="scol"> ${adult+teenager}명(일반  ${adult}명, 청소년 ${teenager}명)</td>
                        </tr>
                        <tr>
                            <td class="fcol">좌석 : </td>
                            <td class="scol">${relseat}</td>
                        </tr>
                        <tr>
                            <td class="fcol">결제금액 : </td>
                            <td class="scol">어른 ${adult}명 청소년 ${teenager}명 총 결제 금액 : ${price}원</td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" value="결제하기 " class="btn btn-danger">
                                <input type="button" value="처음부터 다시" class="btn btn-primary">
                            </td>
                        </tr>
                    </table>                
                    
                </form>
            </div>
        </section>
</body>
</html>