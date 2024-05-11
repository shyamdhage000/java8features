package com.optional;

import java.util.*;

public class Learning {
	public static void main(String[] args) {
		String st = "Shyam";
		Optional<String> opt = Optional.ofNullable(st);
		if (opt.isPresent()) {
			System.out.println(st.length());
		} else {
			System.out.println("Value is not present");
		}
		
		
	
	}
}
