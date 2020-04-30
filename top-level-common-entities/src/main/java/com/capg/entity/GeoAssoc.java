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
public class GeoAssoc implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "geoid")
	private int geoId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "geoidto")
	private int geoIdTo;
	private String geoAssocTypeId;
	public GeoAssoc() {
		super();
	}
	public int getGeoId() {
		return geoId;
	}
	public void setGeoId(int geoId) {
		this.geoId = geoId;
	}
	public int getGeoIdTo() {
		return geoIdTo;
	}
	public void setGeoIdTo(int geoIdTo) {
		this.geoIdTo = geoIdTo;
	}
	public String getGeoAssocTypeId() {
		return geoAssocTypeId;
	}
	public void setGeoAssocTypeId(String geoAssocTypeId) {
		this.geoAssocTypeId = geoAssocTypeId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
