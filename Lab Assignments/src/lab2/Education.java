package lab2;

public class Education implements Cloneable
{
	
	public enum Degree { MS, PhD; }
	
	private Degree degree;
	private String major;
	private int research;
	
	/**
	 * default constructor for an Education object
	 */
	public Education()
	{
		this.degree = null;
		this.major = "";
		this.research = 0;
	}
	
	/**
	 * overloaded constructor setting the degree, major, and research to given values
	 * @param d - Degree enum constant representing degree
	 * @param m - String representing major
	 * @param r - integer representing number of researches
	 */
	public Education(Degree d, String m, int r)
	{
		this.degree = d;
		this.major = m;
		this.research = r;
	}
	
	/**
	 * gets the degree of the employee education
	 * @return Degree enum constant representing degree level
	 */
	public Degree getDegree()
	{
		return degree;
	}
	
	/**
	 * gets the employee's major
	 * @return String representing the employee's major
	 */
	public String getMajor()
	{
		return major;
	}
	
	/**
	 * gets the number of research performed by employee
	 * @return integer representing amount of research
	 */
	public int getResearch()
	{
		return research;
	}
	
	/**
	 * sets the degree to a given value
	 * @param d - Degree constant to set (MS or PhD)
	 */
	public void setDegree(Degree d)
	{
		degree = d;
	}
	
	/**
	 * sets the major to a given value
	 * @param m - String object to set as the Education major
	 */
	public void setMajor(String m)
	{
		major = m;
	}
	
	/**
	 * sets the research attribute to a given value
	 * @param n - integer value to set the number of researches
	 */
	public void setResearch(int n)
	{
		research = n;
	}
	
	/**
	 * clones an Education object by creating a shallow copy
	 */
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
