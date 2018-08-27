package com.xiu.ProducerConsumer;

public class Producer implements Runnable{
	private Plate plate;
	Object egg = new Object();
	public Producer(Plate plateo){
		plate = plateo;
	}
	
	@Override
	public void run() {
		plate.putEgg(egg);
	}

}
