package com.vasanti.jwt.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vasanti.jwt.login.model.LoginModel;

@Repository
public interface UserRepository extends JpaRepository<LoginModel, Long>{
	
	LoginModel findByUsername(String username);
}
