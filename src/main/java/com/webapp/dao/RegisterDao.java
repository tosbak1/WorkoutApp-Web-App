package com.webapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDao {
	public static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";
	public static final String JDBC_URL = "jdbc:derby://localhost:1527/toyinDb;user=admin;password=user";
	
	public int registerUser(String username, String email, String password){
		final String SQL_STATEMENT2 = "insert into userInfo (username, emailaddress, password) values (\'"
				+ username +"\', \'" + email + "\', \'" + password + "\')";
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
	
	public boolean doesUserExist(String username, String password){
		final String SQL_STATEMENT2 = "select * from userInfo where lower(username) = \'"+ username.toLowerCase() +"\' AND password = \'" + password+"\'";
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
	
	public boolean doesUserAlreadyExist(String username){
		final String SQL_STATEMENT2 = "select * from userInfo where lower(username) = \'"+ username.toLowerCase() +"\'";
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
	
	
	public boolean doesEmailAlreadyExist(String email){
		final String SQL_STATEMENT2 = "select * from userInfo where emailaddress = \'"+ email +"\'";
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
