package program;

import java.util.Scanner;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("The alternate prime numbers  "+num+" are : ");
		int iter = 2;
		for(int i=2; i<=num;i++)
		{
			if(isPrime(i))
			{
				if (iter%2== 0)
					
				System.out.println(i+",");
				iter++;
			}
		}
		
			
		}
		static boolean isPrime(int num)
		{
			int iter =2;
			boolean flag = true;
			while(num>iter)
			{
				if(num%iter==0)
				{
					flag = false;
					break;
				}
				iter++;
				}
				return flag;
			}
	
}


