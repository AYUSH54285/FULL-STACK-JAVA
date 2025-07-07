package com.pack3;
public class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		System.out.println("The area of circle is : "+(double)(3.14*radius*radius));
	}
}
