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
public class LoginStaffDetails 
{
	@Id
	@GeneratedValue
	private int staffid;
	private String staffname,username,password;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) 
	{
		this.staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) 
	{
		this.staffname = staffname;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	

}
