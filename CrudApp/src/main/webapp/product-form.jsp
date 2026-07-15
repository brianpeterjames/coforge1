<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.coforge.Product" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light p-4">

    <%
        // Check if an existing product was passed for editing
        Product product = (Product) request.getAttribute("product");
        boolean isEditMode = (product != null);
    %>

    <div class="container bg-white p-4 rounded shadow-sm" style="max-width: 500px;">
        <h2 class="mb-4"><%= isEditMode ? "Edit Product" : "Add New Product" %></h2>

        <form action="<%= isEditMode ? "update" : "insert" %>" method="post">
            
            <% if (isEditMode) { %>
                <input type="hidden" name="id" value="<%= product.getId() %>">
            <% } %>

            <div class="mb-3">
                <label for="name" class="form-label">Product Name</label>
                <input type="text" class="form-control" name="name" id="name" 
                       value="<%= isEditMode ? product.getName() : "" %>" required>
            </div>

            <div class="mb-3">
                <label for="category" class="form-label">Category</label>
                <input type="text" class="form-control" name="category" id="category" 
                       value="<%= isEditMode ? product.getCategory() : "" %>" required>
            </div>

            <div class="mb-3">
                <label for="quantity" class="form-label">Quantity</label>
                <input type="number" class="form-control" name="quantity" id="quantity" 
                       value="<%= isEditMode ? product.getQuantity() : "" %>" required>
            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price (in Rupees)</label>
                <input type="number" step="0.01" class="form-control" name="price" id="price" 
                       value="<%= isEditMode ? product.getPrice() : "" %>" required>
            </div>

            <button type="submit" class="btn btn-success"><%= isEditMode ? "Save Changes" : "Add Product" %></button>
            <a href="./list" class="btn btn-secondary ms-2">Cancel</a>
        </form>
    </div>

</body>
</html>