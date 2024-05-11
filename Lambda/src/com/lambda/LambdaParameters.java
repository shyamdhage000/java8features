package com.lambda;

interface Addable{
	int addition(int a, int b);
}
public class LambdaParameters {

	public static void main(String[] args) {
		Addable add=(int a, int b)-> (a+b);
		System.out.println(add.addition(5, 6));
	}
}