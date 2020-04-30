package com.capg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StatusValidChange implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "statusid")
	private int statusId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "statusidto")
	private int statusIdTo;
	private String conditionExpression;
	private String transitionName;
	
	public StatusValidChange() {
		super();
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getStatusIdTo() {
		return statusIdTo;
	}

	public void setStatusIdTo(int statusIdTo) {
		this.statusIdTo = statusIdTo;
	}

	public String getConditionExpression() {
		return conditionExpression;
	}

	public void setConditionExpression(String conditionExpression) {
		this.conditionExpression = conditionExpression;
	}

	public String getTransitionName() {
		return transitionName;
	}

	public void setTransitionName(String transitionName) {
		this.transitionName = transitionName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
