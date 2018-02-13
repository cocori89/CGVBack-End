<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/seat.css">

</head>
<body>
        <section>
            <div class="contant">
                <form action="">
                    <div class="contents">
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
                                        <li>CGV 목동 </li>
                                        <li>|1관 </li>
                                        <!--할수 있으면 하시길... -->
                                        <li>|남은좌석 155/178</li>
                                    </ul>
                                </div>
                                <div class="si-movie-info-bottom">
                                    <span>2018.01.21.(일) 10:45~12:54</span>
                                </div>
                            </div>
                        </div>
                        <div class="seat-picture">
                            <div class="seat-picture-inner">
                             <div class="screen">
                                <span>SCREEN</span>
                            </div>
                            <div class="seat">
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="A01" id="A01"><label for="A01">A01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A02" id="A02"><label for="A02">A02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A03" id="A03"><label for="A03">A03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A04" id="A04"><label for="A04">A04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A05" id="A05"><label for="A05">A05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A06" id="A06"><label for="A06">A06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A07" id="A07"><label for="A07">A07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A08" id="A08"><label for="A08">A08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A09" id="A09"><label for="A09">A09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A10" id="A10"><label for="A10">A10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A11" id="A11"><label for="A11">A11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A12" id="A12"><label for="A12">A12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A13" id="A13"><label for="A13">A13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A14" id="A14"><label for="A14">A14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="A15" id="A15"><label for="A15">A15</label></div>
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="B01" id="B01"><label for="B01">B01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B02" id="B02"><label for="B02">B02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B03" id="B03"><label for="B03">B03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B04" id="B04"><label for="B04">B04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B05" id="B05"><label for="B05">B05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B06" id="B06"><label for="B06">B06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B07" id="B07"><label for="B07">B07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B08" id="B08"><label for="B08">B08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B09" id="B09"><label for="B09">B09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B10" id="B10"><label for="B10">B10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B11" id="B11"><label for="B11">B11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B12" id="B12"><label for="B12">B12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B13" id="B13"><label for="B13">B13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B14" id="B14"><label for="B14">B14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="B15" id="B15"><label for="B15">B15</label></div>
                                </div>
                                <div class="srow">
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="C01" id="C01"><label for="C01">C01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C02" id="C02"><label for="C02">C02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C03" id="C03"><label for="C03">C03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C04" id="C04"><label for="C04">C04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C05" id="C05"><label for="C05">C05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C06" id="C06"><label for="C06">C06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C07" id="C07"><label for="C07">C07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C08" id="C08"><label for="C08">C08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C09" id="C09"><label for="C09">C09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C10" id="C10"><label for="C10">C10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C11" id="C11"><label for="C11">C11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C12" id="C12"><label for="C12">C12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C13" id="C13"><label for="C13">C13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C14" id="C14"><label for="C14">C14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="C15" id="C15"><label for="C15">C15</label></div>
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="D01" id="D01"><label for="D01">D01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D02" id="D02"><label for="D02">D02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D03" id="D03"><label for="D03">D03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D04" id="D04"><label for="D04">D04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D05" id="D05"><label for="D05">D05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D06" id="D06"><label for="D06">D06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D07" id="D07"><label for="D07">D07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D08" id="D08"><label for="D08">D08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D09" id="D09"><label for="D09">D09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D10" id="D10"><label for="D10">D10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D11" id="D11"><label for="D11">D11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D12" id="D12"><label for="D12">D12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D13" id="D13"><label for="D13">D13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D14" id="D14"><label for="D14">D14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="D15" id="D15"><label for="D15">D15</label></div>
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="E01" id="E01"><label for="E01">E01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E02" id="E02"><label for="E02">E02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E03" id="E03"><label for="E03">E03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E04" id="E04"><label for="E04">E04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E05" id="E05"><label for="E05">E05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E06" id="E06"><label for="E06">E06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E07" id="E07"><label for="E07">E07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E08" id="E08"><label for="E08">E08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E09" id="E09"><label for="E09">E09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E10" id="E10"><label for="E10">E10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E11" id="E11"><label for="E11">E11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E12" id="E12"><label for="E12">E12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E13" id="E13"><label for="E13">E13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E14" id="E14"><label for="E14">E14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="E15" id="E15"><label for="E15">E15</label></div>
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="F01" id="F01"><label for="F01">F01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F02" id="F02"><label for="F02">F02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F03" id="F03"><label for="F03">F03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F04" id="F04"><label for="F04">F04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F05" id="F05"><label for="F05">F05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F06" id="F06"><label for="F06">F06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F07" id="F07"><label for="F07">F07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F08" id="F08"><label for="F08">F08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F09" id="F09"><label for="F09">F09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F10" id="F10"><label for="F10">F10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F11" id="F11"><label for="F11">F11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F12" id="F12"><label for="F12">F12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F13" id="F13"><label for="F13">F13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F14" id="F14"><label for="F14">F14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="F15" id="F15"><label for="F15">F15</label></div>
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="G01" id="G01"><label for="G01">G01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G02" id="G02"><label for="G02">G02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G03" id="G03"><label for="G03">G03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G04" id="G04"><label for="G04">G04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G05" id="G05"><label for="G05">G05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G06" id="G06"><label for="G06">G06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G07" id="G07"><label for="G07">G07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G08" id="G08"><label for="G08">G08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G09" id="G09"><label for="G09">G09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G10" id="G10"><label for="G10">G10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G11" id="G11"><label for="G11">G11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G12" id="G12"><label for="G12">G12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G13" id="G13"><label for="G13">G13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G14" id="G14"><label for="G14">G14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="G15" id="G15"><label for="G15">G15</label></div>
                                </div>
                                <div class="srow">
                                    <div class="scol"><input type="checkbox" name="seat" value="H01" id="H01"><label for="H01">H01</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H02" id="H02"><label for="H02">H02</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H03" id="H03"><label for="H03">H03</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H04" id="H04"><label for="H04">H04</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H05" id="H05"><label for="H05">H05</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H06" id="H06"><label for="H06">H06</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H07" id="H07"><label for="H07">H07</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H08" id="H08"><label for="H08">H08</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H09" id="H09"><label for="H09">H09</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H10" id="H10"><label for="H10">H10</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H11" id="H11"><label for="H11">H11</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H12" id="H12"><label for="H12">H12</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H13" id="H13"><label for="H13">H13</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H14" id="H14"><label for="H14">H14</label></div>
                                    <div class="scol"><input type="checkbox" name="seat" value="H15" id="H15"><label for="H15">H15</label></div>
                                </div>
                            </div>
                            </div>
                        </div>
                        <div class="select-seat">
                            <div class="select-btn">
                                <button class="btn btn-danger" onclick=""><span>&larr;</span><br>영화선택</button>
                            </div>
                            <div class="select-info">
                                <ul>
                                   <!--전페이지 에서 날라 온다. -->
                                    <li class="sm">선택하신 영화 - <span class="info-movie"></span></li>
                                    <li class="st">극장 - <span class="info-site"></span></li>
                                    <!--년월을 바로 뽑아준다.-->
                                    <li class="sd">날짜 - 2018년 1월 <span class="info-date"></span>일 시간<span class="selet-time"></span></li>
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
                                    })
                                })
                            </script>
                            <div class="select-btn">
                                <button class="btn btn-danger" onclick="sumit()"><span>&rarr;</span><br>좌석선택</button>
                            </div>
                            
                        </div>
                    </div>
                </form>
            </div>
        </section>
</body>
</html>