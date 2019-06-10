<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grade Analyse</title>

<script src="jquery/jquery-1.7.2.min.js"></script>

</head>

<body>
<script type="text/javascript">
$(function(){
        //获得后台数据
        var category_data;//类型信息
        var soft_data;//软件部销售数据
        var net_data;//网络部销售数据
        var mobile_data;//移动事业部销售数据
        $.ajax({
            url:'/src/com/servlet/EChartsServelt',
            async:true,
            success: function(data){
                category_data=data.sName;
                soft_data=data.uGrade;
                net_data=data.fGrade;
                mobile_data=data.pGrade;
            	alert("dgs");}

            })
        var grade=['王强',60,80,90,50,90];
        var book=['操作系统','数据挖掘','项目管理','计算机网络','软件测试'];})
    </script>

    <div id="main" style="height:600px"></div>
</body>
</html>




