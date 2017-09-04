package com.example.demo.model;

public class ErrorResponse {

	 String errorName;
	 String errorMessage;
	 
	public ErrorResponse(String errorName, String errorMessage) {
		super();
		this.errorName = errorName;
		this.errorMessage = errorMessage;
	}
	public String getErrorName() {
		return errorName;
	}
	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	 
}
