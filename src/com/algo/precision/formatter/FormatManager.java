package com.algo.precision.formatter;

import java.math.BigDecimal;

public class FormatManager {

	public static String format(Formatter formatter, BigDecimal amount) {
		return formatter.format(amount);
	}
}
