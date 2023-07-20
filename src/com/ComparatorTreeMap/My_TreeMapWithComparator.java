package com.ComparatorTreeMap;

import java.util.Comparator;

public class My_TreeMapWithComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();

		Integer i1 = s1.length();
		Integer i2 = s2.length();

		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;
		} else
			return s1.compareTo(s2);
	}

//	@Override
//	public int compare(StringBuffer o1, StringBuffer o2) {
//		return o2.compareTo(o1);
//	}

//	@Override
//	public int compare(Integer o1, Integer o2) {
//		Integer i1 = (Integer) o1;
//		Integer i2 = (Integer) o2;
//		return i2.compareTo(i1);
//	}

}
