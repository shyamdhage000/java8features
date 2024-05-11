package com.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	void print(String str);
	
	default void display() {
		System.out.println("default display method");
	}
	
	static void dispalyStatic() {
		System.out.println("Static display method");
	}

}
