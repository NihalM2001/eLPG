package com.eLPG.repository;	

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eLPG.entity.DistributorDetails;

public interface DistributorDetailsRepository extends JpaRepository<DistributorDetails, Integer>
{
	@Query(value="select * from distributor_details where dist_username=?1 and dist_password=?2", nativeQuery = true)
	public String loginDistributor(String distUsername, String distPassword);
}
