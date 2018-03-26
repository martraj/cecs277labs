package lab4;

/**
 * class representing a Coin object with a numerical value and a name
 * @author Mariel
 *
 */
public class Coin 
{
	private double value;
	private String name;
	
	/**
	 * default constructor - sets value to 0.0 and name to "N/A"
	 */
	public Coin()
	{
		this.value = 0.0;
		this.name = "N/A";
	}
	
	/**
	 * overloaded constructor
	 * @param v - double to set as value
	 * @param n - String to set as name
	 */
	public Coin(double v, String n)
	{
		this.value = v;
		this.name = n;
	}
	
	/**
	 * gets the value of the coin
	 * @return the value of the coin
	 */
	public double getValue()
	{
		return value;
	}
	
	/**
	 * overloads the toString() method
	 */
	public String toString()
	{
		return name + "@" + value;
	}

}
