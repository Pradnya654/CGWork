package com.capg.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserPreference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userLoginId;
	private String userPrefTypeId;
	private int userPrefGroupId;
	private int userPrefValue;
	private String userPrefDataType;
	
	public UserPreference() {
	super();
	}
	
	public int getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(int userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserPrefTypeId() {
		return userPrefTypeId;
	}
	public void setUserPrefTypeId(String userPrefTypeId) {
		this.userPrefTypeId = userPrefTypeId;
	}
	public int getUserPrefGroupId() {
		return userPrefGroupId;
	}
	public void setUserPrefGroupId(int userPrefGroupId) {
		this.userPrefGroupId = userPrefGroupId;
	}
	public int getUserPrefValue() {
		return userPrefValue;
	}
	public void setUserPrefValue(int userPrefValue) {
		this.userPrefValue = userPrefValue;
	}
	public String getUserPrefDataType() {
		return userPrefDataType;
	}
	public void setUserPrefDataType(String userPrefDataType) {
		this.userPrefDataType = userPrefDataType;
	}
	

}
