package com.xiu.algorithm;

public class Bottle {

	public static void main(String[] args) {
		int empty = 0;
		int drink = 0;
		int bottle = 1000;
		while(bottle > 0) {
			drink+=bottle;
			empty+=bottle;
			bottle=empty/3;
			empty = empty%3;
		}
		System.out.println(drink);
		System.out.println(bottle);
		System.out.println(empty);
	}

}
