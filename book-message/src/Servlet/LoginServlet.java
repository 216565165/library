package Servlet;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String password = request.getParameter("password");
        if("卢飞行".equals(username)&&"666".equals(password)) {
            response.sendRedirect("/book_message/library.jsp");
        }else if("雷启贤".equals(username)&&"999".equals(password)){
            response.sendRedirect("/book_message/library.jsp");
        } else if("徐启杰".equals(username)&&"777".equals(password)){
            response.sendRedirect("/book_message/library.jsp");
        }
        else {
            response.sendRedirect(request.getContextPath()+"/dlu.jsp");
        }

        }
        }


