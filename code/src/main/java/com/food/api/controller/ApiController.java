/**
 * 
 */
package com.food.api.controller;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.api.dto.Request;
import com.food.api.services.ReciepeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@Service
@Configurable
@RestController
@RequestMapping("/api/v1")
@Api(value = "URL Shortner APIs", description = "URL Shortner APIs", tags = "URL Shortner APIs")
@ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request"),
		@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
		@ApiResponse(code = 500, message = "Server Error") })
public class ApiController {

	 @Autowired
	 private ReciepeService reciepeService;

	private static final Logger _logger = LogManager.getLogger(ApiController.class);
	
	 public ApiController(ReciepeService reciepeService) {
	        this.reciepeService=reciepeService;
	  }

	    @ApiOperation(value = "Convert new url", notes = "Converts long url to short url")
	    @PostMapping("create-short")
	    public String convertToShortUrl(@RequestBody Request request) {
	       // return ReciepeService.get(request);
		   return null;
	    }

	    @ApiOperation(value = "Redirect", notes = "Finds original url from short url and redirects")
	    @GetMapping(value = "{shortUrl}")
	    @Cacheable(value = "urls", key = "#shortUrl", sync = true)
	    public ResponseEntity<Void> getAndRedirect(@PathVariable String shortUrl) {
	        var url = reciepeService.getOriginalUrl(shortUrl);
	        return ResponseEntity.status(HttpStatus.FOUND)
	                .location(URI.create(url))
	                .build();
	    }

}