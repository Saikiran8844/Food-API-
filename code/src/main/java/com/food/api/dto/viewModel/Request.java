package com.food.api.dto.viewModel;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "recipeId", "name", "description", "restauranId", "ingridents" })
public class Request {

	public Request(String recipeId, String name, String description, String restaurantId) {
		super();
		this.recipeId = recipeId;
		this.name = name;
		this.description = description;
		this.restaurantId = restaurantId;
	}

	@JsonProperty
	private String recipeId;
	@JsonProperty
	private String name;
	@JsonProperty
	private String description;
	@JsonProperty
	private String restaurantId;
	@JsonProperty
	protected List<Ingridents> ingridents;

	public String getReciepe() {
		return recipeId;
	}

	public void setReciepe(String recipeId) {
		this.recipeId = recipeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public List<Ingridents> getIngridents() {
		return ingridents;
	}

	public void setIngridents(List<Ingridents> ingridents) {
		this.ingridents = ingridents;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({ "name", "value" })
	public class Ingridents {

		public Ingridents(String name, String value) {
			super();
			this.name = name;
			this.value = value;
		}

		@JsonProperty
		protected String name;
		@JsonProperty
		protected String value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}
}
