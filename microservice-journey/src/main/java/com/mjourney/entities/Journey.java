package com.mjourney.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idJourney;
    @Column
    private String originLocationCode;
    @Column
    private String destinationLocationCode;
    @Column
    private String operatingCompanyId;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime startDateAndTime;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime endDateAndTime;

    @Column
    private String otherDetails;

    @Column(columnDefinition = "boolean default false", updatable = false)
    private boolean deleted = false;

    public Journey() {
    }

    public Journey(Long idJourney, String originLocationCode, String destinationLocationCode, String operatingCompanyId, LocalDateTime startDateAndTime, LocalDateTime endDateAndTime, String otherDetails, boolean deleted) {
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
