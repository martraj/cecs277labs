package lab5;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentTester {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);	
		HashMap<String,Student> s = new HashMap<String,Student>();
		HashMap<Student,Character> g = new HashMap<Student,Character>();
		
		StudentSystem sys = new StudentSystem();
		
		/*----------MENU FOR STUDENT SYSTEM--------------*/

		System.out.println("-------MAIN MENU--------\n1. Add Student\n2. Modify Grade\n"
				+ "3. Remove Student\n4. Print grades\n5. Quit");	
		int choice = Integer.parseInt(in.nextLine().trim());
		
		while(choice != 5) // loop until user quits
		{
			if(choice == 1)
			{
				sys.addStudent(s, g);
			}
			else if(choice == 2)
			{
				sys.modifyGrade(s, g);
			}
			else if(choice == 3)
			{
				sys.removeStudent(s, g);
			}
			else if(choice == 4)
			{
				sys.printGrades(s, g);
			}
			else if(choice > 5 || choice < 1)
			{
				System.out.println("Invalid choice.");
			}
			
			System.out.println("-------MAIN MENU--------\n1. Add Student\n2. Modify Grade\n"
					+ "3. Remove Student\n4. Print grades\n5. Quit");	
			choice = Integer.parseInt(in.nextLine().trim());
		}
		
	}

}
