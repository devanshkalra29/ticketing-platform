package com.poc.ticketingplatform.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false)
    private UUID cityId;
    @Column(name = "city_name")
    String name;
    String state;

    public City() {
        //default constructor for JPA
    }
    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public UUID getCityId() {
        return cityId;
    }

    public void setCityId(UUID cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId == city.cityId && Objects.equals(name, city.name) && Objects.equals(state, city.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, name, state);
    }
}
