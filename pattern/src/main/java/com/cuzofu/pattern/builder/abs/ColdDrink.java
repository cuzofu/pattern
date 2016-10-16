package com.cuzofu.pattern.builder.abs;

import com.cuzofu.pattern.builder.impl.Bottle;

public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();

}
