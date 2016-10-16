package com.cuzofu.pattern.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee ceo = new Employee("John", "CEO", 30000);

		Employee topSales = new Employee("Robert", "Top Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		ceo.addEmployee(topSales);
		ceo.addEmployee(headMarketing);

		topSales.addEmployee(salesExecutive1);
		topSales.addEmployee(salesExecutive2);

		headMarketing.addEmployee(clerk1);
		headMarketing.addEmployee(clerk2);

		System.out.println(ceo + "\n");
		for (Employee employee : ceo.getSubordinates()) {
			System.out.println(employee);
			for (Employee emp : employee.getSubordinates()) {
				System.out.println(emp);
			}
			System.out.println("\n");
		}
	}

}
