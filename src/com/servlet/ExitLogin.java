package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ExitLogin extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException{
        request.getSession().setAttribute("iden",0);
        System.out.println("ExitLogin");
        response.sendRedirect(request.getContextPath()+"/main.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, IOException{
        request.getSession().setAttribute("iden",0);
        response.sendRedirect("/main.jsp");
    }
}
