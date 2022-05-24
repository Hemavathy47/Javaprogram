package set;

public class StringObjects {
	public static void main(String[] args)
	{
		String column1 = "Stephen Edwin King";
		String column2 = "Walter Winchell";
		String column3 = "Mike Rokya"; 
		
		boolean equal1 = column1.equals(column2);
		boolean equal2 = column2.equals(column3);
		
		System.out.println("\""+column1+"\"equal\"" + column2 + "\"?" + equal1);
		System.out.println("\""+column1+"\"equal\"" + column3 + "\"?" + equal2);
		

		
	}

}
