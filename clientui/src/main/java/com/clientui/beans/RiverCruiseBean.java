package com.clientui.beans;
import java.time.LocalDateTime;

public class RiverCruiseBean extends JourneyBean {

    String nameOfTheBoat;
    String PortOfRegistration;

    public RiverCruiseBean(String nameOfTheBoat, String portOfRegistration) {
        this.nameOfTheBoat = nameOfTheBoat;
        PortOfRegistration = portOfRegistration;
    }

    public RiverCruiseBean(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted, String nameOfTheBoat, String portOfRegistration) {
        super(idJourney, originLocationCode, destinationLocationCode, operatingCompanyId, startDateAndTime, endDateAndTime, otherDetails, deleted);
        this.nameOfTheBoat = nameOfTheBoat;
        PortOfRegistration = portOfRegistration;
    }

    public RiverCruiseBean() {

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
