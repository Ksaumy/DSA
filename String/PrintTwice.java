package String;

import java.util.Scanner;

public class PrintTwice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str= sc.nextLine();
		String nstr=" ";//initializing empty string where we store new modified string
		for(int i=0; i<str.length();i++)//itrate each character
		{
			if(str.charAt(i)==' ') //check if character is a space(' '), it is added to nstr as it is else character is duplicated and added to nstr
			{
				nstr=nstr+str.charAt(i);
			}
			else
			{
				nstr=nstr+str.charAt(i)+str.charAt(i);
			}
		}
		System.out.println("New String is : "+nstr);

	}

}
