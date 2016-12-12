package com.san.blog.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.blog.model.User;
import com.san.blog.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getUserInfo(String name) {
		return userRepository.findByName(name);
	}
	
}