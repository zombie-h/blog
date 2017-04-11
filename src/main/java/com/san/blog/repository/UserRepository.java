package com.san.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.san.blog.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByName(String name);
	
	@Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
