package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
* Servlet implementation class SecondServlet
*/
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

/**
* Default constructor.
*/
public SecondServlet() {
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out= response.getWriter();
out.println("<h1>Second Servlet</h1>");
String username = request.getParameter("username");
// Cookie[] cookies = request.getCookies();
// if(cookies!=null)
// {
// for(Cookie c:cookies)
// {
// if("username".equals(c.getName()))
// {
// username = c.getValue();
// break;
// }
// }
// }
// if(username!=null)
// out.println("Welcome "+username);
// else
// out.println("No Session");
out.close();
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}
