package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

@Entity
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long venueId;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    private String name;

    public Venue(City city, String name) {
        this.city = city;
        this.name = name;
    }

    public long getVenueId() {
        return venueId;
    }

    public void setVenueId(long venueId) {
        this.venueId = venueId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", city=" + city +
                ", name='" + name + '\'' +
                '}';
    }
}
