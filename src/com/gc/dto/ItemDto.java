package com.gc.dto;

import java.io.Serializable;

public class ItemDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private int itemId;
	private String itemName;
	private String description;
	private double quantity;
	private double price;
	
	public ItemDto() {
		this.itemId = 0;
		this.itemName = "";
		this.description = "";
		this.quantity = 0;
		this.price = 0;
	}
	
	public ItemDto(String itemName, String description, double quantity, double price) {
		this.itemId = 0;
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
}
