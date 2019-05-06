package com.lambdaschool;

public class Nickel implements Coin
{
	private int amount;

	public Nickel(int amount)
	{
		this.amount = amount;
	}

	public Nickel()
	{
		amount = 1;
	}

	@Override
	public double getValue()
	{
		return 0.05 * amount;
	}

	@Override public String toString()
	{
		return amount + " Nickel";
	}
}
