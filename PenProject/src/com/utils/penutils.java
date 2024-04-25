/*
 * 
1. 
A company StyleWithPen sells stylish Pens online. 
Company needs an interface for site admin to manage stocks.

Write a console-based menu driven java program for site ADMIN to perform following operations: 

1. Add new Pen
i/p : Brand ,Color,InkColor,Material ,Stock,Stock Listing Date (Stock Update Date  will be same as listing date while adding a pen) , price .
You can skip the discount while adding a pen : default value 0.0

2. Update stock of aPen
i/p : brand | material | color | Ink color and new quantity

3.Set discount of 20% for all the pens which are not at all sold in last 3 months
In this you can set the discount value for all such pens OR apply discount n update price as well

4. Remove Pens which are never sold once listed in 9 months

You can define a class Pen with the following fields – 
a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR)
j.	Discounts (in percentage)

Note: You can use java collection to store items in memory. 

 */
package com.utils;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pen.Pen;
import com.pen.PenException;

public class penutils {
	public static void addPen(List<Pen> mylist, Scanner sc) {
		System.out.println("Enter brand");
		String brand = sc.next();
		System.out.println("Enter color");
		String color = sc.next();
		System.out.println("Enter inkcolor");
		String inkColor = sc.next();
		System.out.println("Enter material");
		String material = sc.next();
		System.out.println("Enter stock");
		int stock = sc.nextInt();
		System.out.println("Enter stock added date");
		String listingDate = sc.next();
		Pen toAdd = new Pen(brand, color, inkColor, material, stock, LocalDate.parse(listingDate));
		try {
			if (validatePen(mylist, toAdd)) {
				mylist.add(toAdd);
				System.out.println("Product Added.");
			}
		} catch (PenException e) {
			System.out.println(e);
		}
	}

	public static boolean updateStock(List<Pen> mylist, Scanner sc) {
		System.out.println("Enter the details of Product to update stock");
		System.out.println("Enter brand");
		String brand = sc.next();
		System.out.println("Enter color");
		String color = sc.next();
		System.out.println("Enter inkcolor");
		String inkColor = sc.next();
		System.out.println("Enter material");
		String material = sc.next();
		System.out.println("Enter stock");
		int stock = sc.nextInt();
		Pen toAdd = new Pen(brand, color, inkColor, material, stock, null);
		boolean flag = false;
		for (Pen p : mylist) {
			if (p.equals(toAdd)) {
				p.setStock(toAdd.getStock());
				System.out.println("Enter the stock update Date");
				String updatedDate = sc.next();
				p.setStockUpdateDate(LocalDate.parse(updatedDate));
				flag = true;
			}
		}
		return flag;
	}

	public static boolean sellProduct(List<Pen> mylist, int id, Scanner sc) {
		for (Pen p : mylist) {
			if (p.getId() == id) {
				System.out.println("Enter the quantity you want to sell");
				int sellQuantity = sc.nextInt();
				int quantity = p.getStock() - sellQuantity;
				if (quantity < p.getStock()) {
					System.out.println("Products of this much quantity are not available");
					return false;
				} else {
					System.out.println("Enter the sold date");
					String soldDate = sc.next();
					p.setLastSoldDate(LocalDate.parse(soldDate));
					p.setStock(quantity);
					return true;
				}
			}
		}
		return false;
	}

	public static void giveDiscount(List<Pen> mylist, Scanner sc) {
		for (Pen p : mylist) {
			if (p.getLastSoldDate() != null
					&& !(ChronoUnit.MONTHS.between(LocalDate.now(), p.getLastSoldDate()) <= 3)) {
				p.setSold(true);
				p.setDiscount(20);
			}
		}
	}

	public static void removeUnSoldProduct(List<Pen> mylist, Scanner sc) {
		Iterator<Pen> iterator = mylist.iterator();
		while (iterator.hasNext()) {
			Pen p = iterator.next();
			if (p.getLastSoldDate() == null || ChronoUnit.MONTHS.between(LocalDate.now(), p.getLastSoldDate()) > 9) {
				iterator.remove();
			}
		}
	}

	public static boolean displayList(List<Pen> myList) {
		if (myList.isEmpty()) {
			return false;
		}
		for (Pen p : myList) {
			System.out.println(p);
		}
		return true;
	}

	public static boolean validatePen(List<Pen> mylist, Pen obj) throws PenException {
		for (Pen p : mylist) {
			if (p.equals(obj)) {
				throw new PenException("Product Already in list please update the quantity!!");
			}
		}
		return true;
	}
}
