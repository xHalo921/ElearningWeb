<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>软件项目管理在线学习网站</title>
  </head>
  <% String path=request.getContextPath();%>
<frameset rows="88,*,30" cols="*" frameborder="no" border="0" framespacing="0">
	<frame src="<%=path%>/top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
	<frameset cols="187,*" frameborder="no" border="0" framespacing="0">
	<frame src="<%=path%>/left.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
    <frame src="<%=path%>/huanying.jsp" name="rightFrame" id="rightFrame" title="rightFrame" scrolling="No"/>
    </frameset>
    <frame src="<%=path%>/down.jsp" name="downFrame" scrolling="No" noresize="noresize" id="downFrame" title="downFrame" />
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
