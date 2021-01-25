package com.adaming.entities;

public class LocationType {

	private enum type {

	AIRPORT   ("Airport") ,
	SEAPORT   ("Seaport") ,
	TRAINSTATION  ("Train Station") ;
	
   private final String value;
    private type(final String value) {
        this.value = value;
   }

    public String getType() { 
    	return value; 
    	}
    }	
}
