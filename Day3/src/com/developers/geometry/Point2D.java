package com.developers.geometry;

public class Point2D {

	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String show() {

		return ("The entered co-ordinates are " + this.x + " and " + this.y);

	}

	public boolean isSame(Point2D p2) {

		if (this.x == p2.x && this.y == p2.y)
			return true;
		else
			return false;
	}

}
