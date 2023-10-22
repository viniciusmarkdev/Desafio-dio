package me.forest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.forest.model.User;


public interface UserRepository extends JpaRepository<User,Long> {
	
	
}
