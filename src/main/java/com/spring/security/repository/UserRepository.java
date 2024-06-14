package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	public UserEntity findByUsername(String username);

}
