package com.capg.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UomConversionDated implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "uomid")
	private int uomId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "uomidto")
	private int uomIdTo;
	private Date fromDate;
	private Date thruDate;
	private int conversionFactor;
	private int customMethodId;
	private int decimalScale;
	private int roundingMode;
	public int getUomId() {
		return uomId;
	}
	public void setUomId(int uomId) {
		this.uomId = uomId;
	}
	public int getUomIdTo() {
		return uomIdTo;
	}
	public void setUomIdTo(int uomIdTo) {
		this.uomIdTo = uomIdTo;
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
	public int getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(int conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public int getCustomMethodId() {
		return customMethodId;
	}
	public void setCustomMethodId(int customMethodId) {
		this.customMethodId = customMethodId;
	}
	public int getDecimalScale() {
		return decimalScale;
	}
	public void setDecimalScale(int decimalScale) {
		this.decimalScale = decimalScale;
	}
	public int getRoundingMode() {
		return roundingMode;
	}
	public void setRoundingMode(int roundingMode) {
		this.roundingMode = roundingMode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public UomConversionDated() {
		super();
	}
	

}
