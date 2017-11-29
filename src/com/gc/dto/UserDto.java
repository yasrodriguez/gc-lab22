package com.gc.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class UserDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String userPassword;
	private String gender;
	private String city;
	private ArrayList<String> favoriteDrinks;
	
	public UserDto() {
		userId = 0;
		firstName = "";
		lastName = "";
		email = "";
		phone = "";
		userPassword = "";
		gender = "";
		city = "";
		favoriteDrinks = new ArrayList<>();
	}
	
	public UserDto(String firstName, String lastName, String email, String phone, String userPassword,
			String gender, String city) {
		userId = 0;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.userPassword = userPassword;
		this.gender = gender;
		this.city = city;
		favoriteDrinks = new ArrayList<>();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<String> getFavoriteDrinks() {
		return favoriteDrinks;
	}

	public void setFavoriteDrinks(ArrayList<String> favoriteDrinks) {
		this.favoriteDrinks = favoriteDrinks;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
