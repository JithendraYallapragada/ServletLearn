import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AnnotationCheck")//Annotation without xml configuration
public class AnnotationClassCheck extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException  {
		
		res.getWriter().println("hello from AnnotationClassCheckServlet");
		ServletContext sc= getServletContext();
		String gmail=sc.getInitParameter("gmail");
		res.getWriter().print(gmail +" is the contact mail ");
		
	}

}
