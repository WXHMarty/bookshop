package com.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ���������
 */
public class Encrypt {
	public static String md5encrypt(String password) throws NoSuchAlgorithmException {
		//��ȡMessageDigest����
		MessageDigest md = MessageDigest.getInstance("MD5");
		//update����
		md.update(password.getBytes(), 0, password.length());
		//��BigInteger����
		BigInteger bi = new BigInteger(1, md.digest());
		//ת�����ַ���
		String pw = bi.toString(16);
		return pw;
	}
	
}
