package String;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
		
		//Create a HashMap soting chacrater frequency
		
		HashMap<Character,Integer>map = new HashMap<>();
		//Counting charcter
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);//check character already exists
		
		}
		System.out.println("Character count are :");
		//Displaying Charcter
		for(var entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}

	}

}
