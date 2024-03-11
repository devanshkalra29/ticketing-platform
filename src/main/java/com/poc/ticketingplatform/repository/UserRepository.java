package com.poc.ticketingplatform.repository;

import com.poc.ticketingplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
