package com.example;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "result")
public class Results {
	public String category;
	public int level;
	public HashMap<String, Integer> stats;
	public HashMap<String, String> contact;
	public HashMap<String, String> location;
	public HashMap<String, String> attributes;
	@Id
	public String id;
	public String name;
	public String url;

	public Results() {

	}

}
