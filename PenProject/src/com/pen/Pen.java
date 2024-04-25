package com.pen;

import java.time.LocalDate;

public class Pen {
	private String brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private double discount;
	private boolean isSold;
	public double getDiscount() {
		return discount;
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

	private LocalDate stockListingDate;

	public Pen() {
		brand = "";
		color = "";
		inkColor = " ";
		material = "";
		stock = 0;
		discount = 0.0;
		stockListingDate = LocalDate.now();
	}

	public Pen(String brand, String color, String inkColor, String material, int stock) {
		super();
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockListingDate = LocalDate.now();
		this.discount = 0;
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
	public void updateStock(String brand,String color,String inkColor,String material,int stock){
		if(this.getBrand().equals(brand) 
				&&this.getColor().equals(color)
				&&this.getInkColor().equals(inkColor)
				&& this.getMaterial().equals(material)) {
			this.setStock(stock);
			System.out.println("Stock Updated !!!");
		}
	}
	@Override
	public String toString() {
		return "brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material=" + material + ", stock="
				+ stock + ", discount=" + discount + ", stockListingDate=" + stockListingDate;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pen) {
			Pen myObject = (Pen)obj;
			if(this.getBrand().equals(myObject.getBrand())
					&& this.getMaterial().equals(myObject.getMaterial())
					&& this.getColor().equals(myObject.getColor())
					&& this.getInkColor().equals(myObject.getInkColor())) {
				return true;
			}
		}
		return false;
	}
	
}
