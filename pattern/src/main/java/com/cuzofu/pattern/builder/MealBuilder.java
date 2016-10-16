package com.cuzofu.pattern.builder;

import com.cuzofu.pattern.builder.impl.ChickenBurger;
import com.cuzofu.pattern.builder.impl.Coke;
import com.cuzofu.pattern.builder.impl.Pepsi;
import com.cuzofu.pattern.builder.impl.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
