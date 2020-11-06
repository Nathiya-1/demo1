package com.asminds.java.constructor;

public class Parameterizedcons {
	int age;
	String name;
	public Parameterizedcons(int i,String n)
	{
	 age=i;
	 name=n;
	}
	void disply()
	{
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		Parameterizedcons p=new Parameterizedcons(35, "nathiya");
	p.disply();
	}

}
