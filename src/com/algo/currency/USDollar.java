package com.algo.currency;

public class USDollar implements ICurrency {

	private String symbol = "USD";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
