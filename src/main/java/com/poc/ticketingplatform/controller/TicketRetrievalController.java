package com.poc.ticketingplatform.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRetrievalController {

    @GetMapping("/getTickets")
    public String getTicket() {
        return "Hello world";
    }

}
