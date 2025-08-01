package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Override
	public User findById(Long id) {

		User user = new User();
		user.setId(1l);
		user.setName("lokman");

		return user;
	}

	@Override
	public boolean store(User user) {
		return true;
	}

}
