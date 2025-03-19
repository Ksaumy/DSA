package String;

import java.util.Scanner;

public class EvenIndexedCharacter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		for(int i =0 ; i<str.length();i++)
		{
			if(i%2==0)//selecting even indexed character
				System.out.println(str.charAt(i)+"--");//retrieves character at index i 
		}

	}

}
