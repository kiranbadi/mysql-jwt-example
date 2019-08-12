package com.vasanti.jwt.login.model;

public class APIResponsemModel {
	
	private String status ;
	
	private String message;
	
	private Long statusCode;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "APIResponsemModel [status=" + status + ", message=" + message + ", statusCode=" + statusCode + "]";
	}

}
