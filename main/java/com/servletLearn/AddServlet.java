package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i=Integer.parseInt(req.getParameter("number1"));
		int j=Integer.parseInt(req.getParameter("number2"));
		int k=i+j;
		
	//Using the sendRedirect(url);
		
		//cookie management
//		Cookie c=new Cookie("k",k+"");
//		res.addCookie(c);
		
		
		//Session management
		HttpSession hs= req.getSession();
		hs.setAttribute("k", k);
		
		
		
		res.sendRedirect("square");
		
	}	

}
