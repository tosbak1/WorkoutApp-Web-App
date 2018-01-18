package com.test.workout;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.dao.AllPersonalWorkoutsDao;

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

@WebServlet(urlPatterns = "/list-personal.do")
public class ListPersonalWorkoutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AllPersonalWorkoutsDao workoutDao = new AllPersonalWorkoutsDao();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		
		//This just prints in the console
		//System.out.println(request.getParameter("name1")); 
		
		//Pass request parameter from servlet to JSP ?name=toyin
		//put an attribute into the request and in jsp we take attribute from request
		//request.setAttribute("name", request.getParameter("name"));
		//request.setAttribute("password", request.getParameter("password"));
		//request.setAttribute("todos", todoService.retrieveTodos());
		String username = (String) request.getSession().getAttribute("name");
		request.setAttribute("personalworkouts", workoutDao.getAllPersonalWorkouts(username));
		request.setAttribute("allworkoutsnum", workoutDao.getAllPersonalWorkouts(username).size());
		request.getRequestDispatcher("/WEB-INF/views/list-personal-workouts.jsp").forward(request, response);
	}
}