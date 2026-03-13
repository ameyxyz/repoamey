package com.example.demo.exception;

import java.time.LocalDate;

public class ExceptionResponse {
	private String errorMessage;
	private LocalDate timeOfException;
	private int stateCode;
	public ExceptionResponse(String errorMessage, LocalDate timeOfException, int stateCode) {
		super();
		this.errorMessage = errorMessage;
		this.timeOfException = timeOfException;
		this.stateCode = stateCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LocalDate getTimeOfException() {
		return timeOfException;
	}
	public void setTimeOfException(LocalDate timeOfException) {
		this.timeOfException = timeOfException;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	

}
