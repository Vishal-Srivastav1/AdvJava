package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {
    @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    //get PrintWriter
   	 PrintWriter pw=res.getWriter();
    //set response content type
   	 res.setContentType("text/html");
   	 //read addtoional req param value(p1)
   	String s1val=req.getParameter("s1");
   	//read from data (text box value)
   	int val1=0,val2=0;
   	//read text box values only when request is not from Hyperlinks
   	if(!s1val.equalsIgnoreCase("link1")&& !s1val.equalsIgnoreCase("link2")) { 
   	  val1=Integer.parseInt(req.getParameter("t1"));
   	  val2=Integer.parseInt(req.getParameter("t2"));
   	}
    //deffirentiat logics for submit buttons and hyperlinks
   	if(s1val.equalsIgnoreCase("add"))
   		pw.println("<h1>Sum of "+val1+" and "+val2+" is:: "+(val1+val2)+"</h1>");
   	else if(s1val.equalsIgnoreCase("sub"))
   		pw.println("<h1>Sub of "+val1+" and "+val2+" is:: "+(val1-val2)+"</h1>");
   	else if(s1val.equalsIgnoreCase("mul"))
   		pw.println("<h1>Mul of "+val1+" and "+val2+" is:: "+(val1*val2)+"</h1>");
   	else if(s1val.equalsIgnoreCase("div"))
   		pw.println("<h1>div of "+val1+" and "+val2+" is:: "+((float)val1/val2)+"</h1>");
   	else if(s1val.equalsIgnoreCase("link1")) {
   		pw.println("<h1> System Propertity are</h1>");
   		pw.println("<br>"+System.getProperties()+"</br>");
    }
    else {
   	 pw.println("<h1>System date and Time ::"+LocalDateTime.now()+"</h1>");
    }
   	
   	//add home hyperlink
   	pw.println("<br> <a href='multiplebutton.html'>Home</a>");
   	
   	//close stream
   	pw.close();
    }
    @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
   	// TODO Auto-generated method stub
   	 doGet(req, res);
   }
}
