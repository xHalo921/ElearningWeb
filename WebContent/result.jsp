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
int mark=0;
String resa = request.getParameter("first");
if(resa.equals("C"))
	mark++;

String resb = request.getParameter("second");
if(resb.equals("D"))
	mark++;

String resc = request.getParameter("third");
if(resc.equals("D"))
	mark++;

String resd = request.getParameter("fourth");
if(resd.equals("D"))
	mark++;

String rese = request.getParameter("fifth");
if(rese.equals("D"))
	mark++;
out.print("得分"+mark);
%>
</body>
</html>