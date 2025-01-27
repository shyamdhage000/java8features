package com.stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int age;
	private long salary;
	public Employee(int id, String name, int age, long salary) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

public class EmployeeForSorting {
	
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Shyam",25,100000));
		emp.add(new Employee(2,"Shubham",26,50000));
		emp.add(new Employee(3,"Yogesh",18,40000));
		emp.add(new Employee(4,"Sandip",20,35000));
		
		//Sorting of employee  based on salary using Comparator Ananimous class without using lambda function
		List<Employee>empl=emp.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (int) (o1.getSalary()- o2.getSalary());
			}
			
		}).collect(Collectors.toList());
		
		//Sorting of employee in ascending order  based on salary using    lambda function
				List<Employee>empLambda=emp.stream()
				.sorted((e1,e2)-> (int) (e1.getSalary()- e2.getSalary())).collect(Collectors.toList());
				System.out.println(empLambda);
				
	   //Sorting of employee in descending  order  based on salary using    lambda function
				List<Employee>emp1=emp.stream()
				.sorted((e1,e2)-> (int) (e2.getSalary()- e1.getSalary())).collect(Collectors.toList());
		System.out.println(emp1);
		
		
		//Sorting of employee in ascending order  based on salary using    method refrence 
				List<Employee>emp2=emp.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
			
		//Sorting of employee in descending  order  based on salary using    method refrence 
				List<Employee>emp3=emp.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
				System.out.println(emp3);
		
				
		//sorting employyes  in ascending order based on age using lambda function
			List<Employee>emp4=emp.stream()
					.sorted((e1,e2)->(int) (e1.getAge()-e2.getAge())).collect(Collectors.toList());
			System.out.println("sorted on age"+ emp4);
			
		//sorting employee in desc order using method reference
			List<Employee>emp5=emp.stream()
					.sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
			System.out.println("sorted on descend age method"+ emp5);
			
		
		//sorting emp based on name using lambda fnc
		List<Employee>emp6=emp.stream()
				.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(emp6);
	
		
		//get employee whose age is above 20
		List<Employee>employee=emp.stream().filter(e->e.getAge()>20).collect(Collectors.toList());
		//System.out.println(emp1);
		
	}
	
	
}
