package lab3;

/**
 * class representing a Course object with the course name/number and a grade
 * @author Mariel
 *
 */
public class Course {
	private String name;
	private String courseNum;
	private Grade grade;
	
	/**
	 * default constructor for Course object - sets name and course number to N/A and grade to null
	 */
	public Course()
	{
		this.name = "N/A";
		this.courseNum = "N/A";
		this.grade = null;
	}
	
	/**
	 * overloaded constructor for Course object
	 * @param n - String to set as Course name
	 * @param c - String to set as Course number
	 * @param s - Grade object to set as course grade
	 */
	public Course(String n, String c, Grade g)
	{
		this.name = n;
		this.courseNum = c;
		this.grade = g;
	}
	
	/**
	 * gets the Course name
	 * @return - Course name as String object
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * gets the course number
	 * @return - Course number as String object
	 */
	public String getCourseNum()
	{
		return courseNum;
	}
	
	/**
	 * gets the course letter grade
	 * @return - letter grade as a String
	 */
	public String getLetterGrade()
	{
		return grade.getLetter();
	}
	
	/**
	 * gets the numerical grade value of Course
	 * @return - grade value as a double
	 */
	public double getGradeValue()
	{
		return grade.getNumber();
	}
	
	/**
	 * sets the course name to a given string
	 * @param s - String to set as course name
	 */
	public void setName(String s)
	{
		name = s;
	}
	
	/**
	 * sets the course number to a given string
	 * @param s - String to set as course number
	 */
	public void setCourseNum(String s)
	{
		courseNum = s;
	}
	
	/**
	 * sets the course section number to a given int
	 * @param s - integer to set as course number
	 */
	public void setGrade(Grade s)
	{
		grade = s;
	}
}
