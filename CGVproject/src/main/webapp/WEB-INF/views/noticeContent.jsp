<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<section>

            <div class="contant">
                <div class="cols-content">
                    <div class="col-aside">
                        <div class="sub">
                            <ul>
                                <!--클릭후 변화는 자바스크립트로 할것-->
                                <li><a href="">공지사항</a></li>
                            </ul>
                        </div>
                        <!--여기는 배너 공간-->
                        <div class="ad-area"></div>
                    </div>
                    <div class="col-detail">
                        <div class="customer_top">
                            <h2 class="tit">공지사항</h2>
                            <p class="stit">CGV의 주요한 이슈 및 여러가지 소식들을 확인하실 수 있습니다.</p>
                        </div>
                        <div class="tbl_area">
                            <table class="table table-hover">
                                <tr>
                                    <td>${notice.notice_kind }</td>
                                    <td>${notice.notice_title }</td>
                                    <td>${notice.notice_date }</td>
                                    <td>${notice.notice_hit }</td>
                                </tr>
                                <tr>
                                    <td colspan="4">
                                        <textarea class="form-control" readonly="readonly" rows="20" width="100%">
                                        ${notice.notice_content }
                                        </textarea>
                                    </td>

                                </tr>
                            </table>
                        </div>
                        <div class="btn-gonoticelist">
                            <button type="button" class="btn btn-defaul" onclick="javascript:location.href='noticeList'">
                                목록으로 
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </section>
</body>
</html>