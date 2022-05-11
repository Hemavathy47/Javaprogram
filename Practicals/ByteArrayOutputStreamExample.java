package com;


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
	

	public static void main(String[] args) throws  IOException{
		FileOutputStream f1 = new FileOutputStream("D:\\Sample.txt");
		FileOutputStream f2 = new FileOutputStream("D:\\Sample1.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		
		bout.writeTo(f1);
		bout.writeTo(f2);
		
		bout.flush();
		bout.close();
		System.out.println("done");
		
	}
	}