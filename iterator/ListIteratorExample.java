package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>(); // creating list
		list.add("a");
		list.add("b");
		ListIterator<String>iterator = list.listIterator(); // creating listIterator
		
		while(iterator.hasNext()) // iterating through list
		{
			System.out.println(iterator.next());//moves cursor to "a" and print it
			iterator.next(); //moves cursor to "b" and print it
			iterator.previous(); // moves back to "b"
		}
		

	}

}
