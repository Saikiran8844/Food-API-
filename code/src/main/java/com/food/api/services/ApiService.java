package com.food.api.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.food.api.dto.viewModel.Request;

@Service
public class ApiService {

	public ResponseEntity<Object> getRecipeDetails(Request recipe) {
		return new ResponseEntity<Object>("200", HttpStatus.OK);
	}

   
}
