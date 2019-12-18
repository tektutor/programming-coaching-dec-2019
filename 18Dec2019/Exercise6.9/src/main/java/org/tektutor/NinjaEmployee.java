package org.tektutor;

public class NinjaEmployee /*extends Employee*/ implements INinjaEmployee {

	private Employee employee;
	private Ninja ninja;

	public NinjaEmployee(int empId, String name, String title, String dept, String belt ) {
		//super ( empId, name, title, dept );
		employee = new Employee ( empId, name, title, dept );
		ninja = new Ninja( belt );
	}

	public void print() {
		//super.print();
		employee.print();
		ninja.print();
	}

}
