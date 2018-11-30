package com.xiu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest extends Thread{

	public static void main(String[] args) {
		Date d = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);

		String s1 = "2018-04-10 10:57:58";
		try {
			Date d1 = sdf.parse(s1);
			System.out.println(System.currentTimeMillis() - d1.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
