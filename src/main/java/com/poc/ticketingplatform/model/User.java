package com.poc.ticketingplatform.model;

public class User {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

    public User(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
