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
	public Double Accepts_Credit_Cards=1.0;
	public Double Good_for_Groups=1.0;
	public Double Has_TV=1.0;
	public Double Happy_Hour=1.0;
	public Double Good_For_Dancing=1.0;
	public Double Good_for_Kids=1.0;
	public Double Alcohol=1.0;
	public Double Smoking=1.0;

	// MULTI VALUED
	public Noise Noise_Level=new Noise();

	//public Music_ Music;

	public static class Noise {
		public Double Quiet=1.0;
		public Double Average=1.0;
		public Double Loud=1.0;
		public Double Very_Loud=1.0;
		public Noise(){
			
		}
	}

	public static class Music_ {
		public Double Juke_Box=1.0;
		public Double DJ=1.0;
		public Double Karaoke=1.0;
		public Double Live=1.0;
		public Double Background=1.0;
		public Double Music_Videos=1.0;
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
		Accepts_Credit_Cards = 1.0;
		Good_for_Groups = 1.0;
		Has_TV = 1.0;
		Happy_Hour = 1.0;
		Good_For_Dancing = 1.0;
		Good_for_Kids = 1.0;
		Alcohol = 1.0;
		Smoking = 1.0;
		new_user = true;
		Noise_Level.Average=1.0;
		Noise_Level.Loud=1.0;
		Noise_Level.Quiet=1.0;
		Noise_Level.Very_Loud=1.0;
		//Music
		/*
		Music.Background=0;
		Music.DJ=0;
		Music.Juke_Box=0;
		Music.Karaoke=0;
		Music.Live=0;
		Music.Music_Videos=0;*/

	}
	public void updateAtt(user r){
		this.Accepts_Credit_Cards=r.Accepts_Credit_Cards;
		this.Good_for_Groups=r.Good_for_Groups;
		this.Has_TV=r.Has_TV;
		this.Happy_Hour=r.Happy_Hour;
		this.Good_For_Dancing=r.Good_For_Dancing;
		this.Good_for_Kids=r.Good_for_Kids;
		this.Alcohol=r.Alcohol;
		this.Smoking=r.Smoking;
		this.new_user=r.new_user;
		this.Noise_Level=r.Noise_Level;
	}
	

}
