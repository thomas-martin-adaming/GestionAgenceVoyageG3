package com.adaming.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LOCATION")
public class Location implements Serializable  {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID_LOCATION")
	private Long id;
	@Column(name = "CODE_LOCATION")
	private String locationCode;
	@Column(name = "NAME_LOCATION")
	private String locationName;
	
	// @Column(name="TYPE_LOCATION") 
	// private LocationType locationType;
	
	private boolean deleted = false;
	
	public Location() {
		super();
	}
	
	public Location(Long id, String locationCode, String locationName, LocationType locationType) {
		super();
		this.id = id;
		this.locationCode = locationCode;
		this.locationName = locationName;
	//	this.locationType = locationType;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
//	public LocationType getLocationType() {
//		return locationType;
//	}
//	public void setLocationType(LocationType locationType) {
//		this.locationType = locationType;
//	}
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", locationCode=" + locationCode + ", locationName=" + locationName
				+ /* ", locationType=" + locationType + */ "]";
	}
}
