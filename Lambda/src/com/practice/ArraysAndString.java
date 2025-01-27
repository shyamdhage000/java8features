package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysAndString {
	
	public static void main(String[] args) {
		//average of list
		List<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		
		//average
		double avg=list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);
		
		
		//convert strings to uppercase
		List<String>names=Arrays.asList("Shyam","Ram","Abhi","Chomu");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		List<Integer>nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
		int evenSum=nums.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		int oddSum=nums.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
		
		System.out.println(evenSum);
		System.out.println(oddSum);
		
		//average of doubles values
		List<Double>dList=Arrays.asList(1.2,2.3,3.4,4.5,5.6);
		double a=dList.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
		System.out.println("Avg of doubles is:"+a);
		
		//count occurances of specific char in string 
		String str="Hello World";
		int count=(int) str.chars().filter(c->c=='l').count();
		System.out.println("Count of char O is: "+count);
		
		//sort string in list by theeir length in ascending order.
		List<String>names1=Arrays.asList("Shyam","Ram","Shubham","Om","omkar");
		names1.sort(Comparator.comparing(String::length));
		System.out.println(names1);
		
		// check if list of integers contains any duplicates in it.
		boolean d=list.stream().distinct().count()!=list.size();
		System.out.println(d);
		
		//print maz in list
		int mx=list.stream().max(Comparator.comparing(Integer::intValue)).get();
		System.out.println(mx);
		
		//print min in list
		int mn=list.stream().min(Comparator.comparing(Integer::intValue)).get();
		System.out.println(mn);
		
		//printing duplicates in array
				List<Integer>list1=Arrays.asList(1,2,3,4,1,2,3,4);
				list.stream().filter(e->Collections.frequency(list,e)>1).collect(Collectors.toSet()).
				forEach(s->System.out.println(s));
				
				//print uniques in array
				System.out.println("Uniques in array:");
				list1.stream().mapToInt(Integer::intValue).distinct().forEach(f->System.out.println(f));
				
				System.out.println("Sum of uniques  in array:");
				int dSum=	list1.stream().mapToInt(Integer::intValue).distinct().sum();
				System.out.println(dSum);	
			
			
				List<String>names12=Arrays.asList("ABC","CAB","BCA");
				String result12=names12.stream().reduce("",(ab,ba)->ab+ba.charAt(1));
				System.out.println(result12);
				
				//print sum of all the even numbers in a list
			int sum=	list1.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
			System.out.println("Sum of all even numbers in list is: "+sum);	
			
			//print evens from 1 to 100
			IntStream.range(1, 100).filter(e->e%2==0).forEach(n->System.out.println(n));
			
			//second largest
			List<Integer>arList=Arrays.asList(56,28,2,6,3,9,1,76);
			Optional<Integer> e=arList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
			System.out.println(e.get());
			
			String str1="Hello World";
			System.out.println("unique chars");
			str1.chars().distinct().forEach(c->System.out.println((char)c));
		
			Optional<Integer>i=arList.stream().filter(n->n%2==0).findFirst();
			if(i.isPresent()) {
			System.out.println(i.get());
			}
			else {
				System.out.println("No even present in list");
			}
			
			
			//max
			List<Integer>arr=Arrays.asList(1,2,3,4,5,6,7);
			int max=arr.stream().mapToInt(Integer::intValue).max().getAsInt();
			System.out.println(max);
			
			//second max
			int sMax=arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			System.out.println(sMax);
			
		
			
	}
	
	
	
	
	
	
	
	
	
	

}
