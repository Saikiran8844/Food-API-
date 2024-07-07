/**
 * 
 */
package com.food.api.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.food.api.dto.Recipe;
import com.food.api.dto.viewModel.Request;
import com.food.api.services.ApiService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Service
@Configurable
@RestController
@Api(value = "Food API's", description = "APIs for food recipes", tags = "Food APIs")
@ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request"),
		@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
		@ApiResponse(code = 500, message = "Server Error") })
public class ApiController {
	
	@Autowired
	private ApiService apiService;


	protected static final Logger _logger = LogManager.getLogger(ApiController.class);
	

	    @ApiOperation(value = "Get Recipe")
	    @RequestMapping(value = "/getRecipe", method=RequestMethod.POST)
		@ApiResponses(value = {
				@ApiResponse(code = 200, message = "Completed Successfully", response= String.class),
				@ApiResponse(code = 400, message = "Bad Request", response= String.class),
				@ApiResponse(code = 500, message = "Internal Error", response= String.class) })
	    public ResponseEntity<Object> getRecipe(@RequestBody(required = false) 
	    										@ApiParam(value = "getRecipe") Request request) {
	    	_logger.info("Innovked get Recipe method");
	    	return apiService.getRecipeDetails(request);
	    }

	    @ApiOperation(value = "Add / Post Requests")
		@RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
		@ApiResponses(value = {
				@ApiResponse(code = 200, message = "Completed Successfully", response= String.class),
				@ApiResponse(code = 400, message = "Bad Request", response= String.class),
				@ApiResponse(code = 500, message = "Internal Error", response= String.class) })
	    public ResponseEntity<Object> updateRecipe(@RequestBody(required = false)
												   @ApiParam(value = "Add / Post Requests request body.") Request request) {
	     
	    	return new ResponseEntity<Object>("200", HttpStatus.OK);
	    }

}