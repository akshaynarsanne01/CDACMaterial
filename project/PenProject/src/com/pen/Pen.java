package com.pen;

import java.io.Serializable;
import java.time.LocalDate;

public class Pen implements Serializable {
	private int id;
	private String brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private double discount;
	private boolean isSold;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private LocalDate lastSoldDate;
	private static int counter = 0;

	public Pen() {
		this.id = counter++;
		brand = "";
		color = "";
		inkColor = " ";
		material = "";
		stock = 0;
		discount = 0.0;
		stockUpdateDate = null;
		stockListingDate = LocalDate.now();
		lastSoldDate = null;
	}

	public Pen(String brand, String color, String inkColor, String material, int stock, LocalDate ListingDate) {
		super();
		this.id = counter++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = null;
		this.stockListingDate = ListingDate;
		this.discount = 0;
		this.lastSoldDate = null;
	}

	public void updateStock(String brand, String color, String inkColor, String material, int stock) {
		if (this.getBrand().equals(brand) && this.getColor().equals(color) && this.getInkColor().equals(inkColor)
				&& this.getMaterial().equals(material)) {
			this.setStock(stock);
			System.out.println("Stock Updated !!!");
		}
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material=" + material + ", stock="
				+ stock + ", discount=" + discount + ", stockListingDate=" + stockListingDate + "StockUpdatedDate"
				+ stockUpdateDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pen) {
			Pen myObject = (Pen) obj;
			if (this.getBrand().equals(myObject.getBrand()) && this.getMaterial().equals(myObject.getMaterial())
					&& this.getColor().equals(myObject.getColor())
					&& this.getInkColor().equals(myObject.getInkColor())) {
				return true;
			}
		}
		return false;
	}

	// Getters and setters
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public double getDiscount() {
		return discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public LocalDate getLastSoldDate() {
		return lastSoldDate;
	}

	public void setLastSoldDate(LocalDate lastSoldDate) {
		this.lastSoldDate = lastSoldDate;
	}

}
