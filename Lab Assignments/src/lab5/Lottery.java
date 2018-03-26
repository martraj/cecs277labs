package lab5;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {
	
	/**
	 * generates the random numbers for the winning ticket
	 * @return a set of random integers - winning numbers
	 */
	public static Set<Integer> generateWinningNumbers()
	{
		TreeSet winning = new TreeSet();
		Random rand = new Random();
		while(winning.size()!=6)
		{
			int r = rand.nextInt(10);
			if(!winning.contains(r))
			{
				winning.add(r);
			}
		}
		return winning;
	}

	/**
	 * gets the user's choice of numbers to put on their ticket
	 * @return a set of integers chosen by the user
	 */
	public static Set<Integer> getTickets()
	{
		Scanner in = new Scanner(System.in);
		TreeSet ticket = new TreeSet();
		for(int i = 0; i < 6; i++)
		{
			System.out.printf("Enter number %d: ", i+1);
			int r = Integer.parseInt(in.nextLine().trim());
			if(r > 40) 
			{ 
				System.out.println("Invalid. Number must be between 0-40"); 
				System.out.printf("Enter number %d: ", i+1);
				r = Integer.parseInt(in.nextLine().trim());
			}
			else { ticket.add(r); }
		}
		return ticket;
	}


	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to the Lottery! Enter six numbers between 0 and 10");
		
		TreeSet w = (TreeSet) generateWinningNumbers();
		TreeSet t = (TreeSet) getTickets();
	
		// keep only winning numbers from the user's tickets

		TreeSet<Integer> m = new TreeSet<Integer>(t);
		m.retainAll(w); // keep only the numbers that match in the winning ticket
		int winnings = 0;
		for(int i = 0; i < m.size(); i++)
		{
			winnings += 250;
		}
		
		System.out.println("Your ticket: " + t);
		System.out.println("Winning Ticket: " + w);
		System.out.println("Matching numbers: " + m);
		System.out.println("You won: $" + winnings);
	}

}
