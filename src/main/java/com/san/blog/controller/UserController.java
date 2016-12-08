package com.san.blog.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.san.blog.model.User;
import com.san.blog.service.UserService;

@Controller
public class UserController {
 
    private Logger logger = Logger.getLogger(UserController.class);
 
    @Autowired
    private UserService userService;
 
    /*
     *  http://localhost:8080/getUserInfo
     */
 
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }
}