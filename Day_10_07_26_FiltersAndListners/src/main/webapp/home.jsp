<%@page import="jakarta.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<%HttpSession session1 = request.getSession(false); 
		
		if(session1!=null)
		{
			String uname = (String) session1.getAttribute("uname");
		out.println("Welcome...."+uname);
		
	
	%>
	<a class="bt btn-info" href="info.jsp">Info</a>
	<a class = "btn btn-primary" href = "LogoutServlet">Logout</a>
	<%
		}
		else 	
			response.sendRedirect("index.jsp");
	%>
</body>
</html>