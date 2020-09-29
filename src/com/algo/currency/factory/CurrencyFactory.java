package com.algo.currency.factory;

import com.algo.currency.AUDollar;
import com.algo.currency.CADollar;
import com.algo.currency.ChineseYuan;
import com.algo.currency.CzechKaruna;
import com.algo.currency.DanishKrone;
import com.algo.currency.Euro;
import com.algo.currency.GreatBritishPound;
import com.algo.currency.ICurrency;
import com.algo.currency.JapaneseYen;
import com.algo.currency.NZDollar;
import com.algo.currency.NorwayKrone;
import com.algo.currency.USDollar;
import com.algo.exception.InvalidCurrencyException;

public class CurrencyFactory {

	public static ICurrency createCurrency(String symbol) throws InvalidCurrencyException {

		if (symbol.toUpperCase().equals("USD")) {
			return new USDollar();
		} else if (symbol.toUpperCase().equals("EUR")) {
			return new Euro();
		} else if (symbol.toUpperCase().equals("AUD")) {
			return new AUDollar();
		} else if (symbol.toUpperCase().equals("CAD")) {
			return new CADollar();
		} else if (symbol.toUpperCase().equals("CNY")) {
			return new ChineseYuan();
		} else if (symbol.toUpperCase().equals("CZK")) {
			return new CzechKaruna();
		} else if (symbol.toUpperCase().equals("DKK")) {
			return new DanishKrone();
		} else if (symbol.toUpperCase().equals("GBP")) {
			return new GreatBritishPound();
		} else if (symbol.toUpperCase().equals("JPY")) {
			return new JapaneseYen();
		} else if (symbol.toUpperCase().equals("NOK")) {
			return new NorwayKrone();
		} else if (symbol.toUpperCase().equals("NZD")) {
			return new NZDollar();
		} else {
			throw new InvalidCurrencyException("Please provide valid Currency");
		}

	}
}
