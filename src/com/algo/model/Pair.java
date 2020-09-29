package com.algo.model;

import com.algo.currency.ICurrency;

public class Pair {

	private String base;
	private String term;

	public Pair(String base, String term) {
		this.base = base;
		this.term = term;
	}

	public Pair(ICurrency fromCurrency, ICurrency toCurrency) {
		this.base = fromCurrency.getSymbol();
		this.term = toCurrency.getSymbol();
	}
	
	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String value() {
		return base + term;
	}

}
