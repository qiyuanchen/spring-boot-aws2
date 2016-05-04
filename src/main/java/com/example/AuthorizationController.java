package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthorizationController {
	@Autowired
	private userRepo repo;
	
	@RequestMapping(value="/auth", method= RequestMethod.POST)
	
	@ResponseBody
	public authResultCode auth(@RequestBody userRequest request){
		
		authResultCode result=new authResultCode();
		user u=repo.findByuserName(request.user_name);
		if(u!=null){
			if(request.password.equals(u.getpw())){
				result.result=u.getID();
			}
		}
		return result;
		
	}
	@RequestMapping(value="/newAccount", method= RequestMethod.POST)
	
	@ResponseBody
	public authResultCode newUser(@RequestBody userRequest request){
		authResultCode result=new authResultCode();

		user newuser=new user(request.user_name,request.password);
		repo.save(newuser);
		result.result=newuser.getID();
		return result;
		
	}
}
