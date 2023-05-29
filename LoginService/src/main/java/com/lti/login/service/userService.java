package com.lti.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.login.model.User;
import com.lti.login.repository.userRepository;


@Service
public class userService {
	
	@Autowired
	private userRepository uRepository;
	
	public User username (String username){
		return this.uRepository.findByusername(username);
	}
	
	public User password (String password){
		return this.uRepository.findBypassword(password);
	}

	public User add(User user) {
		
		return this.uRepository.save(user);
	}
	

}
