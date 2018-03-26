package lab2;

public class Faculty extends Employee implements Cloneable
{
	
	private Level level;
	private Education edu;
	
	/**
	 * default constructor for a Faculty object; sets level and education to null
	 */
	public Faculty()
	{
		this.level = null;
		this.edu = null;
	}
	
	/**
	 * overloaded constructor
	 * @param l - Level constant to set as the professor level
	 * @param e - Education object to set as education
	 */
	public Faculty(Level l, Education e)
	{
		this.level = l;
		this.edu = e;
	}
	
	/**
	 * gets the professor level
	 * @return Level enum constant level
	 */
	public Level getLevel()
	{
		return level;
	}
	
	/**
	 * gets the education of the faculty
	 * @return Education object
	 */
	public Education getEdu()
	{
		return edu;
	}
	
	/**
	 * sets the professor level
	 * @param l - Level enum constant to set the level value to
	 */
	public void setLevel(Level l)
	{
		level = l;
	}
	
	/**
	 * sets the faculty's education
	 * @param e - Education object to set the education value to
	 */
	public void setEdu(Education e)
	{
		edu = e;
	}
	
	/**
	 * returns the faculty member's monthly earning based on level as professor
	 * @return double representing monthly earning
	 */
	public double monthlyEarning()
	{
		if(level == Level.AS)
		{
			return FACULTY_MONTHLY_SALARY;
		}
		else if(level == Level.AO)
		{
			return 1.5*FACULTY_MONTHLY_SALARY;
		}
		else if(level == Level.FU)
		{
			return 2.0*FACULTY_MONTHLY_SALARY;
		}
		return 0.0;
	}
	
	/**
	 * prints formatted faculty information
	 */
	public String toString()
	{
		String profType = "";
		if(level == Level.AS)
		{
			profType = "Assistant";
		}
		else if(level == Level.AO)
		{
			profType = "Associate";
		}
		else if(level == Level.FU)
		{
			profType = "Full";
		}
		String str = "ID Employee number: " + super.getID() + "\nEmployee Name: " + super.getName()
				+ "\nSex: " + getGender() + "\nBirthdate: " + super.getbirthDate() + "\n" + profType + " Professor" 
				+ "\nDegree: " + edu.getDegree() + "\nMajor: " + edu.getMajor() + "\nResearch: " + edu.getResearch()
				+ "\nMonthly Salary: $" + monthlyEarning() + "0";
		return str;
	}

	/**
	 * clones a Faculty object by creating a deep copy
	 */
	public Object clone() throws CloneNotSupportedException
	{
		Education e = this.edu;
		Faculty f = (Faculty) super.clone();
		e = (Education) e.clone();
		f.setEdu(e);
		return f;
	}
}
