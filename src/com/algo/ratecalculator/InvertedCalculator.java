package com.algo.ratecalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;
import java.util.Set;

import com.algo.model.Pair;

public class InvertedCalculator implements ICalculator {

	@Override
	public BigDecimal calculate(Pair pair, Set<String> rateSet) {
		String invertedPair = pair.getTerm() + pair.getBase();
		Optional<String> rateOpt = rateSet.stream().filter(x -> x.contains(invertedPair)).findFirst();
		return BigDecimal.ONE.divide(new BigDecimal(rateOpt.get().split("=")[1]), 4, RoundingMode.HALF_EVEN);
	}

}
