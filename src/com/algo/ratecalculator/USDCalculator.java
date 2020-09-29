package com.algo.ratecalculator;

import java.math.BigDecimal;
import java.util.Set;

import com.algo.model.Pair;

public class USDCalculator implements ICalculator {

	@Override
	public BigDecimal calculate(Pair pair, Set<String> rateSet) {
		
		DirectCalculator directCalculator = new DirectCalculator();
		
		BigDecimal firstCross = directCalculator.calculate(new Pair(pair.getBase(), "USD"), rateSet);
		BigDecimal secondCross = directCalculator.calculate(new Pair("USD", pair.getTerm()), rateSet);
		return firstCross.multiply(secondCross);
	}

}
