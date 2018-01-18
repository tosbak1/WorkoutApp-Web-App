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
@WebServlet("/add-advice.do")
public class AddAdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdviceDao adviceDao = new AdviceDao();
	String username = "";
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String breakfast = request.getParameter("breakfast");
		String lunch = request.getParameter("lunch");
		String dinner = request.getParameter("dinner");
		String snacks = request.getParameter("snacks");
		String supplements = request.getParameter("supplements");
		String tips = request.getParameter("tips");

		if(!(breakfast.isEmpty() || lunch.isEmpty() || dinner.isEmpty() || snacks.isEmpty() ||supplements.isEmpty() || tips.isEmpty())){
			this.adviceDao.adviceAdded(username, breakfast, lunch, dinner, snacks, supplements, tips);
			response.sendRedirect("/list-advice.do");
		}
		else{
			request.setAttribute("errorMessage", "Please fill all the fields to add meal plan");
			request.getRequestDispatcher("/WEB-INF/views/adviceform.jsp").forward(request, response);
		}
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		username = request.getParameter("name");
		request.getRequestDispatcher("/WEB-INF/views/adviceform.jsp").forward(request, response);
	}
}
