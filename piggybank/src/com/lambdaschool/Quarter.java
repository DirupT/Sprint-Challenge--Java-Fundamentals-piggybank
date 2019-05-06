package com.lambdaschool;

public class Quarter implements Coin
{
	private int amount;

	public Quarter(int amount)
	{
		this.amount = amount;
	}

	public Quarter()
	{
		amount = 1;
	}

	@Override
	public double getValue()
	{
		return 0.25 * amount;
	}

	@Override public String toString()
	{
		return amount + " Quarter";
	}
}
