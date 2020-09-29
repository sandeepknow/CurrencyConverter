package com.algo.currency;

public class CADollar implements ICurrency {

	private String symbol = "CAD";

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
