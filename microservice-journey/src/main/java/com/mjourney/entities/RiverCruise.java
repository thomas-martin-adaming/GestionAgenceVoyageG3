package com.mjourney.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "riverCruise")
@Entity
public class RiverCruise extends Journey {
    @Column
    String nameOfTheBoat;
    @Column
    String PortOfRegistration;

    public RiverCruise(String nameOfTheBoat, String portOfRegistration) {
        this.nameOfTheBoat = nameOfTheBoat;
        PortOfRegistration = portOfRegistration;
    }

    public RiverCruise(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted, String nameOfTheBoat, String portOfRegistration) {
        super(idJourney, originLocationCode, destinationLocationCode, operatingCompanyId, startDateAndTime, endDateAndTime, otherDetails, deleted);
        this.nameOfTheBoat = nameOfTheBoat;
        PortOfRegistration = portOfRegistration;
    }

    public RiverCruise() {

    }

    public String getNameOfTheBoat() {
        return nameOfTheBoat;
    }

    public void setNameOfTheBoat(String nameOfTheBoat) {
        this.nameOfTheBoat = nameOfTheBoat;
    }

    public String getPortOfRegistration() {
        return PortOfRegistration;
    }

    public void setPortOfRegistration(String portOfRegistration) {
        PortOfRegistration = portOfRegistration;
    }
}
