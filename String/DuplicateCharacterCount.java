package String;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacterCount {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		//STORING CHACHTER Count
		HashMap<Character,Integer> map = new HashMap<>();
		//Iterating through String and CountingChacter
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);//extracts one char at a time
			map.put(ch, map.getOrDefault(ch, 0)+1);//check if character ch existing in map if yes then increase by 1
		}
		System.out.println("Duplicate characters  count are :");
		//duplicate character displaying
		for(var entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"--"+entry.getValue());
			}
		}


	}

}
