package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		
		List<String>names=new ArrayList<String>();
		names.add("Shyam");
		names.add("Ram");
		names.add("Shubham");
	
		List<String>name=names.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
	System.out.println(name);
	
	String name1=names.stream().findFirst().get();
	System.out.println(name1);
	}

}
