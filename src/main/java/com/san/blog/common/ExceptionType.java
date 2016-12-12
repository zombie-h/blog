package com.san.blog.common;

/**
 * 
 * @author san
 * @version 创建时间：2016年12月12日 下午7:52:01
 */
public enum ExceptionType {

	LOGION_ERROR(401, "请先登录");

	private int code;

	private String message;

	ExceptionType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
