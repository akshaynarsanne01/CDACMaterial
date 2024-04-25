package com.pen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.utils.penutils.addPen;
import static com.utils.penutils.updateStock;
import static com.utils.penutils.displayList;
public class TesterPen {
	public static void main(String[] args) {
		List<Pen> mylist = new ArrayList<>();
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice");
			System.out.println("1] add pen");
			System.out.println("2] update stock");
			System.out.println("3] setDiscount");
			System.out.println("4] Remove Pen");
			System.out.println("5] Display List");
			System.out.println("6] Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				boolean flag = addPen(mylist,sc);
				if(flag) {
					System.out.println("Product Added to the list");
				}else {
					System.out.println("Error adding to the list");
				}
				break;
			case 2:
				boolean isUpdated = updateStock(mylist,sc);
				if(isUpdated) {
					System.out.println("Product Updated to the list");
				}else {
					System.out.println("Error Updating to the list");
				}
				break;
			case 5:
				displayList(mylist);
				break;
			default:
				break;
			}
		}while(choice!=6);
	}

}
