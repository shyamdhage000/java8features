package com.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		//creating optional objects by 3 different ways Of(),empty(),ofNullable()
		
		String email="shyam@gmail.com";
		
		//creating empty object using empty(()
		Optional<Object> empObject=Optional.empty();
		System.out.println(empObject);
		
		//creating using of()
		//Optional<String>emailObj=Optional.of(email);
		//System.out.println(emailObj);
		
		//crating object using ofNullable()
		Optional<String>emailOptional=Optional.ofNullable(email);
		//System.out.println(emailOptional.get());
		
		//checking value by isPresent()
		if(emailOptional.isPresent()) {
			System.out.println(emailOptional.get());
		}
		else {
			System.out.println("No value present");
		}
		
		//using orElse() method
		String defaultOptional=emailOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		//using orElseGet() method
		//This method uses supplier as parameter
		String str=emailOptional.orElseGet(()->"default@gmail.com");
		System.out.println(str);
		
		//orElseThrow
		String em=emailOptional.orElseThrow(()->new IllegalArgumentException("Email is not valid"));
		System.out.println(em);
		
		//ifPresent
		Optional<String>gender=Optional.of("MALE");
		Optional<String>emptyGender=Optional.empty();
		//gender.ifPresent((s)->System.out.println("Value is present"));
		emptyGender.ifPresent((s)->System.out.println("Value is not present"));
		
		String result=" ABC ";
		Optional<String>optionalStr=Optional.of(result);
		optionalStr.filter(res->res.contains("ABC"))
					.map(String::trim)
					.ifPresent((res)-> System.out.println(res));
		
	}

}
