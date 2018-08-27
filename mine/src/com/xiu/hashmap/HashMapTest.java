package com.xiu.hashmap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConcurrentHashMap;
//    	HashMap;
    	HashMap map = new HashMap();
    	map.put(null, "null:1");
    	map.put(null, "null:2");
    	map.put(null, null);
    	map.put("er", null);
    	System.out.println(map);
	}

}
