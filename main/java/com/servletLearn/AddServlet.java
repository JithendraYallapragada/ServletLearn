package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		int k=i+j;
		System.out.println(k);
		PrintWriter out=res.getWriter();
		out.print("value of "+i+" "+j+" is : "+ k);
	}

}
