package com.eLPG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eLPG.entity.DistributorDetails;
import com.eLPG.repository.DistributorDetailsRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class DistributorService 
{
	@Autowired
	DistributorDetailsRepository distDetRepo;
	
	public DistributorDetails saveDistributor(DistributorDetails distDet)
	{
		return distDetRepo.save(distDet);
	}
	
	public List<DistributorDetails> viewAllDist()
	{
		return distDetRepo.findAll();
	}
}
