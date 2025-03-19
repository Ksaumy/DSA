package CompareComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class Student {
public class Student implements Comparable<Student>
{
	int rollNumber;
	String name;
	public Student(int rollNumber,String name)
	{
		this.rollNumber=rollNumber;
		this.name = name;
	}
//Implement compareTo to define sorting logic[Ascending order of RollNumber]
	@Override
	public int compareTo(Student other) {
		
		return this.rollNumber-other.rollNumber;//Asending order
	}
	@Override
	public String toString()
	{
		return rollNumber+"-"+name;
	}

}
 class  ComparableExample
 {
	 public static void main(String[]args)
	 {
		 List<Student>student = new ArrayList<>();
		 student.add(new Student(102,"Alice"));
		 student.add(new Student(101,"Saumya"));
		 student.add(new Student(103,"Priya"));
		 //sorting using Comparable(natural order)
		 Collections.sort(student);
		 //print sorted list
		 System.out.println(student);
	 }
 }
