package com.xiu.algorithm;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = -4;
//		public static String toBinary(int value) {  
	        StringBuilder build = new StringBuilder();  
	        for(int i = 31; i >= 0; i--) {  
	            build.append(value >> i & 1);// ��1�������֮�󣬸�λ��֮ǰ����ȫ���ɵ�  
	        }  
//	        return
	        System.out.println(build.toString());
	        		   
//	}  
	}

}
