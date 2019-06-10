package com.servlet;

import bean.Student;
import dao.DAO;
import dao.IDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FindGraServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String author= request.getParameter("author");
        String title= request.getParameter("title");
        String content= request.getParameter("content");
        IDAO dao=new DAO();
        dao.addComment(author,title,content);
        response.sendRedirect("/main.jsp");
    }
}