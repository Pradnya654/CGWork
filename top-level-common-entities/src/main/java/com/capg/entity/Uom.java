package com.capg.entity;

import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Uom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uomId;
	private String uomTypeId;
	private String abbrevitation;
	@ManyToOne
    @JoinColumns({
        @JoinColumn(name="dated_main_uom_conv", referencedColumnName="uomid"),
        @JoinColumn(name="dated_conv_to_uom", referencedColumnName="uomidto")
    })
	private UomConversionDated uomConversionDated;
	
	
	public Uom() {
		super();
	}


	public int getUomId() {
		return uomId;
	}


	public void setUomId(int uomId) {
		this.uomId = uomId;
	}


	public String getUomTypeId() {
		return uomTypeId;
	}


	public void setUomTypeId(String uomTypeId) {
		this.uomTypeId = uomTypeId;
	}


	public String getAbbrevitation() {
		return abbrevitation;
	}


	public void setAbbrevitation(String abbrevitation) {
		this.abbrevitation = abbrevitation;
	}


	public UomConversionDated getUomConversionDated() {
		return uomConversionDated;
	}


	public void setUomConversionDated(UomConversionDated uomConversionDated) {
		this.uomConversionDated = uomConversionDated;
	}
	
	
	
	
	
	

}
