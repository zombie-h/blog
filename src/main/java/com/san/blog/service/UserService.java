package com.san.blog.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.blog.mapper.UserMapper;
import com.san.blog.model.User;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}