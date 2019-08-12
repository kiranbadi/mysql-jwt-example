package com.vasanti.jwt.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasanti.jwt.login.dao.UserRepository;
import com.vasanti.jwt.login.model.LoginModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean save(LoginModel loginModel) {		
		boolean status = false;		
		loginModel = userRepository.save(loginModel);		
		if(loginModel.getUser_id() != 0) {
			status = true;
		}		
		return status;
	}

}
