package com.lti.login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lti.login.model.User;


@Repository
public interface userRepository extends CrudRepository<User, Integer> {

	public User findByusername(String username);
	public User findBypassword(String password);
	
}
