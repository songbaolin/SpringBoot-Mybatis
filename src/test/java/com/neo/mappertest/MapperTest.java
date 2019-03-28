package com.neo.mappertest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.bean.User;
import com.neo.mapper.UserMapper;
import com.neo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

	@Autowired
	private   UserService userService;
	 
	
	
	
	
	
	
	@Test
	
	public  void select() {
		
	List<User>users=	userService.getAllMessage();
	  System.out.println(users);
	}
	   @Test
	public void add() {
		
		User user=new User();
		user.setNick_name("kangkang");
		user.setPassWord("12345");
		user.setUser_sex("boy");
		user.setUserName("JANE");
	  for(int i=0;i<=100;i++) {
		  userService.addMessage(user);
		  
	  }
	  
		
	}
}
