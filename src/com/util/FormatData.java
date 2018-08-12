package com.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生成时间类
 */
public class FormatData {

	//生成登录、下单时间(精确到分钟)
	public static String nowmTime(){
		SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date();
		String time = adf.format(date);
		return time;
	}
	
	//生成注册时间(精确到天)
	public static String nowTime(){
		SimpleDateFormat adf = new SimpleDateFormat("yyyy年MM月dd日");
		Date date = new Date();
		String time = adf.format(date);
		return time;
	}
	
	//生成一位小数数字
	public static String price(double p){
		DecimalFormat df = new DecimalFormat("0.0");
		String num = df.format(p);
		return num;
	}
	
	public static void main(String[] args) {
//		System.out.println(FormatData.nowmTime());
//		System.out.println(FormatData.nowTime());
		System.out.println(FormatData.price(255.258));
		
	}
}
