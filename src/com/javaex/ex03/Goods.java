package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;
	
	public Goods(String info) {
		
		String[] f = info.split(",");
		
		this.name = f[0];
		this.price = Integer.parseInt(f[1]);
		this.count = Integer.parseInt(f[2]);
		
		
		
		
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public int getCount() {
		
		return this.count;
		
	}
	
	public void showInfo() {
		
		System.out.println(this.name + " (가격:" + this.price + "원)이 " + this.count + "개 입고 되어있습니다.");
		
	}
	

	
	
}
