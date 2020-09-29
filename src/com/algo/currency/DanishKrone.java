package com.algo.currency;

public class DanishKrone implements ICurrency{
	private String symbol = "DKK";

	@Override
	public String getSymbol() {
		return this.symbol;
	}
}
