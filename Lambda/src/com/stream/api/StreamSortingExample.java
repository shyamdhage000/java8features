package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSortingExample {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");
		list.add("Apple");
		list.add("Guawa");
		
		//************** Sorting in Ascenting order*//
		
		// we can directly print using forEach
		list.stream().sorted(Comparator.naturalOrder()).forEach(s->System.out.println(s)); 
		
		// we can  store into list using collector 
		List<String>fruits=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()); 
		
		//we can perform sorting using lambda as well as below
		List<String>sortedFruits=fruits.stream().sorted((f1, f2)->f1.compareTo(f2)).collect(Collectors.toList());
		
		//another way to sorting 
		List<String>sFruit=fruits.stream().sorted().collect(Collectors.toList());
		
		System.out.println(fruits);
		System.out.println(sortedFruits);
		System.out.println(sFruit);
		
		
		//************** Sorting in escending order*//
		System.out.println("*****Descending order *******");
		// we can  store into list using collector 
		List<String>descFruit=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
		System.out.println(descFruit);
		
		//we can perform sorting using lambda as well as below
		List<String>descSortedFruits=fruits.stream().sorted((f1, f2)->f2.compareTo(f1)).collect(Collectors.toList());
		System.out.println(descSortedFruits);
	
		//sorting
	list.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
	
	///sort in ascending
	List<Integer>arr=Arrays.asList(4,2,1,5,7,2,4);
	arr.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach((e1)->System.out.println(e1));
	}
}
