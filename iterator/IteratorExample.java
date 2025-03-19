package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[]args)
	{
	List<String>name = new ArrayList<>(); //create a list
	name.add("Saumya");
	name.add("Neha");
	name.add("Parul");
	Iterator<String>iterator = name.iterator(); // create an iterator
	
//	while(iterator.hasNext()) // Iterating through list
//	{
//		String person = iterator.next();
//		System.err.println(person);
//	}
	
	while(iterator.hasNext())//remove from list while iterating
	{
		String person = iterator.next();
		if(person.equals("Neha"))
		{
			iterator.remove(); // safely remove
		}
	}
	System.out.println(name); // modifiy list


	
	}

}
