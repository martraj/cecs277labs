package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentSystem 
{
	private Scanner in;
	
	/**
	 * default constructor
	 */
	public StudentSystem()
	{
		this.in = new Scanner(System.in);		
	}
	
	/**
	 * adds a Student object with info entered by user to the maps of ID-Student and Student-Grade
	 * @param ms - Map containing ID (String) as key and Student as value
	 * @param mg - Map containing Student as key and Grade (char) as value 
	 */
	void addStudent(Map<String, Student> ms, Map<Student, Character> mg)
	{
		System.out.println("Enter id: ");
		String id = in.nextLine().trim();
		System.out.println("Enter last name: ");
		String last = in.nextLine().trim();
		System.out.println("Enter first name: ");
		String first = in.nextLine().trim();
		
		Student s = new Student(id, last, first);
		System.out.println("Enter Grade: ");
		char gr = in.nextLine().charAt(0);
		
		if (ms.containsKey(id)) System.out.println("DUPLICATE");
		ms.put(id, s);
		mg.put(s, gr);
	}
	
	/**
	 * asks user for ID lookup and grade to change for that Student
	 * @param ms - Map containing ID (String) as key and Student as value
	 * @param mg - Map containing Student as key and Grade (char) as value 
	 */
	void modifyGrade(Map<String, Student> ms, Map<Student, Character> mg)
	{
		System.out.println("Enter id to modify grade: ");
		String id = in.nextLine().trim();
		Student s = ms.get(id);
		System.out.println("Enter new grade: ");
		char g = in.nextLine().charAt(0);
		
		mg.put(s, g);
	}

	/**
	 * asks user for ID to look up and removes that Student
	 * @param ms - Map containing ID (String) as key and Student as value
	 * @param mg - Map containing Student as key and Grade (char) as value 
	 */
	void removeStudent(Map<String, Student> ms, Map<Student, Character> mg)
	{
		System.out.println("Enter id to remove: ");
		String id = in.nextLine().trim();
		
		ms.remove(id);
	}
	
	/**
	 * prints all Student info sorted by last name
	 * @param ms - Map containing ID (String) as key and Student as value
	 * @param mg - Map containing Student as key and Grade (char) as value 
	 */
	void printGrades(Map<String, Student> ms, Map<Student, Character> mg)
	{
		ArrayList<Student> sorted = new ArrayList<Student>();
		HashSet<Student> students = new HashSet<Student>();
		for(Student s : ms.values())
		{
			students.add(s);
		}		
		
		for(Student s : students)
		{
			sorted.add(s);
		}
		
		Collections.sort(sorted);
		
		System.out.println("-------Students-------\n");
		System.out.println("ID\t\tName\t\t\tGrade\n");
		for(Student s : sorted)
		{
			System.out.printf(s + String.format("\t\t%c\n", mg.get(s)));
		}
		System.out.println("\n");
	}
	
}
