package com.eLPG.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eLPG.entity.LocationDetails;
import com.eLPG.repository.LocationDetailsRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class LocationService
{
	@Autowired
	LocationDetailsRepository locDetRepo;
	
	public LocationDetails saveLocation(LocationDetails locDet)
	{
		return locDetRepo.save(locDet);
	}
	
	public void deleteLoc(int i)
	{
		locDetRepo.deleteById(i);
	}
}
