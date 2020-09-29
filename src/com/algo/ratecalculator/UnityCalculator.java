package com.algo.ratecalculator;

import java.math.BigDecimal;
import java.util.Set;

import com.algo.model.Pair;

public class UnityCalculator implements ICalculator{

	@Override
	public BigDecimal calculate(Pair pair, Set<String> rateSet) {
		return BigDecimal.ONE;
	}

}
