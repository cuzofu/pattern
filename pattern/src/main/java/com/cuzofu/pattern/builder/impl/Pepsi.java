package com.cuzofu.pattern.builder.impl;

import com.cuzofu.pattern.builder.abs.ColdDrink;

public class Pepsi extends ColdDrink {

	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
