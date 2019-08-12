package com.vasanti.jwt.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vasanti.jwt.login.dao.UserRepository;
import com.vasanti.jwt.login.model.LoginModel;


@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	    private final UserRepository userRepository;

	    public JwtUserDetailsService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException {
	        LoginModel userObject = userRepository.findByUsername(username);
	        if (userObject != null) {
	            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	            authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
	            return new User(
	                userObject.getUsername(),
	                userObject.getPassword(),
	                authorities
	            );
	        }
	        throw new UsernameNotFoundException(
	            "User '" + username + "' not found.");
	    }
	}

