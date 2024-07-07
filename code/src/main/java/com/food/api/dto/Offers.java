package com.food.api.dto;

import java.util.List;

public class Offers {

	public Offers(String id, String description, Double discount, List<String> restaurantIds) {
		super();
		this.id = id;
		this.description = description;
		this.discount = discount;
		this.restaurantIds = restaurantIds;
	}

	protected String id;
	protected String description;
	protected Double discount;
	protected List<String> restaurantIds;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public List<String> getRestaurantIds() {
		return restaurantIds;
	}

	public void setRestaurantIds(List<String> restaurantIds) {
		this.restaurantIds = restaurantIds;
	}

}
