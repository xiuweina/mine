package com.xiu.algorithm;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = -4;
//		public static String toBinary(int value) {  
	        StringBuilder build = new StringBuilder();  
	        for(int i = 31; i >= 0; i--) {  
	            build.append(value >> i & 1);// 和1做与操作之后，该位置之前的数全部干掉  
	        }  
//	        return
	        System.out.println(build.toString());
	        		   
//	}  
	}

}
