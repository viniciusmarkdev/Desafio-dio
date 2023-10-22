package me.forest.serviceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.forest.model.User;
import me.forest.repository.UserRepository;
import me.forest.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	

	
	
	private final UserRepository userRepository;
	
    public UserServiceImpl (UserRepository userRepository) {
		
		
		this.userRepository = userRepository;
			
	}
	

	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	
	
	}


	@Override
	public User create(User userToCreated) {
	
		
		
		return userRepository.save(userToCreated);
	}
    

	@Override
	public List<User> findAll() {
		
	      return userRepository.findAll();
	}


	

	
	
	
}
