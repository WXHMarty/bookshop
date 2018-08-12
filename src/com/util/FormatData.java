package com.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ����
 */
public class FormatData {

	//���ɵ�¼���µ�ʱ��(��ȷ������)
	public static String nowmTime(){
		SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = new Date();
		String time = adf.format(date);
		return time;
	}
	
	//����ע��ʱ��(��ȷ����)
	public static String nowTime(){
		SimpleDateFormat adf = new SimpleDateFormat("yyyy��MM��dd��");
		Date date = new Date();
		String time = adf.format(date);
		return time;
	}
	
	//����һλС������
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
