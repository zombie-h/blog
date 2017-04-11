package com.san.blog.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.san.blog.model.User;
import com.san.blog.repository.UserRepository;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User getUserInfo(String name) {
		return userRepository.findByName(name);
	}
	
	public void deleteAllUser(){
		userRepository.deleteAll();
	}
	
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
}