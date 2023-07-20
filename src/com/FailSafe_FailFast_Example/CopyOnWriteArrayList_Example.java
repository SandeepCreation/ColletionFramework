package com.FailSafe_FailFast_Example;

import java.util.ArrayList;
import java.util.Iterator;

public class CopyOnWriteArrayList_Example {
	public static void main(String[] args) {

//		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
		ArrayList<String> al = new ArrayList<String>();
		al.add("pankaj");
		al.add("ramesh");
		al.add("kam");
		al.add("sampat");
		al.add("ganpat");

		System.out.println(al.size());

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
//			System.out.println(al);
			if (str.equals("kam")) {
				al.remove("kam");
			}
			if (str.equals("sampat")) {
				al.add("sandeep");
			}

		}
		System.out.println(al);

	}

}
