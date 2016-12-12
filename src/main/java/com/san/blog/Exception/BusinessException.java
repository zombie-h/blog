package com.san.blog.Exception;

import com.san.blog.common.ExceptionType;

public class BusinessException extends Exception{
	
	private static final long serialVersionUID = 396410320587302089L;

	private int code;

    private String message;

    private String url;
    
    public BusinessException(ExceptionType exceptionType) {
        this.code = exceptionType.getCode();
        this.message = exceptionType.getMessage();
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
}
