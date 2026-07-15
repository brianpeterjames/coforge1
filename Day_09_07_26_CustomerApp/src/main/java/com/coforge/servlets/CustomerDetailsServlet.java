package com.coforge.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.coforge.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerDetailsServlet
 */
@WebServlet("/CustomerDetailsServlet")
public class CustomerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
Connection con = null;
    @Override
    	public void init() throws ServletException
    	{
    	super.init();
    	ServletContext context = getServletContext();
    	try {
			Class.forName(context.getInitParameter("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 try {
			con = DriverManager.getConnection(context.getInitParameter("url"),
					context.getInitParameter("uname"), context.getInitParameter("pwd"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	}
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
//
//		customerList.add(new Customer(101, "Rahul Sharma", "Hyderabad"));
//
//		customerList.add(new Customer(102, "Priya Reddy", "Bengaluru"));
//
//		customerList.add(new Customer(103, "Amit Verma", "Chennai"));
//
//		customerList.add(new Customer(104, "Sneha Patil", "Mumbai"));
//
//		customerList.add(new Customer(105, "Kiran Kumar", "Pune"));
//
//		customerList.add(new Customer(106, "Anjali Singh", "Delhi"));
//
//		customerList.add(new Customer(107, "Vikram Rao", "Visakhapatnam"));
//
//		customerList.add(new Customer(108, "Meena Joshi", "Kolkata"));
//
//		customerList.add(new Customer(109, "Arjun Nair", "Kochi"));
//
//		customerList.add(new Customer(110, "Pooja Mehta", "Ahmedabad"));
		
		String query = "select * from customer";
		
		Statement st = null;
		ResultSet rs = null;
		try {
			st.getConnection().createStatement();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			
			rs=st.executeQuery(query);
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		Customer c = new Customer();
		try {
			while(rs.next())
			{
				c.setCid(rs.getInt(1));
				c.setCname(rs.getString(2));
				c.setCity(rs.getString(3));
			}
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
		request.setAttribute("customerList", customerList);
		
		RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
		
		rd.forward(request, response);
		Customer addCustomer = new Customer(Integer.parseInt(request.getParameter("cid")),
			request.getParameter("cname"),request.getParameter("city"));
		customerList.add(addCustomer);
		

		request.setAttribute("customerList", customerList);
		
		rd=request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
