package com.algo.converter;

import java.math.BigDecimal;

import com.algo.currency.ICurrency;

public interface IConverter {

	public BigDecimal convert(ICurrency fromCurrency, ICurrency toCurrency, BigDecimal amount, String[][] matrix) ;
}
