package programjava;

public class CustomExceptionExample {
	
		public void checkAge (int age)throws InvalidAgeException{
			if(age<=18 || age>=25) {
				throw new InvalidAgeException(" invalid age for enrolling into java course");
			}
			else
				System.out.println("proper age for enrolling in java course");
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomExceptionExample c = new CustomExceptionExample();
		Scanner s = new (System.in);
		System.out.println("ENTER THE AGE");
        int age = s.nextInt();
		c.checkAge(age);

	}

}
