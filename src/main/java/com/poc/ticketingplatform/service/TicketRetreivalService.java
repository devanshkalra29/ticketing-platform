package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketRetreivalService {


    TicketRepository ticketRepository;

    public TicketRetreivalService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket>getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();

        return tickets;
    }


}
