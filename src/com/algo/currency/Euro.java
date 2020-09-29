package com.algo.currency;

public class Euro implements ICurrency {

	private String symbol = "EUR";
	
	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
