package com.pack3;
public class Rectangle extends Shape{
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void calculateArea() {
		System.out.println("The area of rectangle is : "+(double)(length*breadth));
	}
}
