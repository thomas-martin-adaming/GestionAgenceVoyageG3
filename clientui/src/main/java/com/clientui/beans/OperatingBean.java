package com.clientui.beans;


public class OperatingBean {

	private Long operatingCompagnyId;
	private String operatingCompagnyName;
    private String operatingCompagnyDetail;
	

	public OperatingBean() {

	}
	public OperatingBean(String operatingCompagnyName, String operatingCompagnyDetail) {
		super();
		this.operatingCompagnyName = operatingCompagnyName;
        this.operatingCompagnyDetail = operatingCompagnyDetail;
	}

	public Long getOperatingCompagnyId() {
		return operatingCompagnyId;
	}

	public void setOperatingCompagnyId(Long operatingCompagnyId) {
		this.operatingCompagnyId = operatingCompagnyId;
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

}
