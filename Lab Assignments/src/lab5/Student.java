package lab5;

public class Student implements Comparable<Student>
{
	private String idNum;
	private String lastName;
	private String firstName;
	
	/**
	 * default constructor
	 */
	public Student()
	{
		this.idNum = "";
		this.lastName = "";
		this.firstName = "";
	}
	
	/**
	 * overloaded constructor
	 * @param i - id number String
	 * @param l - last name String
	 * @param f - first name String
	 */
	public Student(String i, String l, String f)
	{
		this.idNum = i;
		this.lastName = l;
		this.firstName = f;
	}
	
	/**
	 * gets the ID numbers
	 * @return - ID number as a String
	 */
	public String getID()
	{
		return idNum;
	}
	
	/**
	 * gets the student name
	 * @return - first and last name of Student as a String
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * sets the ID number
	 * @param i - String ID number
	 */
	public void setID(String i)
	{
		idNum = i;
	}
	
	/**
	 * sets the Student name
	 * @param l - last name String
	 * @param f - first name String
	 */
	public void setName(String l, String f)
	{
		lastName = l;
		firstName = f;
	}
	
	/**
	 * Calculates a hashcode by combining the hashcodes of the instance variables.
	 * @return a hashcode dependant on the instance variables
	 */
	public int hashCode()
	{
		int id = Integer.parseInt(idNum);
		final int HASH_MULTIPLIER = 29;
		int h = HASH_MULTIPLIER * firstName.hashCode() + lastName.hashCode();
		h = HASH_MULTIPLIER * h + ((Integer)id).hashCode();
		return h;
	}
	
	/**
	 * overrides equals method
	 * @param other - Student object to compare with this object
	 * @return true if equal
	 */
	public boolean equals(Student other)
	{
		if(this.hashCode() == other.hashCode())
		{
			return true;
		}
		return false;
	}

	/**
	 * overrides compareTo method
	 */
	public int compareTo(Student other) {
		if(this.getLastName().equals(other.getLastName()))
		{
			if(this.getFirstName().equals(other.getFirstName()))
			{
				return this.getID().compareTo(other.getID());
			}
			else{
				return this.getFirstName().compareTo(other.getFirstName());
			}
		}
		return this.getLastName().compareTo(other.getLastName());
	}
	
	/**
	 * overrides toString method
	 */
	public String toString()
	{
		return String.format("%s\t\t%s %s", idNum, firstName, lastName);
	}
	
}
