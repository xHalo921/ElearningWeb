<%@ page import="bean.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dao.IDAO" %>
<%@ page import="dao.DAO" %>
<%@ page import="bean.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%        request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <title>stuManage</title>
</head>
<body>
<%--<%--%>
    <%--Teacher tea=(Teacher) request.getSession().getAttribute("user");--%>
    <%--IDAO dao =new DAO();--%>
    <%--ArrayList<Student> AllStu = dao.findAllStu(tea.gettClass());--%>
    <%--for (int i=1;i<AllStu.size()+1;i++) {--%>
        <%--Student s=AllStu.get(i);--%>
<%--%>--%>
<%--编号：<%=i%> 学号：<%=s.getsNo()%>姓名：<%=s.getsName()%>班级：<%=s.getsClass()%>选课状态--%>
<%--<%}%>--%>
<form action="${pageContext.request.contextPath }/upload" enctype="multipart/form-data" method="post">
    上传用户：<input type="text" name="username"><br/>
    上传文件1:<input type="file" name="file1"><br/>
    上传文件2:<input type="file" name="file2"><br/>
    <input type="submit" value="提交">
</form>

<form action="${pageContext.request.contextPath }/ReadXlsServlet" enctype="multipart/form-data" method="post">
    请按模板填写成绩表上传:<input type="file" name="file1"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
