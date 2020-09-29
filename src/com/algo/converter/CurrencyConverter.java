package com.algo.converter;

import java.math.BigDecimal;

import com.algo.currency.ICurrency;
import com.algo.enums.CROSSVIA;
import com.algo.model.Pair;
import com.algo.utils.CrossViaUtil;
import com.algo.utils.ExchangeRateUtil;

public class CurrencyConverter implements IConverter {

	CrossViaUtil crossViaUtil = new CrossViaUtil();

	public BigDecimal convert(ICurrency fromCurrency, ICurrency toCurrency, BigDecimal amount, String[][] matrix) {

		Pair pair = new Pair(fromCurrency, toCurrency);

		CROSSVIA crossVia = crossViaUtil.findCrossVia(matrix, pair);

		BigDecimal exchangeRate = ExchangeRateUtil.calculateRate(pair, crossVia);

		return amount.multiply(exchangeRate);
	}

}
