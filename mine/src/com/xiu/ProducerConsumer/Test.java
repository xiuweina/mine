package com.xiu.ProducerConsumer;

public class Test {

	public static void main(String[] args) {
		Plate plate = new Plate();
	
		for(int i=0;i<10;i++){
			new Thread(new Producer(plate)).start();
			new Thread(new Consumer(plate)).start();
		}
	}

}
