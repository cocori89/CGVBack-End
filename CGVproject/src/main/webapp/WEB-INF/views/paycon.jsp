<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/paycon.css">

</head>
<body>
	<section>
            <div class="contant">
                <div class="content">
                    <div class="subject">결제가 완료 되었습니다.</div>
                    <div class="rebtn">
                        <button class="btn btn-danger" onclick="javascript:location.href='reservation'">예약정보 확인하기</button>
                        <button class="btn btn-primary" onclick="javascript:location.href='index'">홈으로 돌아가기</button>
                    </div>
                </div>
            </div>
        </section>
</body>
</html>