package com.xiu.producerandconsumerlock;

public class Main {

	public static void main(String[] args) {
		final String LOAN ;
		LOAN = new String("loan"); //invalid compilation error
		
		Plate plate = new Plate();
		for(int i = 0;i < 10;i ++){
			new Thread(new Producer(plate)).start();
		}
		for(int i = 0;i < 10;i ++){
			new Thread(new Consumer(plate)).start();
		}
	}

}
