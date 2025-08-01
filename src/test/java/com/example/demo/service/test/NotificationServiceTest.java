package com.example.demo.service.test;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.example.demo.service.EmailSender;
import com.example.demo.service.NotificationService;

public class NotificationServiceTest {

	@Test
	void testNotifyWithValidMessage() {
		EmailSender emailSender = mock(EmailSender.class);//dummy test
		NotificationService notificationService = new NotificationService(emailSender);
		notificationService.notify("Hello World");
	}
}
