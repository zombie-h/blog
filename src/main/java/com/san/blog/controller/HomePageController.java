package com.san.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author san
 * @version 创建时间：2016年12月12日 下午10:42:34 
 */

@Controller
public class HomePageController {
	
	@RequestMapping(value = "/")
	public String index(){
		return "/index";
	}
}
