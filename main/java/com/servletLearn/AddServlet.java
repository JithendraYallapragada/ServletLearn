package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{//extends the HttpServlet class to get the properties
	//service method is needed because the servlet checks only service method
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		//doPost accepts the post request and same as doGet
		//post method posts the data &get method pulls the data and this method sends data from the url
		
		//doPost and doGet are the methods in service so they are accepted!!!
			
			//HttpServletResponse/Request are default obj's created by the apache server
			//request have the data you can access through the .getParameter("name of the input or field")
		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		int k=i+j;
//		System.out.println(k);
//		PrintWriter out=res.getWriter();//sends the out to the page 
//		out.print("value of "+i+" "+j+" is : "+ k);
		req.setAttribute("k",k);
		RequestDispatcher rd= req.getRequestDispatcher("square");//dispatches the Request with the provide url
		//forward method forwards the request and the response of the client to the present servlet
		//the present servlet sends the attributes to the another servlet by adding the setAttribute to the request from the user later the 
		//request is sent from the forward method from the request dispatcher
		rd.forward(req, res);
	}

}
