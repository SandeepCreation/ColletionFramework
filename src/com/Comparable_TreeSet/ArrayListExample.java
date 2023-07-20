package com.Comparable_TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
	public int compare(Integer i1, Integer i2) {
		if(i1>i2) { return -1; }
		else if(i1<i2) { return +1; }
		else return 0;
	}
}


public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(40);
		Collections.sort(al,new MyComparator());
		System.out.println(al);
	}
}
