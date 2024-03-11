package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.Venue;
import com.poc.ticketingplatform.repository.VenueRepository;

import java.util.List;

public class VenueService {

    private VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public List<Venue> getAllVenues() {
        List<Venue> venues = venueRepository.findAll();

        return venues;
    }
}
