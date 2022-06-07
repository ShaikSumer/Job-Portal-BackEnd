package com.abc.jobportal.repository;
import com.abc.jobportal.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  JpaRepository<User,Integer>,CustomUserRepository{
		
}
