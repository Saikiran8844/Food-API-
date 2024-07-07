package com.food.api.dto;

import java.util.List;
import javax.persistence.*;

@Entity
public class Recipe {

	public Recipe(String recipeId, String name, String description, String restaurantId) {
		super();
		this.recipeId = recipeId;
		this.name = name;
		this.description = description;
		this.restaurantId = restaurantId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String recipeId;

	private String name;

	private String description;

	private String restaurantId;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "recipe_id")
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

}
