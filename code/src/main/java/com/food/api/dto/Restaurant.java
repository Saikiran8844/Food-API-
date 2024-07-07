package com.food.api.dto;

public class Restaurant {

	protected Long id;
	protected String restaurantId;
	protected String name;
	protected Restaurant.Address address;
	protected String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restaurant.Address getAddress() {
		return address;
	}

	public void setAddress(Restaurant.Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public class Address {

		public Address(String addressLine1, String addressLine2, String city, String state, String pinCode) {
			super();
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.city = city;
			State = state;
			this.pinCode = pinCode;
		}

		protected String addressLine1;
		protected String addressLine2;
		protected String city;
		protected String State;
		protected String pinCode;

		public String getAddressLine1() {
			return addressLine1;
		}

		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		public String getAddressLine2() {
			return addressLine2;
		}

		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getPinCode() {
			return pinCode;
		}

		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}

	}
}
