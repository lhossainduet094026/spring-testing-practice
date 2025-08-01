package com.example.demo.service;

public class NotificationService {

	private EmailSender emailSender;

	public NotificationService(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public void notify(String message) {
		if (message == null)
			throw new IllegalArgumentException("Message is null");
	}
}
