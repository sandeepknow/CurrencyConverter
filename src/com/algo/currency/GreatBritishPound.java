package com.algo.currency;

public class GreatBritishPound implements ICurrency{
	private String symbol = "GBP";

	@Override
	public String getSymbol() {
		return this.symbol;
	}
}
