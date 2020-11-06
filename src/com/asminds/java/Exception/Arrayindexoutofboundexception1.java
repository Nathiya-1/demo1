package com.asminds.java.Exception;

import java.util.Arrays;

public class Arrayindexoutofboundexception1 {
	public static void main(String[] args) 
	{
		try {
		int a[]=new int[5];
		a[50]=3;
		System.out.println(a[50]);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}

}
