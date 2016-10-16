package com.cuzofu.pattern.builder.impl;

import com.cuzofu.pattern.builder.abs.Burger;

public class ChickenBurger extends Burger {

	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
