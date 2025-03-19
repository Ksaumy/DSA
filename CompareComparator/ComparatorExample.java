package CompareComparator; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Remove 'public' from CStudent (only one public class per file)
class CStudent {
    int rollNumber;
    String name;

    public CStudent(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNumber + "-" + name;
    }
}

// Comparator to sort students by name
class NameComparator implements Comparator<CStudent> {
    @Override
    public int compare(CStudent s1, CStudent s2) {
        return s1.name.compareTo(s2.name); // Sort by name (A-Z)
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<CStudent> studentList = new ArrayList<>();
        studentList.add(new CStudent(102, "Parul"));
        studentList.add(new CStudent(101, "Saumya"));
        studentList.add(new CStudent(103, "Priya"));

        // Sorting using Comparator (by name)
        Collections.sort(studentList, new NameComparator());

        // Printing sorted list
        System.out.println(studentList);
    }
}
