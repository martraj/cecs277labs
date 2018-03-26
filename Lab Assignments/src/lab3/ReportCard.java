package lab3;

/**
 * class representing a ReportCard object, generates a student report card
 */
import java.util.ArrayList;

public class ReportCard {
	private Student stu;
	private ArrayList<Course> courses;
	
	public ReportCard()
	{
		this.stu = null;
		this.courses = null;
	}
	
	public ReportCard(Student s, ArrayList<Course> c)
	{
		this.stu = s;
		this.courses = c;
	}
	
	public double calculateGPA()
	{
		double totalPts = 0.0;
		for(Course c : courses)
		{
			totalPts += c.getGradeValue();
		}
		
		double gpa = totalPts/courses.size();
		return Math.round(gpa * 100.0) / 100.0;
	}
	
	public String toString()
	{
		String str = "";
		str += "NAME: " + stu.getName() + "\nID: " + stu.getID() + "\n";
		str += "\nCOURSES: \n";
		for(Course c : courses)
		{
			str += c.getName() + "\t\t\t" + c.getLetterGrade() + "\n";
		}
		str += "\nGPA: " + calculateGPA();
		
		return str;
	}
}
