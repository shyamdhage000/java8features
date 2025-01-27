package com.lambda;

interface Shape{
	void draw();
}

public class LambdaExample {
	public static void main(String[]  args) {
		String str="hello world";
		
		Shape rectangle=()->{
			System.out.println("Rectangle class draw() method");
		};
		rectangle.draw();
		
		Shape circle=()->{
			System.out.println("Circle class draw() method");
		};
		circle.draw();
		
		Shape square=()->{
			System.out.println("Square class draw() method");
		};
		square.draw();
		
		
		//passing lambda expression as parameter to method print defined below
		print(rectangle);
		
		//second way
		print(()->System.out.println("Square class draw() method"));
	}
	private static void print(Shape shape) {
		shape.draw();
	}
	
}