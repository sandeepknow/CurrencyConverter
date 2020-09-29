package com.algo.converter.factory;

import com.algo.converter.CurrencyConverter;
import com.algo.converter.IConverter;

public class ConverterFactory {

	public static ConverterFactory buildFactory() {
		return new ConverterFactory();
	}

	public IConverter currencyConverter(String type) {
		
		if (type.equalsIgnoreCase("currency")) {
			return new CurrencyConverter();
		}
		
		return new CurrencyConverter();
	}
}
