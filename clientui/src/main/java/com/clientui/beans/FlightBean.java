package com.clientui.beans;

import java.time.LocalDateTime;

public class FlightBean extends JourneyBean {

    String flightNumber;

    public FlightBean(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public FlightBean(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted, String flightNumber) {
        super(idJourney, originLocationCode, destinationLocationCode, operatingCompanyId, startDateAndTime, endDateAndTime, otherDetails, deleted);
        this.flightNumber = flightNumber;
    }

    public FlightBean() {

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
