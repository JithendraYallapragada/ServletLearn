import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServleConfig_Context extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("hello  from the ServleConfig_context");
		
		ServletConfig scf= getServletConfig();//ServletConfig
		  String name =scf.getInitParameter("gmail");
		  
		  ServletContext sct=getServletContext();//ServletContext
		  String name1=sct.getInitParameter("gmail");
		
		res.getWriter().print(name + " from config_contextServlet  " + name1+" from contextServlet");
		
		res.sendRedirect("AnnotationCheck");
	}
	

}
