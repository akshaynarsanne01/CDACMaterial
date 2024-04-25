package com.utils;

import java.util.List;
import java.util.Scanner;

import com.pen.Pen;
public class penutils {
	public static boolean addPen(List<Pen>mylist,Scanner sc) {
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
		Pen toAdd = new Pen(brand,color,inkColor,material,stock);
		if(validatePen(mylist,toAdd)) {			
			return mylist.add(toAdd);
		}else {
			return false;
		}
	}
	public static boolean updateStock(List<Pen>mylist,Scanner sc) {
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
		Pen toAdd = new Pen(brand,color,inkColor,material,stock);
		boolean flag = false;
		for(Pen p:mylist) {
			if(p.equals(toAdd)) {
				p.setStock(toAdd.getStock());
				flag = true;
			}
		}
		return flag;
	}
	public static void displayList(List<Pen> myList) {
		for(Pen p:myList) {
			System.out.println(p);
		}
	}
	public static boolean validatePen(List<Pen>mylist,Pen obj) {
		for(Pen p:mylist) {
			if(p.equals(obj)) {
				System.out.println("Product Already in list please update the quantity!!");
				return false;
			}
		}
		return true;
	}
}
