package webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.webapp.dao.RegisterDao;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private LoginService userValidService = new LoginService();
	private RegisterDao registerDao = new RegisterDao();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// This just prints in the console
		// System.out.println(request.getParameter("name1"));

		// Pass request parameter from servlet to JSP ?name=toyin
		// put an attribute into the request and in jsp we take attribute from
		// request
		// request.setAttribute("name", request.getParameter("name"));
		// request.setAttribute("password", request.getParameter("password"));
		if (request.getSession().getAttribute("name") == null) {
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		else{
			response.sendRedirect("/homeServlet");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		// boolean isUserValid = this.userValidService.isUuserValid(name,
		// password);
		boolean isUserIn = this.registerDao.doesUserExist(name, password);
		if (isUserIn) {
			// request.setAttribute("password", password);
			/*
			 * This is a previous step before TodoServlet
			 * request.setAttribute("todos", todoService.retrieveTodos());
			 * request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").
			 * forward(request, response);
			 */
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/homeServlet");
		} else {
			request.setAttribute("errorMessage", "Invalid Login. Please check username and password again");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}