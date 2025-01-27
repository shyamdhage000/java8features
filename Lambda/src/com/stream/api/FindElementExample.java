package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindElementExample {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
		Optional<Integer>element=list.stream().findFirst();
		if(element.isPresent()) {
			System.out.println(element.get());
		}
		else {
			System.out.println("Element not present");
		}
	Optional<Integer>ele1=	list.stream().findAny();
	if(ele1.isPresent()) {
		System.out.println(ele1.get());
	}
	else {
		System.out.println("Element not present");
	}
	
	
	Supplier<Stream<Integer>> stream = () -> Stream.of(1,2,3,4,5,6,7,8,9);
	//System.out.println(stream.count()); //count
	
	int ele=stream.get().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(ele);
	
	int maxEle=stream.get().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(maxEle);
	
	
	

		
	}
	
	
}
