package com.xiu.algorithm;

public class CommonDevisor {

	public static void main(String[] args) {
		int m = 6, n = 4;
//		int res = 1;
		int d = m == n ? m : n;
		for(int i = d;i >= 2 ; i--){
			if( m % i == 0 && n % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
