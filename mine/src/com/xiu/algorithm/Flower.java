package com.xiu.algorithm;

public class Flower {

	public static void main(String[] args) {
		for(int i=100; i<1000; i++){
			int hund = i/100;	//°Ù
			int ten = (i/10)%10; //Ê®
			int ge = i%10;		//¸ö
//			if((Math.pow(hund, 3.0)+Math.pow(ten, 3.0)+Math.pow(ge, 3.0))==i){
//				System.out.println(i);
//			}
			if(hund*hund*hund + ten*ten*ten + ge*ge*ge == i) {
				System.out.println(i);
			}
		}
	}

}
