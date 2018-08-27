package com.xiu.sort;

public class Bubble {
	
	public static void sort(int[] a) {
		for(int i = 0;i < a.length-1; i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
			}
		}
	}
	
	public static void printArr(String state, int[] me) {
		System.out.print(state);
		for(int i = 0; i < me.length; i ++) {
			System.out.print(me[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = {12,35,99,18,76};
		printArr("before:", a);
		sort(a);
		printArr("after:", a);
	}

}
