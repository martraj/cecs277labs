package lab4;

/**
 * class representing a Product object with a description and price
 * @author Mariel
 *
 */
public class Product 
{	
	private String description;
	private double price;
	
	/**
	 * default constructor - sets description to empty string and price to 0.0
	 */
	public Product()
	{
		this.description = "";
		this.price = 0.0;
	}
	
	/**
	 * overloaded constructor
	 * @param d - String to set as description
	 * @param p - double to set as price
	 */
	public Product(String d, double p)
	{
		this.description = d;
		this.price = p;
	}
	
	/**
	 * gets the product description
	 * @return description as String object
	 */
	public String getDesc()
	{
		return description;
	}
	
	/**
	 * gets the product price
	 * @return price as a double
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * sets the description to given String
	 * @param s - string to set as description
	 */
	public void setDesc(String s)
	{
		description = s;
	}
	
	/**
	 * sets the price to given double
	 * @param p - double to set as price
	 */
	public void setPrice(double p)
	{
		price = p;
	}
	
	/**
	 * overrides equals method for a Product object
	 */
	public boolean equals(Object other)
	{
		if(other == null)
			return false;
		else
		{
			if(this.price == ((Product)other).price && this.description.equals(((Product)other).description))
			{
				return true;
			}
			return false;
		}
	}
	
	/**
	 * overrides toString method
	 */
	public String toString()
	{
		return String.format("%-20s| %.2f", description, price);
	}

}
