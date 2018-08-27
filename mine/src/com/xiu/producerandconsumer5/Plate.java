package com.xiu.producerandconsumer5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Plate {
	
	private List<Object> objects = new ArrayList<Object>();
	private BlockingQueue<Object> eggs = new ArrayBlockingQueue<Object>(5); 
	
	public synchronized Object take(){
		while(objects.size() == 0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Object obj = objects.remove(objects.size()-1);
		System.out.println("取出第"+(objects.size())+"个鸡蛋,size："+objects.size());
		notifyAll();
		return obj;
	}
	public synchronized void put(Object object){
		while(objects.size() == 5){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		objects.add(objects.size(), object);
		System.out.println("放入第"+(objects.size()-1)+"个鸡蛋,size："+objects.size());
		notifyAll();
	}
	
}
