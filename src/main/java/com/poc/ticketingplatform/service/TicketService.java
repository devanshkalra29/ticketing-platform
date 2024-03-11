package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {


    private TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket>getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();

        return tickets;
    }


}
