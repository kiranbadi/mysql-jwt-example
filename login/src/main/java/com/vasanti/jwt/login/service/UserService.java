package com.vasanti.jwt.login.service;

import com.vasanti.jwt.login.model.LoginModel;

public interface UserService {
	
	boolean save(LoginModel loginModel);

}
