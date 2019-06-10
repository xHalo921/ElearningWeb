<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="bean.Student" %>
<%@ page import="bean.Teacher" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link href="css/main.css" rel="stylesheet" type="text/css" />
    <link href="css/top.css" rel="stylesheet" type="text/css" />
  </head>
  
<body style="background:url(images/topbg.gif) repeat-x;">
    <div class="topleft">
    	<a href="main.jsp" target="_parent"><img src="images/logo1.png" title="系统首页" /></a>
    </div>
        <% String path=request.getContextPath();%>
    <div class="topright">    
	    <ul>
		    <li><span><img src="images/help.png" title="帮助"  class="helpimg"/></span><a href="#">帮助</a></li>
		    <li><a href="#">关于</a></li>
            <%
                Object o=request.getSession().getAttribute("iden");
                int iden=0;
                if (o!=null)
                    iden=(int)o;
                if (iden==0){
            %>
		    <li><a href="login.jsp" target="_parent">登陆</a></li>
            <%} else {%>
            <li><a href="com/servlet/ExitLogin" target="_parent">退出登陆</a></li>
            <%}%>
	    </ul>
	    <div class="user">
	    	<span></span>
	    </div>   
    </div>
</head>
<body>

<div class="top">
                   <center> 
                    <ul>
                    <li><a href="content2.jsp" target="rightFrame">行业信息</a></li>
                    <li><a href="listFile"  target="rightFrame">下载区</a></li>
                    <li><a href="messageBoard.jsp"  target="rightFrame">留言板</a></li>
                    <li><a href="examin.jsp" target="rightFrame"><b>网上测试</b></a></li>
                    <%--<li><a href="#">成绩查询</a></li>--%>
                    <%  if (iden==1){%>
                    <li><a href="elective.jsp" target="rightFrame">选课管理</a></li>
                    <%} else if (iden==2){%>
                    <li><a href="stuManage.jsp" target="rightFrame">课程管理</a></li>
                    <%}%>
                    </ul>
                    </center>      
            </div>
</body>
</html>
