<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.PrintWriter , java.util.List , java.util.Arrays"%> <!-- page directive  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<%PrintWriter pw= response.getWriter(); %>
	<% pw.println("this is jsp page using scriptlet"); %><!-- jsp scriptlet -->
	<br>
	
	<%!int a=6,b=8; %><!-- jsp declerations -->
	<%=a+b %><!-- jsp expressions -->
	
	<%!Integer arr[]={1,2,3,4,5,6}; %>
	<%List<Integer> alist=Arrays.asList(arr); %>
	<%pw.println(alist); %>
	
	
	<%for(Integer i=0;i<arr.length;i++) 
	  pw.println(i);
	
	%>
	
</body>
</html>