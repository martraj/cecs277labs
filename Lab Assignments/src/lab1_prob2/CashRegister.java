package lab1_prob2;

import java.text.DecimalFormat;

/** 
 * Problem 2; CashRegister
 * class simulating a vending machine cash register
 * @author Mariel
 *
 */
public class CashRegister {

	private static double total;
	private static double payment;
	
	/**
	 * default constructor for a CashRegister object
	 */
	public CashRegister()
	{
		this.total = 0;
		this.payment = 0;
	}
	
	/**
	 * records a purchase made by incrementing the total cost
	 * @param price - takes in the price of the item as a double
	 */
	public void recordPurchase(double price)
	{
		total += price;
	}
	
	/**
	 * increments the user's payment
	 * @param amt - integer representing the amount of that coin entered
	 * @param pay - MonetaryUnit object representing the coin/bill inserted
	 */
	public void enterPayment(int amt, MonetaryUnit pay)
	{
		payment += amt * pay.getVal();
	}
	
	/**
	 * calculates the change based on the cost of the item and the money entered
	 * @return a double representing the change
	 */
	public double giveChange()
	{
		double change = payment - total;
		DecimalFormat f = new DecimalFormat("###.##");
		change = Double.parseDouble(f.format(change));
		return change;
	}
	
}
