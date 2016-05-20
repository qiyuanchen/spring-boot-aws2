package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

@Controller
public class LocationController {
	@Autowired
	ResultsRepo resultsRepo;
	@Autowired
	LocationRepo locationRepo;
	@RequestMapping(value="/getResult", method= RequestMethod.POST)
	@ResponseBody
	public  return_result  getLocation(@RequestBody Location location) {
		locationRepo.save(location);
		try {
			Process p = Runtime.getRuntime().exec("python /etc/tomcat7/ml.py");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//while(resultsRepo.findAll().size()<30){}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Results>result=new ArrayList<Results>();
		for(Results i:resultsRepo.findAll()){
			result.add(i);
			resultsRepo.deleteByid(i.id);
		}
		return_result rr=new return_result();
		rr.result=result;
		return rr;
		

	}
}
