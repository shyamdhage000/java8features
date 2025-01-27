package com.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		
		//old approach
		BiPredicate<String, String>biPredicate=new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
			
		};
		System.out.println(biPredicate.test("Shyam","Ram"));
		System.out.println(biPredicate.test("Shyam","Shyam"));
		
		
		//new approach using lambda expression
		BiPredicate<String, String>biPredicate2=(s1,s2)->s1.equals(s2);
		System.out.println(biPredicate.test("Ram","Ram"));
		
		
		BiPredicate<Integer,Integer>biPredicate3=(n1,n2)->n1>n2;
		BiPredicate<Integer,Integer>biPredicate4=(n1,n2)->n1==n2;
		System.out.println(biPredicate3.test(5,6));
		System.out.println(biPredicate4.test(5,5));
		
		//we calso combine multiple conditions using and & OR
		boolean res=biPredicate3.and(biPredicate4).test(6,7);
		boolean res1=biPredicate3.or(biPredicate4).test(23, 12);
		System.out.println(res);
		System.out.println(res1);
		
		
	}
}
