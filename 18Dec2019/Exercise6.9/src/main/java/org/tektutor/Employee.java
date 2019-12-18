package org.tektutor;

public class Employee {

	private int empId;
	private String name;
	private String title;
	private String dept;

	public Employee ( int empId, String name, String title, String dept ) {
		this.empId = empId;
		this.name  = name;
		this.title = title;
		this.dept  = dept;
	}

	public void print() {
		System.out.println ("Employee ID : " + empId );
		System.out.println ("Name        : " + name  );
		System.out.println ("Title       : " + title );
		System.out.println ("Department  : " + dept  );
	}

}
	
