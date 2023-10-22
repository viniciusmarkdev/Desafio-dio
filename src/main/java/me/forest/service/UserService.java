package me.forest.service;

import me.forest.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User UserToCreated );
}
