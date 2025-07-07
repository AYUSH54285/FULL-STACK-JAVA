package com.pack3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius for finiding the area of circle");
		double radius = Double.parseDouble(sc.nextLine());
		Shape circle = new Circle(radius);
		circle.calculateArea();
		
		System.out.println("enter the length for finiding the area of rectangle");
		double length = Double.parseDouble(sc.nextLine());

		System.out.println("enter the breadth for finiding the area of rectangle");
		double breadth = Double.parseDouble(sc.nextLine());

		Shape rectangle = new Rectangle(length,breadth);
		rectangle.calculateArea();
		sc.close();
	}
}
