package com.pen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.utils.penutils.*;
public class TesterPen {
	public static void main(String[] args) {
		List<Pen> mylist = new ArrayList<>();
		int choice = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice");
			System.out.println("1] add pen");
			System.out.println("2] update stock");
			System.out.println("3] sell Product");
			System.out.println("4] setDiscount");
			System.out.println("5] Remove Pen");
			System.out.println("6] Display List");
			System.out.println("7] Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addPen(mylist,sc);
				break;
			case 2:
				boolean isUpdated = updateStock(mylist,sc);
				if(isUpdated) {
					System.out.println("Product Updated to the list");
				}else {
					System.out.println("Error Updating to the list");
				}
				break;
			case 3:
				System.out.println("Enter id you want to sell ");
				int id = sc.nextInt();
				
				boolean soldFlag = sellProduct(mylist,id,sc);
				if(soldFlag) {
					System.out.println("Product sold");
				}else {
					System.out.println("Unable to sell the product");
				}
				break;
			case 4:
				giveDiscount(mylist,sc);
				break;
			case 5:
				removeUnSoldProduct(mylist,sc);
				break;
			case 6:
				boolean displayFlag = displayList(mylist);
				if(!displayFlag) {
					System.out.println("Empty List");
				}
				break;
			default:
				break;
			}
		}while(choice!=7);
	}

} 
