package com.cuzofu.pattern.builder.impl;

import com.cuzofu.pattern.builder.abs.Burger;

public class VegBurger extends Burger {

	public String name() {
		return "Veg Burge";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
