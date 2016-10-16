package com.cuzofu.pattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取Circle的对象，并调用它的draw()方法
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		// 获取Rectangle的对象，并调用它的draw()方法
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();

		// 获取Square的对象，并调用它的draw()方法
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

	}

}
