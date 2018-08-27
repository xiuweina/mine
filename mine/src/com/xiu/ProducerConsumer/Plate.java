package com.xiu.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Plate {
	List<Object> eggs = new ArrayList<Object>();
	private String str="";
	public synchronized void putEgg(Object obj) {
		while(eggs.size() > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		eggs.add(obj);
		notify();
		System.out.println("putOneEgg");
	}
	public synchronized Object getEgg() {
		while(eggs.size() == 0 ){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Object o = eggs.get(0);
		eggs.clear();
		notify();
		System.out.println("getOneEgg");
		return o;
	}
	
}
