package com.eLPG.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eLPG.entity.LoginStaffDetails;

public interface LoginStaffRepository extends CrudRepository<LoginStaffDetails, Integer>
{	
	@Query(value="select * from login_staff_details where username=?1 and password=?2", nativeQuery=true)
	public String loginStaff(String username, String password);
}


