package lab4;

import java.util.ArrayList;
import java.util.Collection;
/**
 * class representing a set of Coin objects
 * @author Mariel
 *
 */
public class CoinSet 
{
	
	private ArrayList<Coin> set;
	
	/**
	 * default constructor, sets CoinSet arraylist to null
	 */
	public CoinSet()
	{
		this.set = new ArrayList<Coin>();
	}
	
	/**
	 * overloaded constructor, sets CoinSet to a given arraylist
	 * @param s - CoinSet to set to, as an arraylist
	 */
	public CoinSet(ArrayList<Coin> s)
	{
		this.set = s;
	}
	
	/**
	 * adds a coin to the arraylist in CoinSet
	 * @param c - Coin object to add
	 */
	public void addCoin(Coin c)
	{
		set.add(c);
	}
	
	/**
	 * gets the value of the CoinSet
	 * @return a double representing the numerical total of all coins in the set
	 */
	public double getValue()
	{
		double total = 0.0;
		for(Coin s : set)
		{
			total += s.getValue();
		}
		return total;
	}
	
	/**
	 * removes all coins from the set
	 */
	public void removeAllCoins()
	{
		set.clear();
	}
	
	/**
	 * adds another CoinSet to this CoinSet
	 * @param other - CoinSet to add
	 */
	public void addCoins(CoinSet other)
	{
		for(Coin c : other.set)
		{
			set.add(c);
		}
	}
	
}
