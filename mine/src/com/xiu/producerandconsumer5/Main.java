package com.xiu.producerandconsumer5;

public class Main {

	public static void main(String[] args) {
		Plate plate = new Plate();
		for(int i = 0;i < 10;i ++){
			new Thread(new Producer(plate)).start();
		}
		for(int i = 0;i < 10;i ++){
			new Thread(new Consumer(plate)).start();
		}
	}

}
