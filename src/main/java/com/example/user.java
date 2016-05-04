package com.example;

import org.springframework.data.annotation.Id;

public class user {
	@Id
	private String id;

	private String userName;
	private String password;
	public user(String first, String last) {
		this.userName = first;
		this.password = last;

	}

	public user() {

	}

	@Override
	public String toString() {
		return String.format("User[id=%s, userName='%s', password='%s']", id, userName, password);
	}
	public String getUserName(){
		return userName;
	}
	public String getpw(){
		return password;
	}
	public String getID(){
		return id;
	}

}
