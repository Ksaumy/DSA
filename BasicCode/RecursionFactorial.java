package BasicCode;

import java.util.Scanner;

public class RecursionFactorial {
	
	public static long  factorial(int n)
	{
		if(n==0||n==1)
		
			return 1; //Base Case
			return n*factorial(n-1); //Recursive Case
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n= sc.nextInt();
		
		System.out.println("Factorial is : "+ factorial(n));

	}

}
