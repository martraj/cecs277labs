package lab4;

import java.util.ArrayList;

/**
 * class representing a vending machine
 * @author Mariel
 *
 */
public class VendingMachine 
{	
	private ArrayList<Product> products;
	private CoinSet currentCoins;
	private CoinSet coins;

	/**
	 * default constructor
	 */
	public VendingMachine()
	{
		this.products = new ArrayList<Product>();
		this.currentCoins = new CoinSet();
		this.coins = new CoinSet();
	}
	
	/**
	 * overloaded constructor
	 * @param p - ArrayList of products to initialize in vending machine
	 * @param cc - CoinSet to set as currentCoins
	 * @param c - CoinSet to set as coins
	 */
	public VendingMachine(ArrayList<Product> p, CoinSet cc, CoinSet c)
	{
		this.products = p;
		this.currentCoins = cc;
		this.coins = c;
	}
	
	/**
	 * adds a coin to the currentCoins CoinSet
	 * @param c - Coin object to add
	 */
	public void addCoin(Coin c)
	{
		currentCoins.addCoin(c);
	}
	
	/**
	 * adds a product to the products arraylist
	 * @param p - Product object to add
	 * @param quantity - amount of this product to add
	 */
	public void addProduct(Product p, int quantity)
	{
		for(int i = 0; i < quantity; i++)
		{
			products.add(p);
		}
	}

	/**
	 * buys the product if there is sufficient funds
	 * @param choice - number chosen by user, corresponds to products array index
	 */
	public void buyProduct(int choice)
	{		
		if(choice > products.size()-1) { System.out.println("Invalid entry."); }
		else
		{
			if(currentCoins.getValue() >= products.get(choice).getPrice()) // sufficient funds
			{
				products.remove(products.get(choice));
				coins.addCoins(currentCoins);
				currentCoins.removeAllCoins();
				System.out.println("Purchased: " + products.get(choice));
			}
			else // insufficient funds
			{
				System.out.println("Not enough coins.");
				if(currentCoins.getValue() > 0)
				{
					System.out.println("Returning coins: " + currentCoins.getValue());
				}
				currentCoins.removeAllCoins();
			}	
		}

	}
	
	/**
	 * removes all coins from vending machine
	 * @return value of coins removed
	 */
	public double removeMoney()
	{
		double temp = coins.getValue();
		coins.removeAllCoins();
		return temp;
	}
	
	/**
	 * displays all products currently available in the vending machine
	 */
	public void displayProducts()
	{	
		for(int i = 0; i < products.size(); i++)
		{
			int num = i+1;
			System.out.printf("%d | %s\n", num, products.get(i));
		}
		
	}

}
