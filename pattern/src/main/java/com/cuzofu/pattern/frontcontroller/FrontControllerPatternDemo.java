package com.cuzofu.pattern.frontcontroller;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatcherRequest("HOME");
		frontController.dispatcherRequest("STUDENT");
	}

}
