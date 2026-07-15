package com.coforge.servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.coforge.Product;
import com.coforge.dao.*;

/**
 * Servlet implementation class ListProductServlet
 */
@WebServlet("/list")
public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDAO productDAO = new ProductDAO();

    /**
     * Default constructor. 
     */
    public ListProductServlet() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        List<Product> listProduct = productDAO.selectAllProducts();
        
        // Pass the list to the JSP page
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
