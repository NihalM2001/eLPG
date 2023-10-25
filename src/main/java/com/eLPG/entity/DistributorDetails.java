package com.eLPG.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DistributorDetails
{
	@Id
	@GeneratedValue
	private int distributorId;
	private String companyName, location, City, distUsername, distPassword;
	private double mobile, aadharNo;
	public int getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDistUsername() {
		return distUsername;
	}
	public void setDistUsername(String distUsername) {
		this.distUsername = distUsername;
	}
	public String getDistPassword() {
		return distPassword;
	}
	public void setDistPassword(String distPassword) {
		this.distPassword = distPassword;
	}
	public double getMobile() {
		return mobile;
	}
	public void setMobile(double mobile) {
		this.mobile = mobile;
	}
	public double getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(double aadharNo) {
		this.aadharNo = aadharNo;
	}	
	
	
}


