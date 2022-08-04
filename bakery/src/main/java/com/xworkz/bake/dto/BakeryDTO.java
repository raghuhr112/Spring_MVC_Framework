package com.xworkz.bake.dto;

public class BakeryDTO {

	private String itemName;
	private double itemPrice;
	private int itemQty;
	private String vendor;
	private boolean veg;
	private double totalPrice;
	
	

	@Override
	public String toString() {
		return "BakeryDTO [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQty=" + itemQty + ", vendor="
				+ vendor + ", veg=" + veg + ", totalPrice=" + totalPrice + "]";
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

}
