package com.example.demo.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.service.UserEmailSenderService;
import com.example.demo.service.UserRegistrationService;

@ExtendWith(MockitoExtension.class)
public class UserRegistrationserviceTest {

	@InjectMocks
	private UserRegistrationService userRegistrationService;
	
	@Spy
	private UserEmailSenderService emailSenderService;
	
	@Test
	void testRegisterUser() {

		//arrange
		doReturn("email sent").when(emailSenderService).sendEmail("lokman@gmail.com");
		
		//act
		String result = userRegistrationService.registerUser("lokman@gmail.com");
		
		//assert
		verify(emailSenderService).sendEmail("lokman@gmail.com");
	    assertEquals("email sent", result);
	}
}
