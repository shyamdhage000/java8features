package com.defaultStatic;

interface Vehicle{
	String getBrand();
	String speedUp();
	
	String slowDown();
	
	default String turnAlramOn() {
		return "Truning vehicle on";
	}
	
	default String turnAlramOff() {
		return "Truning vehicle OFF";
	}
	
	static String getCompany() {
		return "BMW";
	}
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		
		return "BMW";
	}

	@Override
	public String speedUp() {
		
		return "Car is speedup";
	}

	@Override
	public String slowDown() {
		
		return "Car is slowing down";
	}
	
}

public class DefaultDemo {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Car();
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.turnAlramOn());
		System.out.println(vehicle.speedUp());
		System.out.println(vehicle.slowDown());
		System.out.println(vehicle.turnAlramOff());
		System.out.println(Vehicle.getCompany());
	}

}
