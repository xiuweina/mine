package com.xiu.algorithm;

public class Chicken {

	public static void main(String[] args) {
//		for(int i = 0; i <= 33; i ++){
//			for(int j = 0; j <= 100 - i; j ++) {
//				for(int k = 0; k <= 100 - i - j; k ++) {
//					if((i + j + k) == 100 && (i*3 + j*4 + k*0.5) == 100) {
//						System.out.println("ĸ����"+i+"����"+j+"С��"+k);
//					}
//				}
//			}
//		}
		for(int i = 0;i <= 100;i++){ //ĸ������  
		    for(int j = 0;j <= 100;j++){ //��������  
		        for(int k = 0;k <= 100;k++){ //С������  
		            //�ж������Ƿ�Ϊ100���Լ�����Ƿ�Ϊ100  
		            if((i +j + k == 100) && (i * 3 + j * 4 + k * 0.5 == 100)){  
		                System.out.println("ĸ��������" + i + "����������" + j + " С������" + k);  
		            }  
		        }  
		     }  
		}  
	}

}
