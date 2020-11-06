package com.asminds.java.constructor;

public class Constructorchain {
	Constructorchain()
	{
		this(5);
		System.out.println("defaultconstructor is called");
	}
	Constructorchain(int x)
	{
		this(5,15);
		System.out.println(x);
	}
	Constructorchain(int x,int y)
	{
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		new Constructorchain();
	}
	

}
