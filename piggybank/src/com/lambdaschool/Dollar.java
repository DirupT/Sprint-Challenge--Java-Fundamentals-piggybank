package com.lambdaschool;

public class Dollar implements Coin
{
	private int amount;

	public Dollar(int amount)
	{
		this.amount = amount;
	}

	public Dollar()
	{
		amount = 1;
	}

	@Override
	public double getValue()
	{
		return 1.00 * amount;
	}

	@Override public String toString()
	{
		return "$" + amount;
	}
}
