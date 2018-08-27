package com.xiu.ProducerConsumer;

public class Consumer implements Runnable{
	private Plate plate;
	public Consumer(Plate plateo) {
		plate = plateo;
	}
	@Override
	public void run() {
		plate.getEgg();
	}
}
