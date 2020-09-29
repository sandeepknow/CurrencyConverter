package com.algo.currency;

public class NZDollar implements ICurrency {

	private String symbol = "NZD";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
