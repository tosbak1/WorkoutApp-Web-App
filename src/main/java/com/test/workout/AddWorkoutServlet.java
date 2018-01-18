package com.test.workout;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.dao.AddWorkoutDao;

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

@WebServlet(urlPatterns = "/add-workout.do")
public class AddWorkoutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AddWorkoutDao addworkoutDao = new AddWorkoutDao();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		

		String workoutName = request.getParameter("workoutname");
		String bodypart = request.getParameter("bodypart");
		String fullbody = request.getParameter("fullbody");
		String difficulty = request.getParameter("difficulty");
		String link = request.getParameter("link");
		String sets = request.getParameter("sets");
		String reps = request.getParameter("reps");
		if(addworkoutDao.doesWorkoutnameAlreadyExist(workoutName)){
			request.setAttribute("errorMessage", "Choose a different name for the workout");
			request.getRequestDispatcher("/WEB-INF/views/add-workout.jsp").forward(request, response);

		}
		else{
			if(!(workoutName.isEmpty() || bodypart.isEmpty() || fullbody.isEmpty() || difficulty.isEmpty() ||link.isEmpty() || sets.isEmpty() || reps.isEmpty())){
				this.addworkoutDao.addWorkout(bodypart, fullbody, difficulty, workoutName, link, Integer.parseInt(sets), Integer.parseInt(reps));
				
				response.sendRedirect("/list-workouts.do");
			}
			else{
				request.setAttribute("errorMessage", "Please fill all the fields to add your workout");
				request.getRequestDispatcher("/WEB-INF/views/add-workout.jsp").forward(request, response);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/add-workout.jsp").forward(request, response);
	}
}