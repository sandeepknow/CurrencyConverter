package com.algo.currency;

public class AUDollar implements ICurrency {

	private String symbol = "AUD";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
