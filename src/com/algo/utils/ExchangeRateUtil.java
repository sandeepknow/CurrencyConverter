package com.algo.utils;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.algo.enums.CROSSVIA;
import com.algo.model.Pair;
import com.algo.ratecalculator.ICalculator;
import com.algo.ratecalculator.factory.CalculatorFactory;

public class ExchangeRateUtil {

	public static Set<String> exchangeRates = Stream
			.of("AUDUSD=0.8371", "CADUSD=0.8711", "USDCNY=6.1715", "EURUSD=1.2315", "GBPUSD=1.5683", "NZDUSD=0.7750",
					"USDJPY=119.95", "EURCZK=27.6028", "EURDKK=7.4405", "EURNOK=8.6651")
			.collect(Collectors.toCollection(HashSet::new));

	public static BigDecimal calculateRate(Pair pair, CROSSVIA crossVia) {

		ICalculator calculator = CalculatorFactory.createCalculator(crossVia);

		return calculator.calculate(pair, exchangeRates);
	}

}
