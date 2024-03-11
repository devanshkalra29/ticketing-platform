package com.poc.ticketingplatform.repository;

import com.poc.ticketingplatform.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VenueRepository extends JpaRepository<Venue, UUID> {
}
