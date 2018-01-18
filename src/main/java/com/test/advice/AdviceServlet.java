package com.test.advice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/list-advice.do")
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdviceDao adviceDao = new AdviceDao();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("ToyinList", adviceDao.selectCoachAdvice("Toyin"));
		request.setAttribute("TobiList", adviceDao.selectCoachAdvice("Tobi"));
		request.setAttribute("StefanoList", adviceDao.selectCoachAdvice("Stefano"));

		request.getRequestDispatcher("/WEB-INF/views/advice.jsp").forward(request, response);
	}
}
