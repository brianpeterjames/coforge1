<html>
<head>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">
</head>
<body>

	<h1>Demo on ServletContextListener</h1>
	<form action="AppCountServlet">
		<button type="submit">Visit App</button>
	</form>
	<%
		Object count = application.getAttribute("count");
		if(count !=null)
	%>
	<h3>Total Count : <%=count %></h3>

</body>
</html>
