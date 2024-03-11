package com.poc.ticketingplatform.repository;

import com.poc.ticketingplatform.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CityRepository extends JpaRepository<City, UUID> {
}
