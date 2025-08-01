package com.example.demo.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private UserRepository userRepository;// this is stub
	
	@InjectMocks
	private UserService userService;
	
	@Test
	void testUserWithName() {
		
		//arrange
		User stubUser = new User();
		stubUser.setId(1l);
		stubUser.setName("lokman");
	
		when(userRepository.findById(1l)).thenReturn(stubUser);// stubbed method
	
		//act
		User result = userService.findUserById(1l);
		
		//assert
		assertEquals("lokman", result.getName());
		
		System.out.println(result.getName());
	}
}
