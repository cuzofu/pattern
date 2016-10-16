package com.cuzofu.pattern.abstractfactory;

/**
 * 抽象工厂模式
 * 
 * @author cuzofu
 *
 */
public abstract class AbstractFactory {

	abstract Color getColor(String color);

	abstract Shape getShape(String shape);

}
