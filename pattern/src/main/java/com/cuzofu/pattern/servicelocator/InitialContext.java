package com.cuzofu.pattern.servicelocator;

public class InitialContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE1")) {
			System.out.println("Looking up and creating a new Service1 Object");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE2")) {
			System.out.println("Looking up and creating a new Service2 Object");
			return new Service2();
		} else {
			return null;
		}
	}

}
