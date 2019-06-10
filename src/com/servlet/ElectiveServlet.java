package com.servlet;

import bean.Student;
import dao.DAO;
import dao.IDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ElectiveServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int choice = Integer.parseInt(request.getParameter("choice"));
        Student stu=(Student)request.getSession().getAttribute("user");
        stu.setChoice(choice*-1);
        IDAO dao=new DAO();
        dao.updateStu(stu);
        response.sendRedirect("/main.jsp");
    }
}
