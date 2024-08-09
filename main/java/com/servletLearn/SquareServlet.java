package com.servletLearn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//cookie management
//		int k=0;
//		//check the web.xml there the linkage of the servlet happen 
//			Cookie c[] =req.getCookies();
//			for(Cookie nc: c) {
//				if(nc.getName().equals("k")){
//					k=Integer.parseInt(nc.getValue());
//				}
//			}
		
		//Session management
		HttpSession session =req.getSession();
		int k= (int)session.getAttribute("k");
		
		k=k*k;
		PrintWriter out= res.getWriter(); 
		out.print("Squared is :"+k);
		
	}

}
