package com.poc.ticketingplatform.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRetrievalController {

    @GetMapping("/getTicket")
    public String getTicket() {
        return "Hello world";
    }

}
