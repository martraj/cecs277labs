package lab2;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * class representing an Employee object
 * @author Mariel
 *
 */
public class Employee implements EmployeeInfo, Comparable<Employee>
{

	public enum Level {	AS, AO, FU;}
	public enum Gender { M, F, NA; }
	
	private String lastName;
	private String firstName;
	private String id;
	private Gender gender;
	private GregorianCalendar birthDate = new GregorianCalendar();
	
	/**
	 * default constructor for an Employee object
	 */
	public Employee()
	{
		this.lastName = "";
		this.firstName = "";
		this.id = "";
		this.gender = Gender.NA;
		this.birthDate.set(Calendar.YEAR, 0);
		this.birthDate.set(Calendar.MONTH, 0);
		this.birthDate.set(Calendar.DAY_OF_MONTH, 0);
	}
	
	/**
	 * overloaded constructor taking in the Employee info
	 * @param l - String representing last name
	 * @param f - String representing first name
	 * @param id - String representing id number
	 * @param g - Gender constant representing gender
	 * @param b - Calendar object representing birthdate
	 */
	public Employee(String l, String f, String id, Gender g, int day, int month, int yr)
	{
		this.lastName = l;
		this.firstName = f;
		this.id = id;
		this.gender = g;
		this.birthDate.set(Calendar.YEAR, yr);
		this.birthDate.set(Calendar.MONTH, month-1);
		this.birthDate.set(Calendar.DAY_OF_MONTH, day);
	}
	
	
	/**
	 * gets the name of the Employee
	 * @return String representing employee name
	 */
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
	
	/**
	 * gets the Employee ID number
	 * @return String representing ID number
	 */
	public String getID()
	{
		return id;
	}
	
	/**
	 * gets the gender of the Employee
	 * @return Gender enum constant representing employee gender
	 */
	public Gender getGender()
	{
		return gender;
	}
	
	/**
	 * gets the birthday of the Employee
	 * @return GregorianCalendar object representing birthdate
	 */
	public String getbirthDate()
	{	
		int year = birthDate.get(Calendar.YEAR);
		int month = birthDate.get(Calendar.MONTH) + 1; 
		int day = birthDate.get(Calendar.DAY_OF_MONTH);
		return month + "/" + day + "/" + year;
	}
	
	/**
	 * sets a first and last name to the Employee object
	 * @param l - String representing last name
	 * @param f - String representing first name
	 */
	public void setName(String l, String f)
	{
		firstName = f;
		lastName = l;
	}
	
	/**
	 * sets the Employee ID number to a given string
	 * @param id - String representing ID number
	 */
	public void setID(String i)
	{
		id = i;
	}
	
	/**
	 * sets the Employee gender to a given Gender
	 * @param g - Gender constant representing gender ("M" or "F")
	 */
	public void setGender(Gender g)
	{
		gender = g;
	}
	
	/**
	 * sets the birthDate to a given GregorianCalendar object
	 * @param bd - GregorianCalendar object representing birthdate
	 */
	public void setBD(int month, int day, int yr)
	{
		this.birthDate.set(Calendar.YEAR, yr);
		this.birthDate.set(Calendar.MONTH, month-1);
		this.birthDate.set(Calendar.DAY_OF_MONTH, day);
	}
	
	/**
	 * returns monthly earning of an employee
	 */
	public double monthlyEarning()
	{
		return 0.0;
	}
	
	/**
	 * prints formatted employee information
	 */
	public String toString()
	{
		String str = "ID Employee number: " + id + "\nEmployee Name: " + this.getName()
				+ "\nSex: " + getGender() +  "\nBirthdate: " + getbirthDate();
		return str;
	}
	
	/**
	 * compares Employee objects by last name for descending order
	 */
	public int compareTo(Employee e)
	{
		return e.lastName.compareTo(lastName);
	}

	
	
}
