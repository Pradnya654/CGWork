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
public class Geo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int geoId;
	private int geoTypeId;
	private String geoName;
	private String geoCode;
	private String geoSecCode;
	private String abbreviation;
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "maingeo_assoc",referencedColumnName = "geoid"),
		@JoinColumn(name = "assocgeo_assoc",referencedColumnName = "geoidto")
		})
	private GeoAssoc geoAssoc;
	
	public Geo() {
		super();
		
	}

	public int getGeoId() {
		return geoId;
	}

	public void setGeoId(int geoId) {
		this.geoId = geoId;
	}

	public int getGeoTypeId() {
		return geoTypeId;
	}

	public void setGeoTypeId(int geoTypeId) {
		this.geoTypeId = geoTypeId;
	}

	public String getGeoName() {
		return geoName;
	}

	public void setGeoName(String geoName) {
		this.geoName = geoName;
	}

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public String getGeoSecCode() {
		return geoSecCode;
	}

	public void setGeoSecCode(String geoSecCode) {
		this.geoSecCode = geoSecCode;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public GeoAssoc getGeoAssoc() {
		return geoAssoc;
	}

	public void setGeoAssoc(GeoAssoc geoAssoc) {
		this.geoAssoc = geoAssoc;
	}
	

}
