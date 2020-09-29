package com.algo.currency;

public class CzechKaruna implements ICurrency {

	private String symbol = "CZK";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
