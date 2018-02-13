<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/content.css">

</head>
<body>
<!-- 아직 완성 안됨 -->
<section>
            <div class="contant">
                <form action="memberUpdate" method="post">
                    <table class="inserttable">
                       <tr>
                            <td>이름 : </td>
                            <td><input type="text" name="name" value="${memberVO.member_name }" readonly="readonly"></td>
                        </tr>
                        <tr>
                            <td>아이디 : </td>
                            <td><input type="text" name="id" value="${memberVO.member_id }" readonly="readonly" ></td>
                        </tr>
                        <tr>
                            <td>패스워드 변경: </td>
                            <td><input type="password" name="pw"></td>
                        </tr>
                        <tr>
                            <td>패스워드 변경 확인 : </td>
                            <td><input type="password"></td>
                        </tr>
                        <tr>
                            <td>폰번호 : </td>
                            <td><input type="number" name="phone" value="${memberVO.member_phone }"></td>
                        </tr>
                        <tr>
                            <td>주소 : </td>
                            <td><input type="text" name="addr" value="${memberVO.member_addr }"></td>
                        </tr>
                        <tr>
                            <td>이메일 : </td>
                            <td><input type="email" name="email" value="${memberVO.member_email }"></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="insert-last">
                                <input type="submit" value="저장" class="btn btn-primary">
                                <input type="button" value="취소" onclick="javacript:location.href='mypage'" class="btn btn-danger">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </section>
</body>
</html>