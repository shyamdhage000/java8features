package com.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=(t,u)->(t+u);
		BiFunction<Integer,Integer,Integer> sub=(t,u)->(t-u);
		BiFunction<Integer,Integer,Integer> mul=(t,u)->(t*u);
		BiFunction<Integer,Integer,Integer> div=(t,u)->(t/u);
		
		System.out.println(add.apply(10,20));
		System.out.println(sub.apply(20, 30));
		System.out.println(mul.apply(20, 30));
		System.out.println(div.apply(20, 30));
	}

}
