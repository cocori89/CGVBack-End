<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/content.css">
</head>
<body>

        <section>
            <div class="contant">
                
                <form class="form-horizontal" method="post" action="login">
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="inputEmail3" placeholder="아이디를 입력하세요" size="30" name="id">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="inputPassword3" placeholder="패스워드를 입력학세요" size="30" name="pw">
                    </div>
                    <div>
                    	<h3>${msg }</h3>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <input type="submit" value="로그인" class="btn btn-info">
                            <input type="button" value="회원가입" class="btn btn-info" onclick="javascript:location.href='memberInsert'">
                            <input type="button" value="뒤로가기" class="btn btn-info" onclick="javascript:history.back()">
                        </div>
                    </div>
                </form>
            </div>
        </section>
</body>
</html>