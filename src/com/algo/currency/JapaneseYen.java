package com.algo.currency;

public class JapaneseYen implements ICurrency{
	private String symbol = "JPY";

	@Override
	public String getSymbol() {
		return this.symbol;
	}
}
