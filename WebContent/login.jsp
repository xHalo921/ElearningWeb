<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head>
    <title>My JSP 'login.jsp' starting page</title>
     <link href="css/login.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script language="JavaScript" src="js/yunduo.js"></script>
  </head>
  
<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  
	<div class="logintop">    
	  <span>欢迎登录信息管理中心</span>    
	    <ul>
		    <li><a href="#">帮助</a></li>
		    <li><a href="#">关于</a></li>
	    </ul>    
	 </div>
	 <div class="loginbody">
	    <span class="systemlogo"></span>  
	    <div class="loginbox">
		    <ul>
			    <li><input name="users" type="text" class="loginuser" value="请输入用户名" onclick="JavaScript:this.value=''"/></li>
			    <li><input name="" type="password" class="loginpwd" value="请输入密码" onclick="JavaScript:this.value=''"/></li>
			    <li><input name="" type="button" class="loginbtn" value="登录"  onclick="javascript:window.location='main.jsp'"  />
				    <label>
				    	<input name="" type="checkbox" value="" checked="checked" />记住密码
				    </label>
				    <label><a href="#">忘记密码？</a></label>
			    </li>
		    </ul>
	    </div>
	 </div>
	 <div class="loginbm">版权所有  2015  <a href="#">www.esqabc.com</a>仅供学习交流，勿用于任何商业用途</div>
</body>
<%
//登录成功
String username1=request.getParameter("users");
session.setAttribute("username", username1);
%>
<%=username1 %>
</html>
