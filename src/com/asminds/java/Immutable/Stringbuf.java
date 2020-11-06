package com.asminds.java.Immutable;

public class Stringbuf {
	public static void main(String[] args) {
		
	
	StringBuffer bf=new StringBuffer("hello");
	bf.append("java");
	System.out.println(bf);
	bf.insert(1, "yellow");
	System.out.println(bf);
	bf.replace(1, 2, "nathiya");
	System.out.println(bf);
	bf.reverse();
	System.out.println(bf);
	bf.delete(1, 3);
	System.out.println();
	
	

}
}
