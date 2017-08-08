package com.hand.test;

class location<T>{
	private T x;
	private T y;
	public location(T x, T y) {
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public T getY() {
		return y;
	}
	
}

public class GenericDemo {
	public static void main(String[] args) {
		location<String> loca=new location<String>("¾­¶È===100","Î¬¶È===109");
		System.out.println(loca.getX()+" "+loca.getY());
	}
}
