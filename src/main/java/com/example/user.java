package com.example;

import org.springframework.data.annotation.Id;

public class user {
	@Id
	private String id;
	// check if new user
	public boolean new_user=true;

	// BINARY VALUES
	private String userName;
	private String password;
	public Integer Accepts_Credit_Card=0;
	public Integer Good_For_Groups=0;
	public Integer Has_TV=0;
	public Integer Happy_Hour=0;
	public Integer Good_For_Dancing=0;
	public Integer Good_For_Kids=0;
	public Integer Alcohol=0;
	public Integer Smoking=0;

	// MULTI VALUED
	public Noise NoiseLevel=new Noise();

	//public Music_ Music;

	public static class Noise {
		public Integer Quiet=0;
		public Integer Average=0;
		public Integer Loud=0;
		public Integer Very_Loud=0;
		public Noise(){
			
		}
	}

	public static class Music_ {
		public Integer Juke_Box=0;
		public Integer DJ=0;
		public Integer Karaoke=0;
		public Integer Live=0;
		public Integer Background=0;
		public Integer Music_Videos=0;
	}

	public user(String first, String last) {
		this.userName = first;
		this.password = last;
		newuser();

	}

	public user() {
		

	}

	@Override
	public String toString() {
		return String.format("User[id=%s, userName='%s', password='%s']", id, userName, password);
	}

	public String getUserName() {
		return userName;
	}

	public String getpw() {
		return password;
	}

	public String getID() {
		return id;
	}

	public void newuser() {
		Accepts_Credit_Card = 0;
		Good_For_Groups = 0;
		Has_TV = 0;
		Happy_Hour = 0;
		Good_For_Dancing = 0;
		Good_For_Kids = 0;
		Alcohol = 0;
		Smoking = 0;
		new_user = true;
		NoiseLevel.Average=0;
		NoiseLevel.Loud=0;
		NoiseLevel.Quiet=0;
		NoiseLevel.Very_Loud=0;
		//Music
		/*
		Music.Background=0;
		Music.DJ=0;
		Music.Juke_Box=0;
		Music.Karaoke=0;
		Music.Live=0;
		Music.Music_Videos=0;*/

	}

}
