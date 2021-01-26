package com.clientui.beans;

import java.time.LocalDateTime;


public class TrainRideBean extends JourneyBean {


    public TrainRideBean() {
    }

    public TrainRideBean(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted) {
        super(idJourney, originLocationCode, destinationLocationCode, operatingCompanyId, startDateAndTime, endDateAndTime, otherDetails, deleted);
    }


}
