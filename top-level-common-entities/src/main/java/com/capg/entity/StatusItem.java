package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class StatusItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int statusId;

	private String statusTypeId;
	private String statusCode;
	private int sequenceId;
	private String description;
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "mainstatuschange", referencedColumnName = "statusid"),
			@JoinColumn(name = "tostatuschange", referencedColumnName = "statusidto") })
	private StatusValidChange statusValidChange;

	public StatusItem() {
		super();
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusTypeId() {
		return statusTypeId;
	}

	public void setStatusTypeId(String statusTypeId) {
		this.statusTypeId = statusTypeId;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public int getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StatusValidChange getStatusValidChange() {
		return statusValidChange;
	}

	public void setStatusValidChange(StatusValidChange statusValidChange) {
		this.statusValidChange = statusValidChange;
	}
	
	

}
