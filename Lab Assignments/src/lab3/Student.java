package lab3;

/**
 * class representing a Student object with a name and id number
 * @author Mariel
 *
 */
public class Student {
	private String name;
	private String id;
	
	/**
	 * default constructor for Student object - sets Student name & id to "N/A"
	 */
	public Student()
	{
		this.name = "N/A";
		this.id = "N/A";
	}
	
	/**
	 * overloaded constructor for Student object
	 * @param n - String to set as name attribute
	 * @param i - String to set as id attribute
	 */
	public Student(String n, String i)
	{
		this.name = n;
		this.id = i;
	}
	
	/**
	 * gets the Student's name
	 * @return - name attribute as String
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * gets the Student's ID
	 * @return - id attribute as String
	 */
	public String getID()
	{
		return id;
	}
	
	/**
	 * sets the Student name attribute to a given String
	 * @param n - String to set as the name
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * sets the Student id attribute to a given String
	 * @param n - String to set as the id
	 */
	public void setID(String i)
	{
		id = i;
	}
}
