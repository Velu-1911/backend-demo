
package com.example.demo.model;

public class users {
	
	//This acts like a pojo class but this is not used.
	String name;
	String username;
	String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public users(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "users [name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	
}