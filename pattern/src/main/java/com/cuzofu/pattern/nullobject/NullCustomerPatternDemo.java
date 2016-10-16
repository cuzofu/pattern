package com.cuzofu.pattern.nullobject;

public class NullCustomerPatternDemo {

	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Robert");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
		AbstractCustomer customer5 = CustomerFactory.getCustomer("LiDan");

		System.out.println("Customers:");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
		System.out.println(customer5.getName());

	}

}
