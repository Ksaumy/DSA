package BasicCode;

import java.util.Scanner;

public class Factorial {
	
	public static void factorial(int n)
	{
		int count =1;
		for(int i=2;i<=n;i++)
		{
			count = count*i;
		}
		System.out.println("Factorial is: "+ count);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		factorial(n);//call function in main else it will not print anythings

	}

}
