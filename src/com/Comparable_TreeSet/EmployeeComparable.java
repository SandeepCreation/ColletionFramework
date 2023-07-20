package com.Comparable_TreeSet;

import java.util.TreeSet;

public class EmployeeComparable {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "aa");
		Employee e2 = new Employee(55, "xx");
		Employee e3 = new Employee(16, "ee");
		Employee e4 = new Employee(13, "tt");
		Employee e5 = new Employee(91, "ss");

		TreeSet<Employee> t = new TreeSet<Employee>(new MyEmpComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		System.out.println(t);

	}

}
