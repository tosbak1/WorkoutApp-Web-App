package webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.dao.RegisterDao;


@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterService canUserRegister = new RegisterService();
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
		System.out.println("Hey there buddy");
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String reenterPass = request.getParameter("confirm-password");
		String errorMessage = "";
		
		System.out.println("Hey there buddy2");
		boolean userReg = this.canUserRegister.canUserRegister(name, email, password, reenterPass);
		System.out.println("The user can register: " +userReg);
		boolean passMatch = this.canUserRegister.passwordMatch(password, reenterPass);
		if(registerDao.doesUserAlreadyExist(name)){
			request.setAttribute("errorMessage", "The username you are trying to use already exists");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		else if(registerDao.doesEmailAlreadyExist(email)){
			request.setAttribute("errorMessage", "The email address you are trying to use already exists");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		else{
			if (userReg && passMatch) {
				RegisterDao registerDao = new RegisterDao();
				registerDao.registerUser(name, email, password);
				
				request.getSession().setAttribute("name", name);
				response.sendRedirect("/list-workouts.do");
			} 
			else {
				request.setAttribute("errorMessage", "Please enter accurate information");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			}
		}
	}

}