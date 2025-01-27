package com.functionalInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//class FunctionImpl implements Function<String, Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		return t.length();
//	}
//	
//}

public class FunctionDemo {

	public static void main(String[] args) {
//		Function function=new FunctionImpl();
//		System.out.println(function.apply("Shyam"));
		
		
		//Function Interface
		Function<String, Integer> fun=(String s)->{
			 return s.length();
		};
		System.out.println(fun.apply("Shyam"));
		
		//Consumer Intferace It has accept method  it does not return any value
		
		Consumer<String>con=(String s)->{
			System.out.println(s.length());
		};
		con.accept("Hello World");
		
		//supplier interface
		
		Supplier<LocalDateTime>sup=()->{
			return LocalDateTime.now();
		};
		System.out.println(sup.get());
		
		//Converting List to set usign FI with Lambda function
		List<String>fruits=new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Guawa");
		fruits.add("Banana");
		fruits.forEach(con);
		
		fruits.forEach(fr->System.out.println(fr));
		
		Function<List<String>,Set<String>> setFunction=(fruitList)->new HashSet(fruitList);
		System.out.println(setFunction.apply(fruits));

	}

}
