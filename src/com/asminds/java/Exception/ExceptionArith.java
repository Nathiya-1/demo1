package com.asminds.java.Exception;

public class ExceptionArith {
	public static void main(String[] args) {
		try {
 //	int i=100;
//			int b=0;
//			int c=i/0;//it will display the Arithmetic exception
			String s=null;
			s.charAt(5);//it will display the null point exception.
			//System.out.println(c);
			System.out.println(s);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
