package com.algo.ratecalculator;

import java.math.BigDecimal;
import java.util.Set;

import com.algo.model.Pair;

public interface ICalculator {

	BigDecimal calculate(Pair pair, Set<String> rateSet);
}
