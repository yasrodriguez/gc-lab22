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
		firstName = "";
		lastName = "";
		email = "";
		phone = "";
		userPassword = "";
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

	public String getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phone = phoneNumber;
	}

	public String getPassword() {
		return userPassword;
	}

	public void setPassword(String password) {
		this.userPassword = password;
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
