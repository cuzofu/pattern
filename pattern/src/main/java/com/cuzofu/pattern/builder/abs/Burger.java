package com.cuzofu.pattern.builder.abs;

import com.cuzofu.pattern.builder.impl.Wrapper;

public abstract class Burger implements Item {

	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();

}
