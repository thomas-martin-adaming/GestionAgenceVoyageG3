package com.clientui.beans;
import java.time.LocalDateTime;


public abstract class JourneyBean {

    private Long idJourney;
    private String originLocationCode;
    private String destinationLocationCode;
    private String operatingCompanyId;
    private LocalDateTime startDateAndTime;
    private LocalDateTime endDateAndTime;
    private String otherDetails;
    private boolean deleted = false;

    public JourneyBean() {
    }

    public JourneyBean(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted) {
        this.idJourney = idJourney;
        this.originLocationCode = originLocationCode;
        this.destinationLocationCode = destinationLocationCode;
        this.operatingCompanyId = operatingCompanyId;
        this.startDateAndTime = startDateAndTime;
        this.endDateAndTime = endDateAndTime;
        this.otherDetails = otherDetails;
        this.deleted = deleted;
    }

    public Long getIdJourney() {
        return idJourney;
    }

    public void setIdJourney(Long idJourney) {
        this.idJourney = idJourney;
    }

    public String getOriginLocationCode() {
        return originLocationCode;
    }

    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

    public String getOperatingCompanyId() {
        return operatingCompanyId;
    }

    public void setOperatingCompanyId(String operatingCompanyId) {
        this.operatingCompanyId = operatingCompanyId;
    }

    public LocalDateTime getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(LocalDateTime startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public LocalDateTime getEndDateAndTime() {
        return endDateAndTime;
    }

    public void setEndDateAndTime(LocalDateTime endDateAndTime) {
        this.endDateAndTime = endDateAndTime;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


}
