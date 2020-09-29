package com.algo.enums;

import java.util.Arrays;
import java.util.Optional;

public enum CROSSVIA {

	DIRECT("D"), INVERTED("Inv"), UNITY("1:1"), USD("USD"), EUR("EUR");

	String via;

	CROSSVIA(String via) {
		this.via = via;
	}

	public String getVia() {
		return via;
	}

	public static final Optional<CROSSVIA> getByValue(String value){
	    return Arrays.stream(CROSSVIA.values()).filter(x -> x.via.equals(value)).findFirst();
	}
}
