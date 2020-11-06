package com.asminds.java.Immutable;

import java.awt.image.ReplicateScaleFilter;

public class ConcatStringplus
{
	public static void main(String[] args) {
		int a=10;
	String s="  vanmathi";
	String s7="i am nathiya";
	String s1="nathiya";
	String s3="vanmathi"+"nathiya";
	System.out.println(s3);
	System.out.println(s.concat(s1));
	System.out.println(s.substring(4));//it gives the substring from the basestring based on the index value
	System.out.println(s.toUpperCase());//convert to uppercase
	System.out.println(s.trim());//remove the white space in the string
	System.out.println(s.startsWith("  "));
	System.out.println(s.charAt(3));
	System.out.println(s.length());
	System.out.println(s.indent(5));
	String s6=String.valueOf(a);
	System.out.println(s6+10);
String s10=s7.replace("i", "you");
System.out.println(s10);

}
}
