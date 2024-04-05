package com.tester;

import com.developers.geometry.Point2D;
import java.util.Scanner;

class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many points do you want to enter?");
		int n = sc.nextInt();
		Point2D[] myarray = new Point2D[n];
		int choice;

		do {

			System.out.println("Enter your choice:");
			System.out.println("1] Enter the points");
			System.out.println("2] Display");
			System.out.println("3] Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter the array index");
				int index = sc.nextInt();
				if (index < 0 || index >= myarray.length)
					System.out.println("Entered the wrong index");
				else {
					if (myarray[index] == null) {
						System.out.println("Enter the co-ordinates");
						int x = sc.nextInt();
						int y = sc.nextInt();
						myarray[index] = new Point2D(x, y);
					} else {
						System.out.println("Points are already inserted");
					}

				}
				break;
			case 2:
				for (Point2D itr : myarray) {
					System.out.println(itr.show());
				}
				break;

			}

		} while (choice != 3);
      sc.close();  
	}
	
}
