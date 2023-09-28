package com.example.demo.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	//the error that was irritating remove this line spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect from application properties.
	//after this it is easy just create a function to get connection like previous swing project
	//create database and establish connection.
	// do not change application properties and pom.xml
	//run application as spring boot app
	//tomcat will not start on port 8072
	
	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException {
		if(connection!=null) {
			return connection;

		}
		else {
			try {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
				String url = "jdbc:mysql://localhost:3306/";

				String dataBase ="serviceSite";

				String user ="root";

				String password ="root";

				Connection connection = DriverManager.getConnection(url+dataBase, user, password);
				return connection;
				
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
			
		}

	}

}
