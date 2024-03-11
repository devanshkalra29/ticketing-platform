package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.Event;
import com.poc.ticketingplatform.repository.EventRepository;

import java.util.List;

public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        List<Event> events = eventRepository.findAll();

        return events;
    }
}
