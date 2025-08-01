package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
@Primary
@Profile("test")
public class FakeUserRepository implements UserRepository {

	private final Map<Long, User> map = new HashMap<>();
	
	@Override
	public User findById(Long id) {
		return null;
	}

	@Override
	public boolean store(User user) {
		map.put(user.getId(), user);
		return true;
	}

}
