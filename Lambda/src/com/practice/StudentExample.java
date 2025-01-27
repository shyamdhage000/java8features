package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private String name;
	private int age;
	private long mobileNumber;
	
	public Student(String name, int age, long mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
public class StudentExample {
	public static void main(String[] args) {
		
		List<Student>student=new ArrayList<Student>();
		student.add(new Student("Shyam",25,9130930262L));
		student.add(new Student("Ram",23,8857935548L));
		student.add(new Student("Yogesh",15,8745126584L));
		student.add(new Student("Abhi",17,7845963210L));
		student.add(new Student("Shubham",25,9130930262L));
		
		
		//get student whose name is yogesh
		Optional<Student>stud=student.stream()
				.filter(stud1->stud1.getName().equals("Yogesh"))
				.findFirst();
		System.out.println(stud.isPresent()? stud.get().getName(): "Not present");
		
		//studentts above 18
		List<Student>stud1=(List<Student>) student.stream()
				.filter(stud2->stud2.getAge()==43)
				.collect(Collectors.toList());
		stud1.forEach(stud3->System.out.println("43 student"+ stud3));
		System.out.println("43 student"+stud1);
		
		
		
		//get only  names of all the students
		List<String>names=student.stream()
				.map(stud22->stud22.getName())
				.collect(Collectors.toList());
		System.out.println(names);
		
		//change the case of students
		names.stream()
		//.map(name->name.toUpperCase())
		.map(String::toUpperCase)  //both works same way
		.forEach(name1->System.out.println(name1));
	
		//sorting the names of student 
		names.stream().sorted().forEach(System.out::println);
		
		//sorting students as per name in ascending order
		List<Student>studSorted=stud1.stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
		
		System.out.println("Sorted students "+ studSorted);
		
		
		//sorting students as per name in descending order
				List<Student>studDescSorted=stud1.stream()
				.sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
				System.out.println("Sorted students "+ studDescSorted);
		
		long c=student.stream()
				.filter(s->s.getName().startsWith("S"))
				.count();
		System.out.println("Count of students starting with S is:"+c);
			
		
	}
	
	

}
