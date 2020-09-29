package com.algo.precision.formatter;

import java.math.BigDecimal;

public class DefaultFormatter implements Formatter{
	private String defaultPrecision = "%.2f" ;
	
	@Override
	public String format(BigDecimal amount) {

		return String.format(defaultPrecision, amount);
	}

}
