package com.food.api.dto;

import java.util.List;

public class Order {
	
	public Order(String id, String userId, Long restaurantId, List<String> recipeIds) {
		super();
		this.id = id;
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.recipeIds = recipeIds;
	}

	protected String id;
	protected String userId;
	protected Long restaurantId;
	protected List<String> recipeIds;
	protected String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public List<String> getRecipeIds() {
		return recipeIds;
	}
	public void setRecipeIds(List<String> recipeIds) {
		this.recipeIds = recipeIds;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
