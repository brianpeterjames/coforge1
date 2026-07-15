package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LogoutServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// 1. Get session without creating a new one
		HttpSession session = request.getSession(false);
		
		// 2. Check if session exists BEFORE accessing its attributes
		if (session != null) {
			String email = (String) session.getAttribute("email");
			out.println("Thank You " + email);
			
			// Invalidate the session to log out
			session.invalidate();
		} else {
			// If no session exists, redirect straight to login
			response.sendRedirect("login.jsp");
			return; // Stop further execution of this method
		}
		
		// 3. Clear cache headers so user can't use the 'Back' button to see cached pages
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0); 
		
		// 4. Redirect after logging out
		response.sendRedirect("login.jsp");
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
