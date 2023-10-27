package com.eLPG.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eLPG.entity.LocationDetails;

public interface LocationDetailsRepository extends JpaRepository<LocationDetails, Integer>
{
	
}
