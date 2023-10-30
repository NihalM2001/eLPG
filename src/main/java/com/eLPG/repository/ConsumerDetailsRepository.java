package com.eLPG.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eLPG.entity.ConsumerDetails;

public interface ConsumerDetailsRepository extends JpaRepository<ConsumerDetails, Integer>
{
	@Query(value = "select * from consumer_details where username=?1 and password=?2", nativeQuery=true)
	public String loginConsumer(String username, String password);
}
