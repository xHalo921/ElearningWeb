package com.servlet;

import bean.Student;
import bean.Teacher;
import dao.DAO;
import dao.IDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException {
        String user = request.getParameter("name");
        String password = request.getParameter("password");
        int iden=0;
        IDAO dao=new DAO();
        if ("stu".equals(request.getParameter("iden"))){
            System.out.println(user+" "+password);
            Student stu = dao.findStu(user,password);
            if (stu==null){
                request.setAttribute("message", "password error");
                request.getRequestDispatcher("/message.jsp").forward(request, response);
            }
            else {
                iden=1;
                request.getSession().setAttribute("iden",iden);
                request.getSession().setAttribute("user",stu);
                request.getRequestDispatcher("/main.jsp").forward(request, response);
            }
        }
        else {
            Teacher tea = dao.findTea(user,password);
            if (tea==null) {
                request.setAttribute("message", "password error");
                request.getRequestDispatcher("/message.jsp").forward(request, response);
            }else {
                iden=2;
                request.getSession().setAttribute("iden",iden);
                request.getSession().setAttribute("user",tea);
                request.getRequestDispatcher("/main.jsp").forward(request, response);
            }
        }
    }
}
