package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserRegistrationService {

	private final UserEmailSenderService userEmailSenderService;

	@Autowired
	public UserRegistrationService(UserEmailSenderService userEmailSenderService) {
		this.userEmailSenderService = userEmailSenderService;
	}

	public String registerUser(String email) {
		System.out.println("user registration successful");
		return userEmailSenderService.sendEmail(email);
	}
}
