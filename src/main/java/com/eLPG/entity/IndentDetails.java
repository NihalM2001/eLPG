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

public class IndentDetails 
{
	@Id
	@GeneratedValue
	private int distributerid;
	private String username;
	private int count;
	public int getDistributerid() {
		return distributerid;
	}
	public void setDistributerid(int distributerid) {
		this.distributerid = distributerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}