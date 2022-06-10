package com.javatech.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.learning.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
