package com.asminds.java.Exception;

import java.security.InvalidAlgorithmParameterException;

public class Costum {
	static void validate(int age)throws Invalidexcep{
		if(age<18)
		{
			throw new Invalidexcep("invalid");
		}
		else
		{
			System.out.println("welcome to vote");
		}
		
	}
	public static void main(String[] args) {
		try {
			validate(50);
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
	
	

}
