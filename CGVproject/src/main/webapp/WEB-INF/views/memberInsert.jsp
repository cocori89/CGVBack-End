<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/content.css">
</head>
<body>
    <section>
            <div class="contant">
                <form action="memberInsert" method="post">
                    <table class="inserttable">
                       <tr>
                            <td>이름 : </td>
                            <td><input type="text" name="name"></td>
                        </tr>
                        <tr>
                            <td>아이디 : </td>
                            <td><input type="text" name="id"></td>
                        </tr>
                        <tr>
                            <td>패스워드 : </td>
                            <td><input type="password" name="pw"></td>
                        </tr>
                        <tr>
                            <td>패스워드 확인 : </td>
                            <td><input type="password"></td>
                        </tr>
                        <tr>
                            <td>폰번호 : </td>
                            <td><input type="number" name="phone"></td>
                        </tr>
                        <tr>
                            <td>주소 : </td>
                            <td><input type="text" name="addr"></td>
                        </tr>
                        <tr>
                            <td>이메일 : </td>
                            <td><input type="email" name="email"></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="insert-last">
                                <input type="submit" value="저장" class="btn btn-primary">
                                <input type="button" value="취소" onclick="javascript:location.href='index'" class="btn btn-danger">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </section>
</body>
</html>