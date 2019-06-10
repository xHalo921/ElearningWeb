<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="dao.CourseDAO,bean.Course,java.util.ArrayList,java.util.List"%>

<html>
<head>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<Title>选课管理界面</Title>
<%-- <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 --%>

</head>
  
  <body>
  
  <table border="1">
      <tr>
          <td>id</td>
          <td>name</td>
          <td>hour</td>
          <td>credit</td>
          <td>student</td>
          <td>State</td>
      </tr>
        <%
        CourseDAO dao=new CourseDAO();
        List<Course> list=dao.readFirstCourse();
        for(Course tl:list) {
            request.setAttribute("sNo",tl.getcNo());
        %>
          <tr>
              <td><%=tl.getcNo()%></td>
              <td><%=tl.getcName() %></td>
              <td><%=tl.getcHour() %>></td>
              <td><%=tl.getcCredit() %></td>
              <td><%=tl.getcStudent() %></td>

          </tr>

      <a href="#" id="agree" onclick="javascript:this.innerHTML=(this.innerHTML='已选课');">同意</a>
      <a href="#" id="disagree" onclick="javascript:this.innerHTML=(this.innerHTML='已退选');"> 退选</a>
      <%}%>

  </table>
  </body>
</html>



 