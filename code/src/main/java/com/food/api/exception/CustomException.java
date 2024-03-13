package com.food.api.exception;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown =true)
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 736442945652478937L;

	private HttpStatus httpStatus;
	
	private String transactionId;
	
	private String errorMessage;

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public int getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(int ErrorCode) {
		this.ErrorCode = ErrorCode;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}




	private int ErrorCode;
	// private String ErrorMessage;

	public CustomException() {
		super();
	}

	public CustomException(HttpStatus httpStatus, int ErrorCode, String message) {
		super(message);
		this.httpStatus = httpStatus;
		this.ErrorCode = ErrorCode;
	}
	
	
	public CustomException(HttpStatus httpStatus ,int ErrorCode, String message,String errorMessage) {
		super(message);
		this.httpStatus = httpStatus;
		this.ErrorCode = ErrorCode;
		this.errorMessage = errorMessage;
	}

	public CustomException(HttpStatus httpStatus, String message) {
		super(message);
		this.httpStatus = httpStatus;
	}
	
	public CustomException(String code, String message) {
		super(message);
	}

	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(int code, String message) {
		super(message);
	}

}

