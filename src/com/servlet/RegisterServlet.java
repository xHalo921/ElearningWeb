package com.servlet;

import bean.Student;
import bean.Teacher;
import dao.DAO;
import dao.IDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet  extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException {
        System.out.println("RegisterServlet");
        String user = request.getParameter("No");
        String iden = request.getParameter("iden");
        IDAO dao = new DAO();
        System.out.println(iden);
        if ("stu".equals(iden)) {
            if (dao.findStu(user)) {
                request.setAttribute("message", "用户名已存在");
                request.getRequestDispatcher("/message.jsp").forward(request, response);
            } else {
                Student stu = new Student();
                stu.setStudent(Integer.parseInt(request.getParameter("No")),request.getParameter("Password"),Integer.parseInt(request.getParameter("Class")),request.getParameter("Name"),request.getParameter("Email"),request.getParameter("Phone"));
                stu.setChoice(0);
                dao.addStu(stu);
                request.setAttribute("user",stu);
                request.getRequestDispatcher("/main.jsp").forward(request, response);
            }
        }
        else {
            if (dao.findStu(user)) {
                request.setAttribute("message", "用户名已存在");
                request.getRequestDispatcher("/message.jsp").forward(request, response);
            }else {
                Teacher tea =new Teacher();
                tea.setTeacher(Integer.parseInt(request.getParameter("No")),request.getParameter("Password"),Integer.parseInt(request.getParameter("Class")),request.getParameter("Name"),request.getParameter("Email"),request.getParameter("Phone"));
                request.setAttribute("user",tea);
                request.getRequestDispatcher("/main.jsp").forward(request, response);
            }
        }
    }
}
