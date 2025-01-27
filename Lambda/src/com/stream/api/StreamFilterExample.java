package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
	private int id;
	private String name;
	private float price;
	
	
	
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}


public class StreamFilterExample {
	public static void main(String[] args) {
		
		List<Product>pdts=getProducts().stream()
				.filter(pr->pr.getPrice()>30000f)
				.collect(Collectors.toList());
		pdts.forEach(p->System.out.println(p));
		//System.out.println(pdts);
		
	}
	private static List<Product> getProducts(){
		List<Product>product=new ArrayList<Product>();
		product.add(new Product(1,"HP",25000f));
		product.add(new Product(2,"Dell",30000f));
		product.add(new Product(3,"Leneovo",50000f));
		product.add(new Product(4,"Asus",600000f));
		return product;
	}

}
