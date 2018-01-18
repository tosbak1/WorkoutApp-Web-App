package com.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AllPersonalWorkoutsDao {
	public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
	public static final String JDBC_URL = "jdbc:derby://localhost:1527/toyinDb;user=admin;password=user";

	public ArrayList<Workout> getAllPersonalWorkouts(String username) {
		final String SQL_STATEMENT1 = "select * from personallist where username = \'" + username + "\'";
		ArrayList<Workout> list = new ArrayList<Workout>();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_STATEMENT1);
			while (resultSet.next()) {
				list.add(new Workout(resultSet.getString("bodypart"), 
						resultSet.getString("difficulty"),
						resultSet.getString("workoutname"), 
						resultSet.getString("videolink"), 
						resultSet.getInt("reps"),
						resultSet.getInt("sets"), 
						resultSet.getString("fullbody")
				));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public int deleteWorkout(String workoutname, String name) {
		String SQL_STATEMENT2;
		
		if (workoutname.equals("everything")) {
			SQL_STATEMENT2 = "delete from personallist where username = \'" + name + "\'";
		} else{
			SQL_STATEMENT2 = "delete from personallist where workoutname = \'" + workoutname + "\' and username = \'" + name + "\'";
		}

		Connection connection = null;
		Statement statement = null;
		int count = 0;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			int c = statement.executeUpdate(SQL_STATEMENT2);
			count = count + c;
			System.out.println("Number of workouts removed: " + count);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	
	public ArrayList<Workout> getCoachesWorkouts(String username, String fullbody) {
		final String SQL_STATEMENT1 = "select * from personallist where username = \'" + username + "\' and fullbody = \'" + fullbody + "\'";
		ArrayList<Workout> list = new ArrayList<Workout>();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_STATEMENT1);
			while (resultSet.next()) {
				list.add(new Workout(resultSet.getString("bodypart"), 
						resultSet.getString("difficulty"),
						resultSet.getString("workoutname"), 
						resultSet.getString("videolink"), 
						resultSet.getInt("reps"),
						resultSet.getInt("sets"),
						resultSet.getString("fullbody")
						));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
