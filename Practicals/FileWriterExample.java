package com;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//FileWriter fw = new FileWriter("D:\\test.txt");
			//fw.write("welcome to anudip foundation");
			
			FileReader fr = new FileReader("D:\\test.txt");
			int i ;
			while((i=fr.read())!=-1){
				System.out.println((char)i);
			}
			fr.close();
			
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
			
			}
		}

	}
