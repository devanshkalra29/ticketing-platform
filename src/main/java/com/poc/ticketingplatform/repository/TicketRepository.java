package com.poc.ticketingplatform.repository;

import com.poc.ticketingplatform.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<Ticket, UUID> {
}
