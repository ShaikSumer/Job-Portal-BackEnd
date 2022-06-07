package com.abc.jobportal.service;

import org.springframework.stereotype.Service;

import com.abc.jobportal.exceptions.InvalidUserException;

@Service
public interface UserService {
	public String login(String username,String password)throws InvalidUserException;


}
