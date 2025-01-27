package com.stream.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		//create stream
		Stream<String>stream=Stream.of("a","b","c");
		stream.forEach(c->System.out.println(c));
		
		//create stream from sources
		Collection<String>collection=Arrays.asList("java","c++","c");
		List<String>list=collection.stream()
				.filter(s->s.startsWith("c"))
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(list);
		collection.forEach(System.out::println);
		
		//creating stream of arrays
		String[] arrays= {"Shyam","Shubham","Sandip","Ram","Panu","Sonu"};
		Stream<String>arr=Arrays.stream(arrays);
		//List<String>slist=arr.toList();
		arr.forEach(s->System.out.println(s));
		
		
		
	}

}
