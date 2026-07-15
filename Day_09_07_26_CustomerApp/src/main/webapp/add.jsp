<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

</head>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

<h1>Customer Form</h1>

<form action="AddCustomerServlet">

    <div class="form-group">
        <label for="exampleInputEmail1">Customer ID</label>
        <input type="number" class="form-control" id="cid" name="cid">
    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">Customer Name</label>
        <input type="text" class="form-control" id="c" name="cname">
    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">Customer city</label>
        <input type="text" class="form-control" id="city" name="city">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

</form>

</body>
</html>