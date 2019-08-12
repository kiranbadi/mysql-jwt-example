package com.vasanti.jwt.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasanti.jwt.login.model.APIResponsemModel;
import com.vasanti.jwt.login.model.LoginModel;
import com.vasanti.jwt.login.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping({ "/test" })
	public String TestPage() {
		return "Spring Security JWT works fine !!";
	}
	

	
	
	@RequestMapping({ "/register" })
	public ResponseEntity<APIResponsemModel>  registerUser(@RequestBody LoginModel loginModel) {		
		APIResponsemModel responseModel = new APIResponsemModel();
		System.out.println("loginModel is " + loginModel);
		loginModel.setPassword(passwordEncoder.encode(loginModel.getPassword()));
		boolean status = userService.save(loginModel);
		if(status) {
			responseModel.setMessage(" User " + loginModel.getFirstName() + " "+ loginModel.getLastName() + " created successfully ") ;
			responseModel.setStatus("success");
			responseModel.setStatusCode(201L);
			return new ResponseEntity<>(responseModel,HttpStatus.CREATED);
		}		
		responseModel.setMessage(" User " + loginModel.getFirstName() + " " + loginModel.getLastName() + " failed to create successfully ") ;
		responseModel.setStatus("failure");
		responseModel.setStatusCode(500L);
		return new ResponseEntity<>(responseModel,HttpStatus.INTERNAL_SERVER_ERROR);		
	}

}
