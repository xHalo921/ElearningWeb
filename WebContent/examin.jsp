<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String cc[]={"first","second","third"};
	int a[]=new int[3];
	Random ra =new Random();
	for(int i=0;i<3;i++)
		a[i]=ra.nextInt(5)+1;
%>
<form action="result.jsp" method="post">

	1．关于转发和重定向的描述错误的语句是（C）。
			<br><input type="radio" value="A" name="first"/>A．重定向是在客户端发生的作用，通过请求新的地址实现页面转向
			<br><input type="radio" value="B" name="first"/>B．使用转发时由于是服务器内部控制权的转移，因而地址栏中的URL没有变化
			<br><input type="radio" value="C" name="first"/>C． 转发与重定向都可以实现页面跳转，因为没有区别
			<br><input type="radio" value="D" name="first"/>D． 使用重定向时可以在地址栏中看到转向后的URL
			<br>
			<br>
	
		2.以下对象中不是JSP内置对象的是（D）。
			<br><input type="radio" value="A" name="second"/>A．request
			<br><input type="radio" value="B" name="second"/>B．session
			<br><input type="radio" value="C" name="second"/>C．application
			<br><input type="radio" value="D" name="second"/>D．bean
			<br>
			<br>
		
		3.下列选择项中不属于JDBC基本功能的是（D）。
		<br><input type="radio" value="A" name="third"/>A．与数据库建立连接
		<br><input type="radio" value="B" name="third"/>B．提交SQL语句
		<br><input type="radio" value="C" name="third"/>C．处理查询结果
		<br><input type="radio" value="D" name="third"/>D．数据库维护管理
		<br>
		<br>
		
		4.在JavaEE中，request对象的（D）方法可以获取页面请求中一个表单组件对应多个值时的用户的请求数据。
		<br><input type="radio" value="A" name="fourth"/>A．String getParameter(String name)
		<br><input type="radio" value="B" name="fourth"/>B．String[] getParameter(String name)
		<br><input type="radio" value="C" name="fourth"/>C．String getParameterValuses(String name)
		<br><input type="radio" value="D" name="fourth"/>D．String[] getParameterValues(String name)
		<br>
		<br>

		5.以下哪些属性是include指令所具有的：（B）
		<br><input type="radio" value="A" name="fifth"/>A．page
		<br><input type="radio" value="B" name="fifth"/>B．file
		<br><input type="radio" value="C" name="fifth"/>C．contentType	
		<br><input type="radio" value="D" name="fifth"/>D．prefix
		<br>
		<br>

<input type="submit" value="提交">
</form>
</body>
</html>