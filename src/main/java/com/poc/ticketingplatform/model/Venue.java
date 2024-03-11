package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "venues")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false)
    private UUID venueId;
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

    public UUID getVenueId() {
        return venueId;
    }

    public void setVenueId(UUID venueId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venue venue = (Venue) o;
        return venueId == venue.venueId && Objects.equals(city, venue.city) && Objects.equals(name, venue.name) && Objects.equals(address, venue.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueId, city, name, address);
    }
}
