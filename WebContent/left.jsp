<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'left.jsp' starting page</title>
    <script language="JavaScript" src="js/jquery.js"></script>
	<link href="css/main.css" rel="stylesheet" type="text/css" />

	<script type="text/javascript">
		$(function(){	
			//导航颜色切换
			$(".menuson li").click(function(){
				$(".menuson li.active").removeClass("active");
				$(this).addClass("active");
			});
			$('.title').click(function(){
				var $ul = $(this).next('ul');
				$('dd').find('ul').slideUp();
				if($ul.is(':visible')){
					$(this).next('ul').slideUp();
				}else{
					$(this).next('ul').slideDown();
				}
			});
			
		});	
	</script>
  </head>
  
<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span></div>
    <dl class="leftmenu">
	    <dd>
	    <div class="title">
	    <span><img src="images/leftico01.png" /></span>课程介绍
	    </div>
	    	<ul class="menuson">
		        <li><cite></cite><a href="content.jsp" target="rightFrame">课程简介</a><i></i></li>
		        <li><cite></cite><a href="content1.jsp" target="rightFrame">教学大纲</a><i></i></li>
		        <li><cite></cite><a href="/" target="rightFrame">课程实践</a><i></i></li>
	        </ul>    
	    </dd>
	    <dd>
		<div class="title">
		   	<span><img src="images/leftico02.png" /></span>教学团队
		 </div>
		    <ul class="menuson">
		        <li><cite></cite><a href="teacher.jsp" target="rightFrame">教师信息</a><i></i></li>
		        <li><cite></cite><a href="#">团队简介</a><i></i></li>
		    </ul>     
	    </dd> 
	    <dd>
	    <div class="title">
	    	<span><img src="images/leftico03.png" /></span>帮助
	    </div>
		    <ul class="menuson">
		        <li><cite></cite><a href="#">联系我们</a><i></i></li>
		    </ul>    
	    </dd>  
    </dl>
</body>
</html>
