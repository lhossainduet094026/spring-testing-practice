package com.example.demo.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@SpringBootTest
@ActiveProfiles("test")
public class UserServiceTest2 {

	@Autowired
	private UserService userService;
	
	@Test
	void testStore() {
		
		//arrange
		User user = new User();
		user.setId(1l);
		user.setName("lokman");
		
		//act
		boolean isStored = userService.store(user);
		
		//assert
		assertEquals(true, isStored);
	}
	
}
