package com.ComparatorTreeMap;

import java.util.TreeSet;

public class TreeMapWithComparator {

	public static void main(String[] args) {

		TreeSet<Object> t1 = new TreeSet<Object>(new My_TreeMapWithComparator());
//		t1.add("pankaj");
//		t1.add("rahul");
//		t1.add("sandeep");
//		t1.add("dadu");
//		t1.add("ankit");
//		System.out.println(t1);

//		t1.add(10);
//		t1.add(33);
//		t1.add(77);
//		t1.add(700);
//		t1.add(22);
//		System.out.println(t1);

		t1.add(new StringBuffer("abc"));
		t1.add(new StringBuffer("cd"));
		t1.add("d");
		t1.add("yyyy");
		t1.add(new StringBuffer("z"));
		System.out.println(t1);
	}
}
