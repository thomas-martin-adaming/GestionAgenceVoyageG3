package com.adaming.entities;

public enum LocationType {
		
	AIRPORT,
	SEAPORT,
	TRAINSTATION;
    
    public String getType() { 
    	switch(this) {
    	case AIRPORT:
    		return "Airport";
    	case SEAPORT:
    		return "Seaport";
    	case TRAINSTATION:
    		return "Train Station";
    	default:
    		return null;
    	}
    	}
    
}	

