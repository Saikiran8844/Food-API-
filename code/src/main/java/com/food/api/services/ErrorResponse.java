package com.food.api.services;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vaigupta
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "errorResponse")
public class ErrorResponse {
	@XmlElement(name = "errorCode")
	private int errorCode;

	@XmlElement(name = "description")
	private String description;

	@XmlElement(name = "developerMessage")
	private String developerMessage;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

}

