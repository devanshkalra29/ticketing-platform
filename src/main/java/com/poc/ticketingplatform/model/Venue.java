package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "venues")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long venueId;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @Column(name = "venue_name")
    private String name;

    private String address;

    public Venue() {

    }

    public Venue(City city, String name, String address) {
        this.city = city;
        this.name = name;
        this.address =address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
