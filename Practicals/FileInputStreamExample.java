package program;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f = new FileInputStream("D:\\test.txt");
			//int i = f.read();
			//System.out.println((char)i);
			
			int i = 0;
			while((i=f.read())!=-1){
				System.out.println((char)i);
			}
			
			f.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
