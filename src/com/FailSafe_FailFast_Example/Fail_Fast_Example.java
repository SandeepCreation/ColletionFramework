package com.FailSafe_FailFast_Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Fail_Fast_Example {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("AAA", 111);
		map.put("BBB", 222);
		map.put("CCC", 333);

		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) itr.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
			map.put("DDD", 444);
		}

	}

}
