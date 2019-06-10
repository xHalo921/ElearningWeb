<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>register.jsp</title>
    <link href="css/register.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script language="JavaScript" src="js/yunduo.js"></script>
</head>

<body style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
<div id="mainBody">
    <div id="cloud1" class="cloud"></div>
    <div id="cloud2" class="cloud"></div>
</div>
<div class="logintop">
    <span>欢迎登录在线学习网站</span>
    <ul>
        <li><a href="#">帮助</a></li>
        <li><a href="#">关于</a></li>
    </ul>
</div>
<div class="loginbody">
    <span class="systemlogo"></span>
    <div class="loginbox">
        <ul>
            <form action="com/servlet/RegisterServlet" method="post">
                <li><input name="No" class="registerbag" type="text" value="用户名" onclick="JavaScript:this.value=''"/></li>
                <li><input name="Password" class="registerbag" type="password" value="密码" onclick="JavaScript:this.value=''"/></li>
                <li><input name="Class" class="registerbag" type="text" value="班级" onclick="JavaScript:this.value=''"/></li>
                <li><input name="Name" class="registerbag" type="text" value="姓名" onclick="JavaScript:this.value=''"/></li>
                <li><input name="Email" class="registerbag" type="text" value="邮箱" onclick="JavaScript:this.value=''"/></li>
                <li><input name="Phone" class="registerbag" type="text" value="电话" onclick="JavaScript:this.value=''"/></li>
                <li><label><input name="iden" type="radio" value="stu" checked="checked">学生
                    <input name="iden" type="radio" value="tea">教师</label>
                    <input type="submit" class="loginbtn" value="注册" /></li>
            </form>
            <%--onclick="javaScript:window.location='main.jsp'"--%>
            <%--<label>--%>
            <%--<input name="" type="checkbox" value="" checked="checked" />记住密码--%>
            <%--</label>--%>
            <%--<label><a href="#">忘记密码？</a></label>--%>
        </ul>
    </div>
</div>
<div class="loginbm">CopyRight 2019 南京师范大学 地址：南京市栖霞区文苑路一号 邮编：410024</div>
</body>
</html>
