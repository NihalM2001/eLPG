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
public class DistributorRequest
{
	@Id
	@GeneratedValue
	private int distRequestId;
	private String distName;
	private int count;
	
	public int getDistRequestId() {
		return distRequestId;
	}
	public void setDistRequestId(int distRequestId) {
		this.distRequestId = distRequestId;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
