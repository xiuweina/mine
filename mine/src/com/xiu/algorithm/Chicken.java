package com.xiu.algorithm;

public class Chicken {

	public static void main(String[] args) {
//		for(int i = 0; i <= 33; i ++){
//			for(int j = 0; j <= 100 - i; j ++) {
//				for(int k = 0; k <= 100 - i - j; k ++) {
//					if((i + j + k) == 100 && (i*3 + j*4 + k*0.5) == 100) {
//						System.out.println("母鸡："+i+"公鸡"+j+"小鸡"+k);
//					}
//				}
//			}
//		}
		for(int i = 0;i <= 100;i++){ //母鸡数量  
		    for(int j = 0;j <= 100;j++){ //公鸡数量  
		        for(int k = 0;k <= 100;k++){ //小鸡数量  
		            //判断数量是否为100，以及金额是否为100  
		            if((i +j + k == 100) && (i * 3 + j * 4 + k * 0.5 == 100)){  
		                System.out.println("母鸡数量：" + i + "公鸡数量：" + j + " 小鸡数量" + k);  
		            }  
		        }  
		     }  
		}  
	}

}
