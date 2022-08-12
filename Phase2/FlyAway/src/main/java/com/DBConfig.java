package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {
	public static Connection getConnection(Properties props)
	{
		Connection connection=null;
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/flyaway";
		String username="root";
		String password="Ebinesardon@85";
		try
		{
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,password);
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
