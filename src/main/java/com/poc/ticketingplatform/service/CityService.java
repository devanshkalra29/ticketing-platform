package com.poc.ticketingplatform.service;

import com.poc.ticketingplatform.model.City;
import com.poc.ticketingplatform.model.Ticket;
import com.poc.ticketingplatform.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        List<City> cities = cityRepository.findAll();

        return cities;
    }
}
