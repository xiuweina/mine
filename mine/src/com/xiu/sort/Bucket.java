package com.xiu.sort;

public class Bucket {
	public static int[] array = new int[11];
	
	public static void printArr(String state, int[] me) {
		System.out.print(state);
		for(int i = 0; i < me.length; i ++) {
			System.out.print(me[i] + ",");
		}
		System.out.println();
	}

	public static void sort(int[] me) {
		for(int i = 0; i < me.length; i ++) {
			array[me[i]] ++;
		}
		for(int i = 0; i <= 10; i++) {
			for(int j = 1; j <= array[i]; j ++){
				System.out.print(i + ",");
			}
		}
		System.out.println();
		for(int i = 10; i >= 0; i--){
			for(int j = 1; j <= array[i]; j ++){
				System.out.print(i + ",");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {5, 3, 5, 2, 8};
		printArr("before:", a);
		sort(a);
//		printArr("after:", a);
	}

}
