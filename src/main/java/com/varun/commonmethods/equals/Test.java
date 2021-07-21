package com.varun.commonmethods.equals;

 class Point {
	private final int x;
	private final int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Point)) {
			return false;
		}
		Point p = (Point) obj;
		return p.x == x && p.y == y;
	}
	
}

class ColorPoint extends Point{
	private final String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		
		// If o is a normal Point, do a color-blind comparison
		//Broken violates transitivity
		if (!(obj instanceof ColorPoint))
			return obj.equals(this);
		
		return super.equals(obj) && ((ColorPoint) obj).color.equals(color);
	}
	
}

public class Test{
	public static void main(String[] args) {
		ColorPoint p1 = new ColorPoint(1, 2, "Red");
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, "Blue");
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
	}
}
