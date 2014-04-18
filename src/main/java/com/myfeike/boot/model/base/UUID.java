package com.myfeike.boot.model.base;

/**
 * uuid 生成工具
 * 
 * @author liyonghui
 * 
 * @version createtime:2014年3月18日上午10:28:10
 */
public class UUID {
	public static String random() {
		String id = java.util.UUID.randomUUID().toString();
		id = id.replaceAll("-", "");
		return id;
	}
}
