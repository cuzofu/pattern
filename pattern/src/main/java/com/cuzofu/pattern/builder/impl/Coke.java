package com.cuzofu.pattern.builder.impl;

import com.cuzofu.pattern.builder.abs.ColdDrink;

public class Coke extends ColdDrink {

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
