package com.asminds.java.constructor;

public class Constructoroverloading1 {
int age;
String name;
String place;
Constructoroverloading1(int a,String n)
{
	age=a;
	name=n;
	
}
 Constructoroverloading1(int a,String n,String p) {
	 age=a;
	 name=n;
	 place=p;
 }
 void display()
 {
	 System.out.println(age+" "+name+" "+place);
 }
	 public static void main(String[] args) {
		Constructoroverloading1 c=new Constructoroverloading1(35, "nathiya");
		Constructoroverloading1 c1=new Constructoroverloading1(54, "dayana", "chennai");
		c.display();
		c1.display();
	}
	

}
