package com.coforge.servlets;

import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.coforge.dao.ProductDAO;
import com.coforge.Product;

@WebServlet("/edit") // <--- This matches the link on your index.jsp
public class UpdateServlet extends HttpServlet {
    private ProductDAO productDAO = new ProductDAO();

    // 1. When the user clicks the "Edit" link, it sends a GET request here
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        // Fetch the product data from the database
        Product existingProduct = productDAO.selectProduct(id);
        
        // Send that product data to the form page
        request.setAttribute("product", existingProduct);
        request.getRequestDispatcher("product-form.jsp").forward(request, response);
    }

    // 2. When the user clicks "Save Changes" on the form, it sends a POST request here
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = new Product(id, name, category, quantity, price);
        
        try {
            productDAO.updateProduct(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        response.sendRedirect(request.getContextPath() + "/list");
    }
}
