package com.admin.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Address")
public class Address {
	
	private String buildingName;
	private String flatNumber;
	private String houseNumber;
	private String addressline1;
	private String addressline2;
	private String addressline3;
	private String town;
	private String postCode;
	private String county;
	private String email;
	private String dob;
	
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getAddressline3() {
		return addressline3;
	}
	public void setAddressline3(String addressline3) {
		this.addressline3 = addressline3;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", flatNumber=" + flatNumber + ", addressline1=" + addressline1
				+ ", addressline2=" + addressline2 + ", addressline3=" + addressline3 + ", town=" + town + ", postCode="
				+ postCode + ", county=" + county + ", email=" + email + ", dob=" + dob + "]";
	}
	

}
