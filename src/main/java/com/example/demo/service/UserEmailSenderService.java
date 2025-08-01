package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserEmailSenderService {

	public String sendEmail(String email) {
		return "email sent to "+ email;
	}
}
