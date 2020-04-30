package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DataSource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dataSourceId;
	private String dataSourceTypeId;
	private String description;
	public DataSource() {
		super();
	}
	public int getDataSourceId() {
		return dataSourceId;
	}
	public void setDataSourceId(int dataSourceId) {
		this.dataSourceId = dataSourceId;
	}
	public String getDataSourceTypeId() {
		return dataSourceTypeId;
	}
	public void setDataSourceTypeId(String dataSourceTypeId) {
		this.dataSourceTypeId = dataSourceTypeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
