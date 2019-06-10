<%@ page import="bean.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Elective course</title>
    <head>
        <style type="text/css">
            p
            {
                border: thin solid rgb(0,0,0)
            }
        </style>
    </head>
</head>
<body>
<%
    Student stu=(Student)request.getSession().getAttribute("user");
    int choice=stu.getChoice();
    if (stu.getNotice()!=null){
%>
收到通知：<%=stu.getNotice()%></br>
<%
    }if (choice==0){
%>
<p>
    《软件项目管理》选课</br>
学号:<%=stu.getsNo()%></br>
班级:<%=stu.getsClass()%></br>
姓名:<%=stu.getsName()%></br>
E-mail:<%=stu.getsEmail()%></br>
电话:<%=stu.getsPhone()%></br>
</p>
<form action="com/servlet/ElectiveServlet" method="post">
输入课程号：<input name="choice" type="text">
    <input type="submit" value="选课" />
</form>

<%}else{%>
当前选课状态
<%if (choice<0){%>
班号：<%=choice*-1%>状态：待审核
<%}else{%>
<%=choice%>已选择
<%} }%>
</body>
</html>
