package com.poc.ticketingplatform.repository;

import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    User findByEmail(String email);
}
