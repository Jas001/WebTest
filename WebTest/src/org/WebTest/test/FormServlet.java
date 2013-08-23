package org.WebTest.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FormServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("userName");
		String email = req.getParameter("email");
		String ip = req.getRemoteAddr();
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>This is the response</title>");
		writer.println("<body>");
		writer.println("Your name is:" + name + "<br/>");
		writer.println("Your email is:" + email + "<br/>");
		writer.println("Your your ip is:" + ip + "<br/>");
		writer.println("</body>");
		writer.println("</html>");
		
	}
}
