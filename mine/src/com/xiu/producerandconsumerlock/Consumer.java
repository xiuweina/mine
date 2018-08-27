package com.xiu.producerandconsumerlock;

public class Consumer  implements Runnable{
	private Plate plate;
	public Consumer(Plate plate){
		this.plate = plate;
	}
	
	@Override
	public void run() {
		plate.take();
	}
}
