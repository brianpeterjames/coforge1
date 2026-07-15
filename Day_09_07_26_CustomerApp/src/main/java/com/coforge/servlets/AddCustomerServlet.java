package com.coforge.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.model.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCustomerServlet
 */
@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {
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
    @SuppressWarnings({ "null", "null" })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> customerList = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Statement st = null;

		String cidStr = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String city = request.getParameter("city"); // Maps to address field in your schema
		
		String query = "insert into customer values(?,?,?)";
		
		try {
			// 2. Prepare and bind the SQL inputs safely
			ps = con.prepareStatement(query);
			ps.setInt(1, Integer.parseInt(cidStr));
			ps.setString(2, cname);
			ps.setString(3, city);
			
			// 3. Run the database insert execution
			ps.executeUpdate();
			System.out.println("Customer saved into DB successfully!");
			
		} catch (SQLException | NumberFormatException e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "Database Insertion Failed: " + e.getMessage());
		} finally {
			if (ps != null) {
				try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
			}
		}
		query="select * from customer";
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			while(rs.next())
			{
				Customer c = new Customer();
				c.setCid(rs.getInt(1));
				c.setCname(rs.getString(2));
				c.setCity(rs.getString(3));
				customerList.add(c);
			}
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		request.setAttribute("customerList", customerList);
		
		RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
		
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
