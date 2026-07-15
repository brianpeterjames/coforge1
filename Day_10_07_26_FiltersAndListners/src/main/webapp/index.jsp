<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="p-4" style="max-width: 400px;">

    <h2 class="mb-3"><%= "Login Form" %></h2>

    <form action="LoginServlet">
        <label for="uname" class="form-label">UserName</label>
        <input type="text" class="form-control" name="uname" id="uname">
        <br>
        
        <label for="pwd" class="form-label">Password</label>
        <input type="password" class="form-control" name="pwd" id="pwd">
        <br>
        
        <button type="submit" class="btn btn-primary">Login</button>
    </form>

</body>
</html>