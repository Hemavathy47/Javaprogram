package program;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Good";
		String b = "Morning";
	
	System.out.println(" Before Swap : "+a+" "+b);
	a=a+b;
	b=a.substring(0,a.length()- b.length());
	a=a.substring(b.length());
	System.out.println("After : "+a+" "+b);
	}

}
