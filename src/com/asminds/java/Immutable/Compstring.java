package com.asminds.java.Immutable;

public class Compstring {
	public static void main(String[] args) {
		String s=new String("Nathiya");
		String s2="nathiya";
		String s3="vanmathi";
//		System.out.println(s.equals(s2));
//		System.out.println(s.equals(s3));
//		System.out.println(s2.equals(s));
	//	System.out.println(s.equalsIgnoreCase(s2));//this will ignore the case senstive
		System.out.println(s==s2);//it compare the reference not the content
		System.out.println(s3.compareTo(s2));
	}

}
