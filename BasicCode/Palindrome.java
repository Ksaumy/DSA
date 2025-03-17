package BasicCode;

import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String str)
	{
		int left = 0;
		int right = str.length()-1;
		while(left<right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				return false;
			}
				left ++;
				right --;
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str =sc.nextLine();
		 if(palindrome(str))
		 {
			 System.out.println("String is Palindrome");
		 }
		 else
		 {
			 System.out.println("String is not Palindrome");
		 }
		 

	}

}
