package com.eLPG.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eLPG.entity.LocationDetails;

public interface LocationDetailsRepository extends JpaRepository<LocationDetails, Integer>
{
	@Query(value = "select location from location_details", nativeQuery = true)
	public List<String> findLocation();
}
