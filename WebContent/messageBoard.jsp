<%@ page import="dao.Comments" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.IDAO" %>
<%@ page import="dao.DAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>message board</title>
</head>
<body>
评论:<br/>
<%
    IDAO dao = new DAO();
    List<Comments> list= dao.findAllComment();
    for(Comments comment:list) {
        String str = comment.getComments();
%>

<ul>
    <li>
        <%=comment.getName()%>:<%=str%>
    </li>
</ul>
<%}%>
<form action="com/servlet/MessageBoard" method="post">
    <table border="1" rules="rows">
        <tr height="30">
            <td>留言者：</td>
            <td><input type="text" name="author" size="20"></td>
        </tr>
        <tr height="30">
            <td>留言标题：</td>
            <td><input type="text" name="title" size="35"></td>
        </tr>
        <tr >
            <td>留言内容：</td>
            <td><textarea name="content" rows="8" cols="34"></textarea></td>
        </tr>
        <tr align="center" height="30">
            <td colspan="2">
                <input type="submit" value="提交">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>

</body>
</html>