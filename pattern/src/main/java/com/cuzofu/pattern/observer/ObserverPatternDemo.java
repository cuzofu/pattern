package com.cuzofu.pattern.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

		Observer hexaObserver = new HexaObserver(subject);
		Observer octalObserver = new OctalObserver(subject);
		Observer binaryObserver = new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		hexaObserver.update();
		octalObserver.update();
		binaryObserver.update();
		System.out.println("Second state change: 10");
		subject.setState(10);
		hexaObserver.update();
		octalObserver.update();
		binaryObserver.update();
	}

}
