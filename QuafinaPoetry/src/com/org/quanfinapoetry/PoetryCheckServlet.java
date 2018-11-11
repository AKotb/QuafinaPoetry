package com.org.quanfinapoetry;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.tempuri.ArrayOfAnalysisClass;
import com.org.tempuri.WebServicePoetry;
import com.org.tempuri.WebServicePoetrySoap;

/**
 * Servlet implementation class PoetryCheckServlet
 */
@WebServlet("/PoetryCheckServlet")
public class PoetryCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PoetryCheckServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append("Client");
		// WebServicePoetry webServicePoetry = new WebServicePoetry();
		// WebServicePoetrySoap webServicePoetrySoap =
		// webServicePoetry.getWebServicePoetrySoap();
		// webServicePoetrySoap.getSeasFromEngine("„ ›«⁄·‰ „ ›«⁄·‰");;
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/poetrycheck.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
