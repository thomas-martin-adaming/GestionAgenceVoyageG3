package com.clientui.beans;

public class LocationBean {

	private Long id;
	private String locationCode;
	private String locationName;
	private LocationType locationType;
	private boolean deleted = false;
	
	public LocationBean() {
		super();
	}
	
	public LocationBean(Long id, String locationCode, String locationName, LocationType locationType) {
		super();
		this.id = id;
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.locationType = locationType;
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
	public LocationType getLocationType() {
		return locationType;
	}
	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", locationCode=" + locationCode + ", locationName=" + locationName
				+  ", locationType=" + locationType + "]";
	}
}
