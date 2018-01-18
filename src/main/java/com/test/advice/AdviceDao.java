package com.test.advice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.webapp.dao.Workout;

public class AdviceDao {
	public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
	public static final String JDBC_URL = "jdbc:derby://localhost:1527/toyinDb;user=admin;password=user";
	
	public int adviceAdded(String username, String breakfast, String lunch, String dinner, String snacks, String supplements, String tips){
		final String SQL_STATEMENT2 = "update CoachAdvice set breakfast = \'" 
				+ breakfast + "\', lunch = \'"
				+ lunch + "\', dinner = \'"
				+ dinner + "\', snacks = \'"
				+ snacks + "\', supplements = \'"
				+ supplements + "\', tips = \'"
				+ tips + "\' where username = \'" 
				+ username + "\'";

		Connection connection = null;
		Statement statement = null;
		int count = 0;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			int c = statement.executeUpdate(SQL_STATEMENT2);
			count = count + c;
			System.out.println("Number of advice added: " + count);
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
		return count;
	}
	
	public ArrayList<Advice> selectCoachAdvice(String username) {
		final String SQL_STATEMENT1 = "select * from CoachAdvice where username = \'" + username + "\'";
		ArrayList<Advice> list = new ArrayList<Advice>();
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(JDBC_URL);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL_STATEMENT1);
			while (resultSet.next()) {
				list.add(new Advice(resultSet.getString("breakfast"), 
						resultSet.getString("lunch"),
						resultSet.getString("dinner"), 
						resultSet.getString("snacks"), 
						resultSet.getString("supplements"),
						resultSet.getString("tips")
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
