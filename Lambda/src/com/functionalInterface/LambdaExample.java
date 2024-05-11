package com.functionalInterface;

interface Shape{
	void draw();
}

public class LambdaExample {
	public static void main(String[] args) {
		Shape rectangle=()->System.out.println("Rectangle draw method");
		rectangle.draw();
	}

}
