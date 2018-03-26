package lab1_prob2;

/**
 * Problem 2; MonetaryUnit
 * class representing a MonetaryUnit object for vending machine payments
 * @author Mariel
 *
 */
public class MonetaryUnit {

	private double val;
	private String name;
	
	/**
	 * overloaded constructor for a MonetaryUnit object
	 * @param value - double representing the monetary value of the object
	 * @param name - String representing the name of the object (i.e. quarter, nickel, etc.)
	 */
	public MonetaryUnit(double value, String name)
	{
		this.val = value;
		this.name = name;
	}
	
	/**
	 * gets the monetary value of the object
	 * @return a double representing the value of the unit
	 */
	public double getVal()
	{
		return val;
	}
	
	/**
	 * gets the name of the object
	 * @return a String representing the name of the unit (i.e. quarter, nickel, etc.)
	 */
	public String getName()
	{
		return name;
	}
}
