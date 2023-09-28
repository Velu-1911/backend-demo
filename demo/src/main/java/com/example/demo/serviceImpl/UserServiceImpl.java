package com.example.demo.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.example.demo.dbutil.DBUtil;
import com.example.demo.service.UserService;

//This implements the interface and also provides code to the functionalities.
//this annotation says some business functionalities are being performed here.
//this consists of general query to see if the user exists or not.
@Service
public class UserServiceImpl  implements UserService{
	
	Connection connection;

	public UserServiceImpl() throws SQLException {
		connection = DBUtil.getConnection();
		
	}

	@Override
	public int loginValidation(String username, String password) {
		// TODO Auto-generated method stub
		try {
			int flag =0;
			PreparedStatement statement = connection.prepareStatement("select * from users where username = ?");
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(5).equals(username) && rs.getString(6).equals(password)) {
					flag = 1;
					return flag;
				}
				else {
					System.out.println("invalid username or password");
					flag =0;
					return flag;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	

}
