package com.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AllWorkoutsDao {
	public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
	public static final String JDBC_URL = "jdbc:derby://localhost:1527/toyinDb;user=admin;password=user";
	public static final String SQL_STATEMENT1 = "select * from workoutlist";
	
	public ArrayList<Workout> getAllWorkouts() {
		ArrayList<Workout> list = new ArrayList<Workout>();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_STATEMENT1);
			while (resultSet.next()) {
				list.add(new Workout(
						resultSet.getString("bodypart"),
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
		}finally{
			try{
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
	public ArrayList<Workout> getAllBodyPartWorkouts(String bodypart) {
		final String SQL_STATEMENT1 = "select * from workoutlist where bodypart = \'" + bodypart + "\'";
		ArrayList<Workout> list = new ArrayList<Workout>();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_STATEMENT1);
			while (resultSet.next()) {
				list.add(new Workout(
						resultSet.getString("bodypart"),
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
		}finally{
			try{
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return list;
	}
}
