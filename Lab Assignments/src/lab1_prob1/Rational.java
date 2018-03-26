package lab1_prob1;

import java.util.Scanner;

/**
 * Problem 1
 * class representing a Rational number
 * @author Mariel
 *
 */
public class Rational 
{
	private int numerator;
	private int denominator;
	
	/**
	 * default constructor
	 */
	public Rational()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	/**
	 * overloaded constructor
	 * @param num - integer to set the numerator value to
	 * @param den - integer to set the denominator value to
	 */
	public Rational(int num, int den)
	{
		this.numerator = num;
		this.denominator = den;
	}
	
	/**
	 * gets the numerator of the Rational object
	 * @return numerator as an integer
	 */
	public int getNumerator()
	{
		return numerator;
	}
	
	/**
	 * gets the denominator of the Rational object
	 * @return denominator as an integer
	 */
	public int getDenominator()
	{
		return denominator;
	}
	
	/**
	 * sets the numerator to a given value
	 * @param value - integer representing the value to set as numerator
	 */
	public void setNumerator(int value)
	{
		numerator = value;
	}
	
	/**
	 * sets the denominator to a given value
	 * @param value - integer representing the value to set as denominator
	 */
	public void setDenominator(int value)
	{
		denominator = value;
	}
	
	/**
	 * takes in user input to set the Rational numerator and denominater
	 */
	public void inputRational()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the numerator: ");
		this.numerator = Integer.parseInt(in.nextLine().trim());
		
		System.out.print("Enter the denominator: ");
		this.denominator = Integer.parseInt(in.nextLine().trim());
	}
	
	/**
	 * returns a String object representing the Rational formatted as "numerator/denominator"
	 */
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}
	
	/**
	 * calculates the greatest common divisor between two numbers
	 * @param m - first integer to check
	 * @param n - second integer to check
	 * @return integer representing the gcd
	 */
	private int gcd(int m, int n)
	{
		int r;
		while(n != 0)
		{ 
			r = m % n;
			m = n;
			n = r;
		} 
		return m;
	}
	
	/**
	 * adds two Rational numbers
	 * @param r1 - first Rational to add
	 * @param r2 - second Rational to add
	 */
	public void add(Rational r1, Rational r2)
	{
		this.numerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
		this.denominator = r1.denominator * r2.denominator;
		
		int gcd = gcd(this.numerator, this.denominator);
		this.numerator /= gcd;
		this.denominator /= gcd;
	}
	
	/**
	 * subtracts two Rational numbers
	 * @param r - Rational number to subtract from this object
	 * @return a Rational object representing the difference between the two Rationals
	 */
	public Rational sub(Rational r)
	{
		Rational diff = new Rational();
		diff.numerator = this.numerator * r.denominator - r.numerator * this.denominator;
		diff.denominator = this.denominator * r.denominator;
		
		int gcd = gcd(diff.numerator, diff.denominator);
		diff.numerator /= gcd;
		diff.denominator /= gcd;
		
		return diff;
	}
	
	/**
	 * multiplies two Rational numbers
	 * @param r1 - first Rational object to multiply
	 * @param r2 - second Rational object to multiply
	 */
	public void mul(Rational r1, Rational r2)
	{
		this.numerator = r1.numerator * r2.numerator;
		this.denominator = r1.denominator * r2.denominator;
		
		int gcd = gcd(this.numerator, this.denominator);
		this.numerator /= gcd;
		this.denominator /= gcd;
	}
	
	/**
	 * divides two Rational numbers
	 * @param r - Rational object to divide by
	 * @return Rational object representing the result of the division
	 */
	public Rational div(Rational r)
	{
		Rational result = new Rational();
		result.numerator = this.numerator * r.denominator;
		result.denominator = this.denominator * r.numerator;
		
		int gcd = gcd(result.numerator, result.denominator);
		result.numerator /= gcd;
		result.denominator /= gcd;
		
		return result;
	}
	
	/**
	 * return the real value or Rational r1 divided by Rational r2
	 * @param r1 - Rational object representing the dividend
	 * @param r2 - Rational object representing the divisor
	 * @return
	 */
	public static double divToDouble(Rational r1, Rational r2)
	{
		Rational result = new Rational();
		result.numerator = r1.numerator * r2.denominator;
		result.denominator = r1.denominator * r2.numerator;
		
		return result.numerator/result.denominator;
	}

	public static void main(String[] args)
	{
		Rational R1 = new Rational();
		Rational R2 = new Rational();
		
		R1.inputRational();
		R2.inputRational();
		
		// add
		Rational R3 = new Rational();
		R3.add(R1, R2);
		System.out.println(R1 + " + " + R2 + " = " + R3);
		
		// sub
		R3 = R1.sub(R2);
		System.out.println(R1 + " - " + R2 + " = " + R3);
		
		// mul
		R3.mul(R1, R2);
		System.out.println(R1 + " * " + R2 + " = " + R3);
		
		// div
		R3 = R1.div(R2);
		System.out.println(R1 + " / " + R2 + " = " + R3);
		
		// real number
		System.out.println("Real: " + R3.divToDouble(R1, R2));
		
		// change num & den
		R1.setNumerator(2);
		R2.setDenominator(5);
		
		System.out.println("Numerator: " + R1.getNumerator());
		System.out.println("Denominator: " + R2.getDenominator());
		
	}
	
}
