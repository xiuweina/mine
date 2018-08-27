package com.xiu.producerandconsumer5;

public class Producer implements Runnable{
	private Plate plate;
	public Producer(Plate plate){
		this.plate = plate;
	}
	
	@Override
	public void run() {
		Object obj = new Object();
		plate.put(obj);
	}
	
}
