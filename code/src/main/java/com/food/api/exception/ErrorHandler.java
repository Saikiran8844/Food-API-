package com.food.api.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.stream.Collectors;

import javax.xml.bind.JAXB;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.ResponseErrorHandler;

import com.food.api.services.ErrorResponse;


public class ErrorHandler implements ResponseErrorHandler {

	private ResponseErrorHandler errorHandler = new DefaultResponseErrorHandler();
	public boolean hasError(ClientHttpResponse response) throws IOException {

		return errorHandler.hasError(response);
	}

	public void handleError(ClientHttpResponse response) throws IOException {
		String responseMesage = null;
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(response.getBody()))) {
			responseMesage = buffer.lines().collect(Collectors.joining("\n"));
		}

		ErrorResponse errorResponse = JAXB.unmarshal(new StringReader(responseMesage), ErrorResponse.class);
		throw new CustomException(response.getStatusCode(), errorResponse.getErrorCode(), errorResponse.getDescription());
	}
}
