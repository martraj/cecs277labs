package lab4;

import java.util.Scanner;

/**
 * class representing the vending machine menu, runs the vending machine
 * @author Mariel
 *
 */
public class VendingMachineMenu 
{	
	private Scanner in;
	private static Coin[] coins = { new Coin(0.05, "Nickel"), new Coin(0.10, "Dime"), 
									new Coin(0.01, "Penny"), new Coin(0.25, "Quarter"), new Coin(1.00, "Dollar")};
	
	/**
	 * default constructor
	 */
	public VendingMachineMenu()
	{
		this.in = new Scanner(System.in);
	}
	
	/**
	 * runs a vending machine
	 * @param m - VendingMachine object to run
	 */
	public void run(VendingMachine m)
	{
		System.out.println("------MENU------\n1. Show Products\n2. Insert Coins\n3. Buy\n4. Remove Coins\n5. Add product\n6. Quit");
		int choice = Integer.parseInt(in.nextLine().trim());
		
		while(choice != 6)
		{
				
			if(choice == 1)
			{
				m.displayProducts();
			}
			else if(choice == 2)
			{
				System.out.println("1. Penny\n2. Nickel\n3. Dime\n4. Quarter\n5. Dollar");
				int coinChoice = Integer.parseInt(in.nextLine().trim());
				
				if(coinChoice == 1)
				{
					m.addCoin(coins[2]);
				}
				else if(coinChoice == 2)
				{
					m.addCoin(coins[0]);
				}
				else if(coinChoice == 3)
				{
					m.addCoin(coins[1]);
				}
				else if(coinChoice == 4)
				{
					m.addCoin(coins[3]);
				}
				else if(coinChoice == 5)
				{
					m.addCoin(coins[4]);
				}
				else
				{
					System.out.print("Invalid choice.");
				}
			}
			else if(choice == 3)
			{
				m.displayProducts();
				System.out.println("Select number option.");
				int productChoice = Integer.parseInt(in.nextLine().trim());
				m.buyProduct(productChoice-1);
			}
			else if(choice == 4)
			{
				System.out.printf("Removed: %.2f\n", m.removeMoney());
			}
			else if(choice == 5)
			{
				System.out.println("Enter product name: ");
				String name = in.nextLine().trim();
				System.out.println("Enter product price: ");
				double price = Double.parseDouble(in.nextLine().trim());
				Product newP = new Product(name, price);
				
				System.out.println("Enter quantity: ");
				int qty = Integer.parseInt(in.nextLine().trim());
	
				m.addProduct(newP, qty);
			}
			else if(choice > 6 || choice < 1)
			{
				System.out.println("Invalid choice.");
			}
			
			System.out.println("------MENU------\n1. Show Products\n2. Insert Coins\n3. Buy\n4. Remove Coins\n5. Add product\n6. Quit");
			choice = Integer.parseInt(in.nextLine().trim());
		}
	}
	
}
