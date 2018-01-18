package com.test.coach;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.dao.AllPersonalWorkoutsDao;

@WebServlet(urlPatterns = "/view-coaches-selected-workouts.do")

public class ViewCoachesSelectedWorkoutsServlet extends HttpServlet {
	
	private AllPersonalWorkoutsDao coacheslist = new AllPersonalWorkoutsDao();

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coachName = request.getParameter("name");
		String fullbody = request.getParameter("fullbody");
		request.setAttribute("coachesworkout", coacheslist.getCoachesWorkouts(coachName, fullbody));
		request.setAttribute("allworkoutsnum", coacheslist.getCoachesWorkouts(coachName, fullbody).size());
		request.setAttribute("fullbody", fullbody.toUpperCase());
		request.getRequestDispatcher("/WEB-INF/views/list-coaches-bodyworkouts.jsp").forward(request, response);
		

	}
}
