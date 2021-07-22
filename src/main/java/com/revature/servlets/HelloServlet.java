package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	//to have functionality i need to override the service methjod
	//(bad parctice) or at leat one "do" method
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String URI = req.getRequestURI(); //get location string was sent to
		System.out.println(URI);
		
		//responses come with a method to create a Pront Writer to write the body
		//of the response
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Hello from your doGet method.</h1>");
		
		
		
	}

}
