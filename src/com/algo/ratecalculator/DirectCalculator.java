package com.algo.ratecalculator;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Set;

import com.algo.model.Pair;

public class DirectCalculator implements ICalculator {

	@Override
	public BigDecimal calculate(Pair pair, Set<String> rateSet) {
		Optional<String> rateOpt = rateSet.stream().filter(x -> x.contains(pair.value())).findFirst();
		return new BigDecimal(rateOpt.get().split("=")[1]);
	}

}
