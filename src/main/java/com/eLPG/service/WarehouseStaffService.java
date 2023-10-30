package com.eLPG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eLPG.entity.DistributorDetails;
import com.eLPG.entity.LoginStaffDetails;
import com.eLPG.repository.DistributorDetailsRepository;
import com.eLPG.repository.LoginStaffRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class WarehouseStaffService
{
	@Autowired
	DistributorDetailsRepository distDetRepo;
	
	@Autowired
	LoginStaffRepository logStaffRepo;
		
	public DistributorDetails registerDist(DistributorDetails distributor)
	{
		return distDetRepo.save(distributor);
	}
	
	public void deleteDist(int i)
	{
		distDetRepo.deleteById(i);
	}

	public List<DistributorDetails> viewAllDist()
	{
		return distDetRepo.findAll();
	}
	
	public void editDist(DistributorDetails distributor)
	{
		boolean flag = distDetRepo.findById(distributor.getDistributorId()).isPresent();
		if(flag)
		{
			DistributorDetails d = new DistributorDetails();
			d.setCompanyName(distributor.getCompanyName());
			d.setLocation(distributor.getLocation());
			d.setDistUsername(distributor.getDistUsername());
			d.setMobile(distributor.getMobile());
			d.setAadharNo(distributor.getAadharNo());
			distDetRepo.save(d);
		}
	}
	

	public String loginStaff(LoginStaffDetails lsd)
	{
		System.out.println("helo");
		String flag = logStaffRepo.loginStaff(lsd.getUsername(), lsd.getPassword());
		System.out.println(flag);
		return flag;
	}
}
