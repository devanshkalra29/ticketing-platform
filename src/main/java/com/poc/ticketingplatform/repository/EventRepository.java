package com.poc.ticketingplatform.repository;

import com.poc.ticketingplatform.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
