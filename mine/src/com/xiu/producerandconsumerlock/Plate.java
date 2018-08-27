package com.xiu.producerandconsumerlock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Plate {
	private List<Object> objects = new ArrayList<Object>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition notFull = lock.newCondition();//put
	private Condition notEmpty = lock.newCondition();//take
	int index = 0;
	
	public void put(Object obj) {
		lock.lock();
		try {
			while(objects.size()==5){ 
				try {
					notFull.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			objects.add(obj);
			if(++index == 5){
				index = 0;
			}
			System.out.println("放入第"+(objects.size()-1)+"个鸡蛋,size："+objects.size());
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public Object take(){
		lock.lock();
		try {
			while(objects.size()==0){
				try {
					notEmpty.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Object ret = objects.remove(index);
			if(index!=0){
				index--;
			}
			System.out.println("取出第"+(objects.size())+"个鸡蛋,size："+objects.size());
			notFull.signalAll();
			return ret;
		} finally {
			lock.unlock();
		}
	}
	
}
