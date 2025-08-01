package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@org.springframework.stereotype.Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findUserById(Long id) {
		return userRepository.findById(id);
	}

	public boolean store(User user) {
		return userRepository.store(user);
	}
}
