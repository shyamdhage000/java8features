package com.method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
	void print(String msg);
}

public class MethodReference {
	
	public void display(String msg) {
		System.out.println(msg.toUpperCase());
	}
	
	private static int addition(Integer a, Integer b) {
		return (a+b);
	}

	public static void main(String[] args) {
		
		//1.Method reference to Static method
		//Using lambda expression
		Function<Integer, Double>fun=(input)->Math.sqrt(input);
		System.out.println(fun.apply(16));

		//Usign method refereence
		Function<Integer,Double>fun1=Math::sqrt;
		System.out.println(fun1.apply(25));
		
		//lambda Expression
		BiFunction<Integer,Integer, Integer>biFunc=(a,b)->MethodReference.addition(a,b);
		System.out.println(biFunc.apply(5,5));
		
		//Using method reference
		BiFunction<Integer,Integer, Integer>biFunction1=MethodReference::addition;
		System.out.println(biFunction1.apply(10,10));
		
		
		//2.Methd reference to an inatance method of an objet
		MethodReference methodReference=new MethodReference();
		
		//using lambda
		Printable printable=(msg)->methodReference.display(msg);
		printable.print("Hello World");
		
		//using Method Reference
		Printable printable2=methodReference::display;
		printable2.print("shyam dhage");
		
		
		//3.Reference to the instance method of an arbitrary object
		//using lambda
		Function<String, String>function2=(String str)->str.toLowerCase();
		System.out.println(function2.apply("SHYAM DHAGE"));
		
		Function<String, String>function3=String::toLowerCase;
		System.out.println(function3.apply("HELLO WORLD"));
		
		//using lambda
		String arr[]= {"A","B","c","d","e","F"};
		Arrays.sort(arr,(s1,s2)->s1.compareToIgnoreCase(s2));
		
		
		//using method reference
		Arrays.sort(arr, String::compareToIgnoreCase);
		
		
		//4. reference to constructor
		List<String>fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Guawa");
		fruits.add("Mango");
		fruits.add("Banana");
		
		//using lambda
		Function<List<String>,Set<String>> function5=(fruitsList)-> new HashSet<>(fruitsList);
		System.out.println(function5.apply(fruits));
		
		//using method reference
		Function<List<String>,Set<String>> function6= HashSet::new ;
		System.out.println(function6.apply(fruits));
	}

}
