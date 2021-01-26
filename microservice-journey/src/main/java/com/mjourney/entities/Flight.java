package com.mjourney.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
public class Flight extends Journey {

    @Column
    String flightNumber;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted, String flightNumber) {
        super(idJourney, originLocationCode, destinationLocationCode, operatingCompanyId, startDateAndTime, endDateAndTime, otherDetails, deleted);
        this.flightNumber = flightNumber;
    }

    public Flight() {

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
