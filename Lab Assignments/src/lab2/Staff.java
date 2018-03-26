package lab2;

public class Staff extends Employee 
{
	
	private double hourlyRate;
	
	/**
	 * default constructor for Staff object; sets hourlyRate to 0.0
	 */
	public Staff()
	{
		this.hourlyRate = 0.0;
	}
	
	/**
	 * overloaded constructor that takes in a double to set to hourlyRate
	 * @param h - double representing the hourly rate
	 */
	public Staff(double h)
	{
		this.hourlyRate = h;
	}
	
	/**
	 * returns the hourlyRate as a double
	 */
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	/**
	 * sets the hourly rate to a given value
	 * @param h - double representing the hourly rate to set
	 */
	public void setHourlyRate(double h)
	{
		hourlyRate = h;
	}
	
	/**
	 * gets the Staff object's earning
	 * @return a double representing the Staff's earning
	 */
	public double monthlyEarning()
	{
		return hourlyRate * STAFF_MONTHLY_HOURS_WORKED;
	}
	
	/**
	 * prints formatted staff information
	 */
	public String toString()
	{
		String str = "ID Employee number: " + super.getID() + "\nEmployee Name: " + super.getName()
				+ "\nSex: " + getGender() + "\nBirthdate: " + super.getbirthDate() + "\nFull Time" + 
				"\nMonthly Salary: $" + monthlyEarning() + "0";
		return str;
	}

}
