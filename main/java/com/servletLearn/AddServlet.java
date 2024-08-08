package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{//extends the HttpServlet class to get the properties
	//service method is needed because the servlet checks only service method
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			//HttpServletResponse/Request are default obj's created by the apache server
			//request have the data you can access through the .getParameter("name of the input or field")
		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		int k=i+j;
		System.out.println(k);
		PrintWriter out=res.getWriter();//sends the out to the page 
		out.print("value of "+i+" "+j+" is : "+ k);
	}

}
