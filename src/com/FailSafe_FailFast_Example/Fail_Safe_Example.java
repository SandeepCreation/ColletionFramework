package com.FailSafe_FailFast_Example;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_Safe_Example {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		map.put("AAA", 111);
		map.put("BBB", 222);
		map.put("CCC", 333);
		
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> pair = itr.next();
			System.out.println(pair.getKey()+" "+pair.getValue());
			map.put("DDD", 444);
		}
	}

}
