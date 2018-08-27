package com.xiu;

public class Print {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*n-1-2*i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
