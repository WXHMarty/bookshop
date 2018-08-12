package com.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 密码加密类
 */
public class Encrypt {
	public static String md5encrypt(String password) throws NoSuchAlgorithmException {
		//获取MessageDigest对象
		MessageDigest md = MessageDigest.getInstance("MD5");
		//update加密
		md.update(password.getBytes(), 0, password.length());
		//用BigInteger接收
		BigInteger bi = new BigInteger(1, md.digest());
		//转换成字符串
		String pw = bi.toString(16);
		return pw;
	}
	
}
