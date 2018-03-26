package lab3;

/**
 * Tester for the report card generator
 */
import java.util.ArrayList;

public class ReportCardTester {

	public static void main(String[] args) {
		
		Student test = new Student("Mariel T", "012345");
		ArrayList<Course> myCourses = new ArrayList<Course>();
		
		Course c1 = new Course("CECS 100", "8109", new Grade("A"));
		Course c2 = new Course("CECS 277", "1243", new Grade("A"));
		Course c3 = new Course("PHYS 151", "4718", new Grade("B"));
		
		myCourses.add(c1);
		myCourses.add(c2);
		myCourses.add(c3);
		
		ReportCard myReport = new ReportCard(test, myCourses);
		
		System.out.print(myReport);

	}

}
