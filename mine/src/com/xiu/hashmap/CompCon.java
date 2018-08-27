package com.xiu.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CompCon {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("1", "1");
		map.put("2", "1");
		map.put("3", "1");
		map.put("4", "1");
		map.put("5", "1");
		map.put("6", "1");
		System.out.println("concurrent before : " + map.toString());
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			if("3".equals(it.next())){
				map.put("new3", "3");
			}
		}
		System.out.println("concurrent after  : " + map.toString());
		
		map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "1");
		map.put("3", "1");
		map.put("4", "1");
		map.put("5", "1");
		map.put("6", "1");
		System.out.println("hashMap before : " + map.toString());
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			if("3".equals(key)){
				map.put(key, "333");
//				break;
			}
		}
		System.out.println("hashMap after  : " + map.toString());
	}

}
