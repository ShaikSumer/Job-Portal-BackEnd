package com.abc.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.jobportal.exceptions.InvalidUserException;
import com.abc.jobportal.repository.UserRepository;

@Service
public class UserserviceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public String login(String username, String password)throws InvalidUserException {

		String role = userRepository.verifyUser(username, password);
		if(role == null) {
			throw new InvalidUserException(username,password);
		}
		
		return role;
	}
	

}
