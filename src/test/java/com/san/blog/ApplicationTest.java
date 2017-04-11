package com.san.blog;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.san.blog.model.User;
import com.san.blog.service.UserService;

/**
 * @author zombie
 * @version 创建时间：2016年12月20日 下午2:27:25 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Before
	public void setUp(){
		userService.deleteAllUser();
	}
	
	@Test
	public void test(){
		String sql = "select * from user";
		User user1 = new User();
		user1.setAge(1);
		user1.setName("zhangsan");
		user1.setPassword("1111");
		userService.saveUser(user1);
		User user2 = new User();
		user2.setAge(1);
		user2.setName("lisi");
		user2.setPassword("1111");
		userService.saveUser(user2);
		List<User> list = jdbcTemplate.queryForList(sql, User.class);
		System.out.println(list.get(0));
	}
}
