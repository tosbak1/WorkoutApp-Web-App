package com.test.coach;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.dao.AllPersonalWorkoutsDao;

@WebServlet(urlPatterns = "/view-coaches-workouts.do")

public class ViewCoachesWorkoutsServlet extends HttpServlet {
	
	private AllPersonalWorkoutsDao coacheslist = new AllPersonalWorkoutsDao();

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String fullbody = request.getParameter("fullbody");
		request.setAttribute("coachesworkout", coacheslist.getCoachesWorkouts("Toyin", fullbody));
		request.setAttribute("allworkoutsnum", coacheslist.getCoachesWorkouts("Toyin", fullbody).size());
		request.setAttribute("fullbody", fullbody.toUpperCase());
		request.getRequestDispatcher("/WEB-INF/views/list-coaches-bodyworkouts.jsp").forward(request, response);
		
		*/
		String name = "";
		name = request.getParameter("name");
		request.setAttribute("coachName", name);
		request.getRequestDispatcher("/WEB-INF/views/list-coaches-workouts.jsp").forward(request, response);

	}
}
