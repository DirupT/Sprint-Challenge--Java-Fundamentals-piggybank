package com.lambdaschool;

public class Dime implements Coin
{
	private int amount;

	public Dime(int amount)
	{
		this.amount = amount;
	}

	public Dime()
	{
		amount = 1;
	}

	@Override
	public double getValue()
	{
		return 0.10 * amount;
	}

	@Override public String toString()
	{
		return amount + " Dime";
	}
}
