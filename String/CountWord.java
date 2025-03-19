package String;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int count =0;
		String [] nstr=str.split(" ");//nstr = result store in array
		//str.split(" ") = Break string into words using spaces
		for(int i=0; i<nstr.length;i++);//Counting Non-Empty Words
		{
			int i = 0;
			if(!nstr[i].isEmpty())
			{
				count++;
			}
		}
		System.out.println("Number of words in String are :"+count);

	}

}
