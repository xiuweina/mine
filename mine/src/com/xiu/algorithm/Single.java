package com.xiu.algorithm;

public class Single {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3,4};
		int single = arr[0];
		for(int i = 1;i < arr.length; i++) {
			single ^= arr[i];
		}
		System.out.println(single);
	}

}
