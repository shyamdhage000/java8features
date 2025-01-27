package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private double salary;
	private int yOfJoining;
	
	public Employee(int id, String name, int age, String gender, String dept, double salary, int yOfJoining) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.salary = salary;
		this.yOfJoining = yOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getyOfJoining() {
		return yOfJoining;
	}

	public void setyOfJoining(int yOfJoining) {
		this.yOfJoining = yOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", salary=" + salary + ", yOfJoining=" + yOfJoining + "]";
	}
	
}


public class EmployeeExample {
	public static void main(String[] args) {
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(1,"Shyam",25,"Male","IT",40000.63, 2023));
		employee.add(new Employee(2,"Priya",22,"Female","CS",35000.53, 2021));
		employee.add(new Employee(3,"Omkar",20,"Male","ENTC",20000.53, 2018));
		employee.add(new Employee(4,"Rani",19,"Female","IT",25000.25, 2015));
		
		//print male employee count
		long maleCount=employee.stream().filter(e->e.getGender().equals("Male")).count();
		System.out.println(maleCount);
		
		//print female employee count
		long femaleCount=employee.stream().filter(e->e.getGender().equals("Female")).count();
		System.out.println(femaleCount);
		
		//another way to get male and female count
		Map<String, Long>genderC=employee.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderC);
		
		
		//print distinct  dept names
		employee.stream().map(e->e.getDept()).distinct().forEach(d->System.out.println(d));
		
		//check if all the employees are above 18 allMatch example
		boolean res=employee.stream().allMatch(e->e.getAge()>18);
		if(res) {
			System.out.println("All employees are eligible for voting");
		}
		else {
			System.out.println("Some employees are not eligible for voting");
		}
		
		//check if any of  the employees are below 18 anyMatch example
				boolean res1=employee.stream().anyMatch(e->e.getAge()<18);
				if(res) {
					System.out.println("All employees are eligible for voting");
				}
				else {
					System.out.println("Some employees are not eligible for voting");
				}
		
	}
	

}
