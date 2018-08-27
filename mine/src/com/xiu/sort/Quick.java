package com.xiu.sort;

public class Quick {
	
	public static void quickSort(int[] me,int i, int j){
		if ( i >= j ) {
			return ;
		}
		int left = i,right = j;
		int base = me[i];

		while (i != j) {
			while(me[j] >= base && i < j) {
				j --;
			}
			while(me[i] <= base && i < j) {
				i ++;
			}
			if(i!=j){
				int t = me[j];
				me[j] = me [i];
				me[i] = t;
			}
		}
		int t = me[j];
		me[j] = me[left];
		me[left] = t;
		quickSort(me,left,j-1);
		quickSort(me,j+1,right);
	}
	
	public static void main(String[] args) {
		int[] a = {6, 1, 2, 7, 9, 3, 4, 5, 3, 10, 8};
		printArr("before:",a);
		quickSort(a,0,a.length-1);
		printArr("after :",a);
	}
	
	public static void printArr(String state, int[] me) {
		System.out.print(state);
		for(int i = 0; i < me.length; i ++) {
			System.out.print(me[i] + ",");
		}
		System.out.println();
	}
}
