package com.algo.currency;

public class NorwayKrone implements ICurrency {

	private String symbol = "NOK";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
