package com.poc.ticketingplatform.controller;
import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketRetreivalService;

    @GetMapping("/allTickets")
    public List<Ticket> getTickets() {
        return ticketRetreivalService.getAllTickets();
    }

}
