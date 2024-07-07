package com.food.api.dto;

import javax.persistence.*;

public class Ingridents {

	public Ingridents(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	protected String name;
	protected String value;

	@ManyToOne
	@JoinColumn(name = "recipe_id")
	private Recipe recipe;

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
	
//	public String getRecipeId() {
//		return recipeId;
//	}
//
//	public void setRecipeId(String recipeId) {
//		this.recipeId = recipeId;
//	}

}