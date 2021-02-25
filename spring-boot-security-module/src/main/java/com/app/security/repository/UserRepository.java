package com.app.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.security.webencyp.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	 // return user 
	User findByUsername(String Username) ; 
}
