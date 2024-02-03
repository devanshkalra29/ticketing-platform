package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateTime;
    @ManyToOne
    @JoinColumn(name="venue_id")
    private Venue venue;

    public Event(long id, String name, String description, LocalDateTime dateTime, Venue venue) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.venue = venue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", venue=" + venue +
                '}';
    }
}
