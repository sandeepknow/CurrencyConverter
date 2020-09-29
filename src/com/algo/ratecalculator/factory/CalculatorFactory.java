package com.algo.ratecalculator.factory;

import com.algo.enums.CROSSVIA;
import com.algo.ratecalculator.DirectCalculator;
import com.algo.ratecalculator.EuroCalculator;
import com.algo.ratecalculator.ICalculator;
import com.algo.ratecalculator.InvertedCalculator;
import com.algo.ratecalculator.USDCalculator;
import com.algo.ratecalculator.UnityCalculator;

public class CalculatorFactory {

	public static ICalculator createCalculator(CROSSVIA crossVia){
		if(crossVia.equals(CROSSVIA.DIRECT)) {
			return new DirectCalculator();
		}else if(crossVia.equals(CROSSVIA.INVERTED)) {
			return new InvertedCalculator();
		}else if(crossVia.equals(CROSSVIA.UNITY)) {
			return new UnityCalculator();
		}else if(crossVia.equals(CROSSVIA.USD)) {
			return new USDCalculator();
		}else if(crossVia.equals(CROSSVIA.EUR)) {
			return new EuroCalculator();
		}
		
		return null;
	}
}
