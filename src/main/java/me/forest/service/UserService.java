package me.forest.service;

import java.util.List;

import me.forest.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User UserToCreated );
	
	List<User> findAll();
}
