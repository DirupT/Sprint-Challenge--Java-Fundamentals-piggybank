package com.lambdaschool;

public class Penny implements Coin
{
	private int amount;

	public Penny(int amount)
	{
		this.amount = amount;
	}

	public Penny()
	{
		amount = 1;
	}

	@Override
	public double getValue()
	{
		return 0.01 * amount;
	}

	@Override public String toString()
	{
		return amount + " Penny";
	}
}
