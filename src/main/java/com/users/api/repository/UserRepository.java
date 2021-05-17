package com.users.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.users.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
