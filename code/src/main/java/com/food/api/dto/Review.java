package com.food.api.dto;

public class Review {

	public Review() {
	}

	public Review(String userId, String recipeId, String comment, Integer rating) {
		super();
		this.userId = userId;
		this.recipeId = recipeId;
		this.comment = comment;
		this.rating = rating;
	}
	
	protected Long id;
	protected String userId;
	protected String recipeId;
	protected String comment;
	protected Integer rating;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
