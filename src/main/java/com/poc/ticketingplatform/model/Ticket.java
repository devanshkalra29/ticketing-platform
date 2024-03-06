package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ticketId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id", referencedColumnName = "eventId")
    private Event event;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private double price;
    private String status;

    @Column(name = "seat_number")
    private String seatNumber;

    public Ticket(){

    }

    public Ticket(Event event, User user, double price, String status, String seatNumber) {
        this.event = event;
        this.user = user;
        this.price = price;
        this.status = status;
        this.seatNumber = seatNumber;
    }

    public long getId() {
        return ticketId;
    }

    public void setId(long id) {
        this.ticketId = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", event=" + event +
                ", user=" + user +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
