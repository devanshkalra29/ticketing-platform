package com.poc.ticketingplatform.controller;
import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketRetreivalService;

    @GetMapping("/allTickets")
    public List<Ticket> getTickets() {
        return ticketRetreivalService.getAllTickets();
    }

    @GetMapping("/")
    public String sayHello(Model model, @ AuthenticationPrincipal OidcUser oidcUser) {
        return "Hello: user";
    }

    @GetMapping("/test")
    public String test() {
        return "authenticated!";
    }

    @GetMapping("/logout")
    public String logout() {
        callLogout();
        return "you are logged out";
    }

    private void callLogout() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://localhost:8080/logout");

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.POST,
                entity,
                String.class
        );
    }

    @GetMapping("/whoami")
    public String callback(@AuthenticationPrincipal OidcUser oidcUser) {
        if(oidcUser != null) {
            return "You are: " + oidcUser.getFullName();
        } else {
            return "You are not logged in";
        }
    }

}
