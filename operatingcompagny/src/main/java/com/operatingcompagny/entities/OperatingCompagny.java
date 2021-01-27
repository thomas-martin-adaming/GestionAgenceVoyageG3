package com.operatingcompagny.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class OperatingCompagny implements Serializable{

	@Id @GeneratedValue
	private Long operatingCompagnyId;
	private String operatingCompagnyName;
    private String operatingCompagnyDetail;

    public Long getOperatingCompagnyId() {
		return operatingCompagnyId;
	}
    
    public void setOperatingCompagnyId(Long id) {
		this.operatingCompagnyId = id;
    }

    public String getOperatingCompagnyName() {
		return operatingCompagnyName;
	}
    
    public void setOperatingCompagnyName(String operatingCompagnyName) {
		this.operatingCompagnyName = operatingCompagnyName;
    }

    public String getOperatingCompagnyDetail() {
		return operatingCompagnyDetail;
	}
    
    public void setOperatingCompagnyDetail(String operatingCompagnyDetail) {
		this.operatingCompagnyDetail = operatingCompagnyDetail;
    }
    
    public OperatingCompagny(String operatingCompagnyName, String operatingCompagnyDetail) {
		super();
		this.operatingCompagnyName = operatingCompagnyName;
        this.operatingCompagnyDetail = operatingCompagnyDetail;
	}

	public OperatingCompagny() {
		super();
    }

}