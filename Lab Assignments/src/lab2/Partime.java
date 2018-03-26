package lab2;

public class Partime extends Staff 
{
	private int hours;
	
	/**
	 * default constructor for a Partime employee object; sets hours worked per week to 0
	 */
	public Partime()
	{
		this.hours = 0;
	}
	
	/**
	 * overloaded constructor for a Partime employee object
	 * @param h - sets the hours worked per week to this given integer
	 */
	public Partime(int h)
	{
		this.hours = h;
	}
	
	/**
	 * gets the hours worked per week
	 * @return hours as an integer
	 */
	public int getHours()
	{
		return hours;
	}
	
	/**
	 * sets the hours worked per week
	 * @param h - integer to set the hours value to
	 */
	public void setHours(int h)
	{
		hours = h;
	}
	
	/**
	 * returns the monthly earning of a part-time employee
	 * @return a double representing the monthly earning
	 */
	public double earning()
	{
		return 4*hours*super.getHourlyRate();
	}
	
	/**
	 * prints formatted staff information
	 */
	public String toString()
	{
		String str = "ID Employee number: " + super.getID() + "\nEmployee Name: " + super.getName()
				+ "\nSex: " + getGender() + "\nBirthdate: " + super.getbirthDate() + "\nHours worked per month: "
				+ hours*4 + "\nMonthly Salary: $" + earning() + "0";
		return str;
	}
}
