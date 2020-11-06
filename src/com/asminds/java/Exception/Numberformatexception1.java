package com.asminds.java.Exception;

public class Numberformatexception1 {
	public static void main(String[] args) {
		String s="welcome to office";
		int i=Integer.parseInt(s);//it returns the number format exception.because i cannot pass the string value into integer
		System.out.println(i);
	}

}
