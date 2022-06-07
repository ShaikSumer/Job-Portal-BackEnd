package com.abc.jobportal.repository;

import java.util.List;


import javax.persistence.EntityManager;
import org.hibernate.Query;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;



public class CustomUserRepositoryImpl implements CustomUserRepository {
	
	@Autowired
	EntityManager jpa;

	@Override
	public String verifyUser(String username, String password) {
		Session spring = jpa.unwrap(Session.class);
		
		String query = "select role from User u where Username =:enteredUsername and Password =:enteredPassword";
		
		Query<String> q = spring.createQuery(query);
		q.setParameter("enteredUsername", username);
		q.setParameter("enteredPassword", password);
		
		List<String> output =  q.getResultList();
		System.out.println(output);
		if(output.size()!=0) {
		return output.get(0); 
		}
		else
		{
			return null;
		}
	}

}
