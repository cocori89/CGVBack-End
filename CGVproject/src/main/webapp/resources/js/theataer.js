$(function(){
    $(".area").hide();
    $("#area-select").show();
    
    
    $(".sect-city>ul>li>.city").on("click",function(){
        var a = $(this).text();
        $(".area").hide();
        $(this).next('.area').show();
    });
})