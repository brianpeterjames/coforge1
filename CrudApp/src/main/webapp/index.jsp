<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.coforge.Product" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Stock Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light p-4">

    <div class="container bg-white p-4 rounded shadow-sm" style="max-width: 900px;">
        <div class="d-flex justify-content-between align-items-center mb-4">
            <h2>Inventory Stock List</h2>
            <a href="product-form.jsp" class="btn btn-success">Add New Product</a>
        </div>

        <table class="table table-bordered table-striped align-middle">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Category</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    // Get the list passed from ListProductServlet
                    List<Product> listProduct = (List<Product>) request.getAttribute("listProduct");
                    if (listProduct != null && !listProduct.isEmpty()) {
                        for (Product p : listProduct) {
                %>
                <tr>
                    <td><%= p.getId() %></td>
                    <td><%= p.getName() %></td>
                    <td><%= p.getCategory() %></td>
                    <td><%= p.getQuantity() %></td>
                    <td>$<%= p.getPrice() %></td>
                    <td>
                        <a href="edit?id=<%= p.getId() %>" class="btn btn-sm btn-primary me-2">Edit</a>
                        <a href="delete?id=<%= p.getId() %>" class="btn btn-sm btn-danger" 
                           onclick="return confirm('Are you sure you want to delete this item?');">Delete</a>
                    </td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="6" class="text-center text-muted py-3">No products found in inventory.</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>

</body>
</html>