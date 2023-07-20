package com.Comparable_TreeSet;

public class Employee implements Comparable<Object> {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int id1 = this.id;
		Employee e = (Employee) o;
		int id2 = e.id;
		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return 1;
		} else
			return 0;
	}

}
