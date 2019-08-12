package com.vasanti.jwt.login.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6497605504518310302L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
