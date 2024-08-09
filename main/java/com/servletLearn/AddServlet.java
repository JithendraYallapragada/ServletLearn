package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		int k=i+j;
		
	//Using the sendRedirect(url);
		
		//Sends the response as the url and the url is added by the addServlet attributes so the data is transferred!!
		res.sendRedirect("square?k="+k);

	}	

}
