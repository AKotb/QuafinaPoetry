package com.org.quanfinapoetry;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserManagerServlet
 */
@WebServlet(description = "Servlet to manage all operations related to user", urlPatterns = { "/UserManagerServlet" })
public class UserManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserManagerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/user.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String un=request.getParameter("userName");  
	    String up=request.getParameter("userPass");  
	          
	    if(un.equals("admin")&&up.equals("admin")){  
	        RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");  
	        rd.forward(request, response);
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");
	        RequestDispatcher rd=request.getRequestDispatcher("/user.jsp");
	        rd.include(request, response);  
	        }  
	    }
}
