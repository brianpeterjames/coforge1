package com.coforge.Day_08_07_26_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		//Load the driver 
		System.out.println("Hello World");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/empdb";
		String uname = "root";
		String pwd = "Bjpop@20";
		// Establish Connection
		Connection con = DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connection Established");
		// 3. Create or Use Statement 
		// Statement -- select 
		String query="select * from employeesalary";
		Statement statement=con.createStatement();
		
		
		// PreparedStatement --- DML Queries 
		//CallableStatement -- procedures 
		
		//4. Execute Query 
		ResultSet rs = statement.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getDate(5));
		}
		
		// executeQuery -- select (result is set of records),
		//executeUpdate -- dml(an int is returned)
		// execute -- boolean value 
		
	}

}
