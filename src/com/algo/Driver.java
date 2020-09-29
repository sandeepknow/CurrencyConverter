package com.algo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

import com.algo.converter.IConverter;
import com.algo.converter.factory.ConverterFactory;
import com.algo.currency.ICurrency;
import com.algo.currency.factory.CurrencyFactory;
import com.algo.exception.InvalidCurrencyException;
import com.algo.precision.formatter.FormatManager;
import com.algo.precision.formatter.FormatterFactory;
import com.algo.utils.ConversionMatrix;

public class Driver {

	static String matrixFileFormat = "csv";
	static String defaultPrecision = "%.2f";
	static String converterType = "currency";

	static String[][] matrix = null;
	static {
		ConversionMatrix matrixReader = new ConversionMatrix();
		try {
			matrix = matrixReader.readFromFile(matrixFileFormat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String consoleInput = in.nextLine();
		String[] inputs = consoleInput.split(" ");
		ICurrency fromCurrency = null;
		ICurrency toCurrency = null;
		try {
			fromCurrency = CurrencyFactory.createCurrency(inputs[0]);
			toCurrency = CurrencyFactory.createCurrency(inputs[3]);
		} catch (InvalidCurrencyException InvalidCurrencyException) {
			System.out.println("Unable to find rate for " + inputs[0] + "/" + inputs[3]);
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		BigDecimal amount = new BigDecimal(inputs[1]);

		IConverter currencyConverter = ConverterFactory.buildFactory().currencyConverter(converterType);
		BigDecimal convertedCurrency = currencyConverter.convert(fromCurrency, toCurrency, amount, matrix);

		String formatedCurrency = FormatManager.format(FormatterFactory.getFormatter(toCurrency), convertedCurrency);

		System.out.println(
				fromCurrency.getSymbol() + " " + amount + " = " + toCurrency.getSymbol() + " " + formatedCurrency);

		in.close();
	}

}
