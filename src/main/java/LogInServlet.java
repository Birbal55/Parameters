import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogInServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		resp.getWriter().write("Login Servlet " + email + " -- " + password);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    
		    HttpSession httpsession = req.getSession();
		    httpsession.invalidate();
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			resp.getWriter().write("Login Servlet from POST " + email + " -- " + password);
		}

}
