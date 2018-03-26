package lab3;

/**
 * class representing a Grade object with letter & numerical values
 * @author Mariel
 *
 */
public class Grade {
	private String letter;
	private double number;
	
	public Grade()
	{
		this.letter = "N/A";
	}
	
	public Grade(String l)
	{
		this.letter = l;
	}
	
	public String getLetter()
	{
		return letter;
	}
	
	public void setLetter(String l)
	{
		letter = l;
	}
	
	public double getNumber()
	{
		if(letter == "A")
		{
			return 4.0;
		}
		else if(letter == "B")
		{
			return 3.0;
		}
		else if(letter == "C")
		{
			return 2.0;
		}
		else if(letter == "D")
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
}
