package com.asminds.java.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.SerializablePermission;

public class Serializable1 {
	public static void main(String[] args) {
		try {
		Serialize s=new Serialize(11,"nathiya");
		FileOutputStream o=new FileOutputStream("my.text");
		ObjectOutputStream o1=new ObjectOutputStream(o);
		o1.writeObject(s);
		o1.flush();
		o1.close();
	} catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}
		
	}

}
