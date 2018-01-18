package com.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddWorkoutDao {
	public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
	public static final String JDBC_URL = "jdbc:derby://localhost:1527/toyinDb;user=admin;password=user";

	public int addWorkout(String bodypart, String fullbody, String difficulty, String workoutname, String videolink, int reps,
			int sets) {
		final String SQL_STATEMENT2 = "insert into workoutlist (bodypart, difficulty, workoutname, "
				+ "videolink, reps, sets, fullbody) values (\'"
				+ bodypart + "\', \'" + difficulty + "\', \'" + workoutname
				+ "\', \'" + videolink + "\'," + reps
				+ ", " + sets+ ", \'" + fullbody + "\'" + ")";
		Connection connection = null;
		Statement statement = null;
		int count = 0;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			int c = statement.executeUpdate(SQL_STATEMENT2);
			count = count + c;
			System.out.println("Number of people added: " + count);
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
	
	public boolean doesWorkoutnameAlreadyExist(String workoutname){
		final String SQL_STATEMENT2 = "select * from WORKOUTLIST where lower(workoutname) = \'"+ workoutname.toLowerCase() +"\'";
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_STATEMENT2);
			if(resultSet.next()){
				return true;
			}
		}catch (ClassNotFoundException | SQLException e) {
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
		return false;
	}

}
