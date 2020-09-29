package com.algo.utils;

import java.util.stream.IntStream;

import com.algo.enums.CROSSVIA;
import com.algo.model.Pair;

public class CrossViaUtil {
	public CROSSVIA findCrossVia(String[][] matrix, Pair pair) {

		int baseIndex = findBaseIndex(matrix, pair.getBase());
		int termIndex = findTermIndex(matrix, pair.getTerm());

		String crossViaString = matrix[baseIndex][termIndex];
		return CROSSVIA.getByValue(crossViaString).get();
	}

	// Find base-coordinate
	private int findBaseIndex(String[][] matrix, String base) {
		return IntStream.range(0, matrix[0].length).filter(i -> base.equals(matrix[0][i])).findFirst().orElse(-1);
	}

	// Find term-coordinate
	private int findTermIndex(String[][] matrix, String term) {
		return IntStream.range(0, matrix[0].length).filter(i -> term.equals(matrix[i][0])).findFirst().orElse(-1);
	}

}
