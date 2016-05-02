package com.example;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LocationController {
	@RequestMapping(value="/getResult", method= RequestMethod.POST)
	@ResponseBody
	public  Location  getLocation(@RequestBody Location location) {
		try {
			Process p = Runtime.getRuntime().exec("python /etc/tomcat7/testscript.py");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return location;
		

	}
}
