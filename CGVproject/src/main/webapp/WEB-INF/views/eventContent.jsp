<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/event.css">

</head>
<body>
        <section>
            <div class="contant">
                <table class=".table-condensed">
                    <tr>
                        <th>${event.event_kind}</th>
                        <th>${event.event_title}</th>
                        <th>기간: ${event.event_startdate} ~ ${event.event_enddate}</th>
                    </tr>        
                    <tr>
                        <td colspan="3"><img src="${pageContext.request.contextPath }/resources/img/event/${event.event_contentimg}" alt=""></td>
                    </tr>
                    <tr>
                        <td colspan="3" align="right">
                            <button  type="button" class="btn btn-default" onclick="javascript:locatio.href='event' ">목록</button>
                        </td>
                    </tr>
                </table>
            </div>
        </section>
</body>
</html>