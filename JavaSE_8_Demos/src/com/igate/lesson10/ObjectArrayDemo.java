package com.igate.lesson10;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		//array defined to hold point-coordinates of rectangle
		Point[] rectPoints = new Point[4];
		
		//store each coordinate as one point
		rectPoints[0] = new Point(100,100);
		rectPoints[1] = new Point(100,250);
		rectPoints[2] = new Point(250,100);
		rectPoints[3] = new Point(250,250);
		
		//iterate array of objects
		for(Point point:rectPoints) {
			System.out.println(point);
		}
	}
}
