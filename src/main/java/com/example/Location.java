package com.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "query")
public class Location {
	@Id
	private String db_id;
	private double lat;
	private double lng;
	private String id;
	public Location(String userID, double lat, double lng){
		this.lat=lat;
		this.lng=lng;
		this.id=userID;
	}
	public double getLat(){
		return lat;
	}
	public double getLng(){
		return lng;
	}
	public String getID(){
		return id;
	}
	public Location(){
		
	}

}
