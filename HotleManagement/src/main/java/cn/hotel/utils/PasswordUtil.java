package cn.hotel.utils;

import org.apache.shiro.crypto.hash.Md5Hash;


public class PasswordUtil {


	/**
	 * 加密
	 * @param str	旧密码
	 * @param salt	佐料
	 * @param count	加密次数
	 * @return
	 */
	public static String md5(String str,String salt,int count){
		return new Md5Hash(str,salt,count).toString();
	}
	
	public static void main(String[] args) {

		String password = "123";
		System.out.println(PasswordUtil.md5(password,"linguanghui",5));
	}
}
