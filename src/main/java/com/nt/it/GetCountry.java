package com.nt.it;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCountry extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get printwritter 
		PrintWriter pw= resp.getWriter();
		//set response type 
		resp.setContentType("text/html");
		// read from data 
		int countrys=Integer.parseInt(req.getParameter("country"));
		// get Capital Name 
		 String capital[]= new String[] {"New Delhi","Islamabad","WashingtonDc","Beijing"};
		 String Country[]= new String[]{"India","pakistan","USA","china"};
		
		pw.println("<h1 style='color:blue; text-align=center'>Country name "+Country[countrys]+" ->  captial is:: "+capital[countrys]+"</h1>");
	// add home hyperlink
		pw.print("<a href='page.html'>home</a>");
	/// close stream
		pw.close();
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}