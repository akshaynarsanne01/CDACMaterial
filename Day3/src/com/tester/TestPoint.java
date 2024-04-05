package com.tester;

import java.util.Scanner;
import com.developers.geometry.Point2D;

class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the co-ordinates of first number:");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		Point2D p1 = new Point2D(d1, d2);
		String s1 = p1.show();
		System.out.println(s1);

		System.out.print("Enter the co-ordinates of second number:");
		int d3 = sc.nextInt();
		int d4 = sc.nextInt();
		Point2D p2 = new Point2D(d3, d4);
		String s2 = p2.show();
		System.out.println(s2);

		boolean check = p1.isSame(p2);
		if (check == true)
			System.out.println("Both the points have same co-ordinates");
		else
			System.out.println("Both the points have diffrent co-ordinates");
		sc.close();
	}

}
