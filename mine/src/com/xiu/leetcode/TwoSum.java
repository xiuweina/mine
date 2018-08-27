package com.xiu.leetcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TwoSum {
	/**
	 * 1.两数之和
	 */
	public static int[] twoSum(int[] nums, int target) {
        for(int i= 0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
    	twoSum(new int[]{2,3,4},6);
    	String str = "2009-02-15 09:21:35.345";
    	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日hh点mm分ss秒");
    	Date date = null;
    	String str2 = "";
    	try {
    		date = sdf1.parse(str);
    		str2 = sdf2.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(str);
    	System.out.println(date);
    	System.out.println(str2);
	}
}
