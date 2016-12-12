package com.san.blog.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.san.blog.Exception.BusinessException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = BusinessException.class)
    @ResponseBody
	public BusinessException exceptionHandler(HttpServletRequest req, BusinessException e){
		e.setUrl(req.getRequestURL().toString());
		return e;
	}
}
