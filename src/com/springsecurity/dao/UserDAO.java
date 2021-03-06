package com.springsecurity.dao;

import java.util.List;

import com.springsecurity.entities.User;

public interface UserDAO {
	List<User> findAll();

	void save(User user);

	void update(User user);

	void remove(User user);

	User getById(Long id);
	
	User login(String username, String password);
}
