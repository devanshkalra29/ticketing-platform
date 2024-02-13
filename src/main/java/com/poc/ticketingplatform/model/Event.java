package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    @Column(name = "event_name")
    private String name;
    private String description;

    @Column(name = "event_date")
    private LocalDateTime dateTime;
    @ManyToOne
    @JoinColumn(name="venue_id")
    private Venue venue;

    public Event() {
        //default constructor for JPA
    }
    public Event(String name, String description, LocalDateTime dateTime, Venue venue) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.venue = venue;
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
                "id=" + eventId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateTime=" + dateTime +
                ", venue=" + venue +
                '}';
    }
}
