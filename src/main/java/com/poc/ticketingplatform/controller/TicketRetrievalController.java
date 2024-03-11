package com.poc.ticketingplatform.controller;
import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.service.TicketRetreivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketRetrievalController {

    @Autowired
    TicketRetreivalService ticketRetreivalService;

    @GetMapping("/")
    public List<Ticket> getTickets() {
        return ticketRetreivalService.getAllTickets();
    }



}
