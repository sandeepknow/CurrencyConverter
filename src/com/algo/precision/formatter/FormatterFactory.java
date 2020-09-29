package com.algo.precision.formatter;

import com.algo.currency.ICurrency;

public class FormatterFactory {

	public static Formatter getFormatter(ICurrency currency){
		if(currency.getSymbol().equalsIgnoreCase("JPY")) {
			return new JPYFormatter();
		}
		return new DefaultFormatter();
	}
}
