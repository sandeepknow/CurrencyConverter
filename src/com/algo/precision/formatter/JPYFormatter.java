package com.algo.precision.formatter;

import java.math.BigDecimal;

public class JPYFormatter implements Formatter{

	@Override
	public String format(BigDecimal amount) {

		return amount.toBigInteger().toString();
	}
	
}
