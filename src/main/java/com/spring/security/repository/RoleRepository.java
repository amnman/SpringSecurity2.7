package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.entity.RoleEntity;


public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

}
