package com.asminds.java.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializable1 {  
	 public static void main(String args[]){  
	  try{  
	  //Creating stream to read the object  
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("my.txt"));  
	  Serialize s=(Serialize)in.readObject();  
	  //printing the data of the serialized object  
	  System.out.println(s.id+" "+s.name);  
	  //closing the stream  
	  in.close();  
	  }catch(Exception e){System.out.println(e);}  
	 }  
	}  

