package com.capg.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class CustomTimePeriod {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customTimePeriodId;
	@Column(name = "parent_id")
	private int parentPeriodId;
	private String peroidTypeId;
	private String peroidNum;
	private String peroidName;
	private Date fromDate;
	private Date thruDate;
	private String isClosed;
	private int organizationPartyId;
	
	
	
	
	
	
	public CustomTimePeriod() {
		super();
	}
	public int getCustomTimePeriodId() {
		return customTimePeriodId;
	}
	public void setCustomTimePeriodId(int customTimePeriodId) {
		this.customTimePeriodId = customTimePeriodId;
	}
	public int getParentPeriodId() {
		return parentPeriodId;
	}
	public void setParentPeriodId(int parentPeriodId) {
		this.parentPeriodId = parentPeriodId;
	}
	
	public String getPeroidNum() {
		return peroidNum;
	}
	public void setPeroidNum(String peroidNum) {
		this.peroidNum = peroidNum;
	}
	public String getPeroidName() {
		return peroidName;
	}
	public void setPeroidName(String peroidName) {
		this.peroidName = peroidName;
	}
	public String getPeroidTypeId() {
		return peroidTypeId;
	}
	public void setPeroidTypeId(String peroidTypeId) {
		this.peroidTypeId = peroidTypeId;
	}
	
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getThruDate() {
		return thruDate;
	}
	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}
	
	public String getIsClosed() {
		return isClosed;
	}
	public void setIsClosed(String isClosed) {
		this.isClosed = isClosed;
	}


	public int getOrganizationPartyId() {
		return organizationPartyId;
	}
	public void setOrganizationPartyId(int organizationPartyId) {
		this.organizationPartyId = organizationPartyId;
	}
	

}
