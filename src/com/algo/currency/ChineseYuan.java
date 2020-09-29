package com.algo.currency;

public class ChineseYuan implements ICurrency {

	private String symbol = "CNY";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
