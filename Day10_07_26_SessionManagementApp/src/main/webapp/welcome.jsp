<%@page import="jakarta.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // 1. FORBID BROWSER CACHING (The back-button killer)
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
    response.setHeader("Pragma", "no-cache"); 
    response.setDateHeader("Expires", 0); 

    // 2. SESSION CHECK
    HttpSession session1 = request.getSession(false);
    String email = null;
    if (session1 != null) {
        email = (String) session1.getAttribute("email");
    }

    // 3. REJECT UNAUTHORIZED USERS
    if (email == null) {
        response.sendRedirect("login.jsp");
        return; 
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Home</title>
</head>
<body>
    <h2>Welcome User with email: <%= email %></h2>
    <hr>
    <a href="LogoutServlet">Logout</a>
</body>
</html>