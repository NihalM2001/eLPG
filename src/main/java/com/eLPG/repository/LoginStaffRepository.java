package com.eLPG.repository;

import org.springframework.data.repository.CrudRepository;

import com.eLPG.entity.LoginStaffDetails;



	public interface LoginStaffRepository extends CrudRepository<LoginStaffDetails, Integer> {	
		
		public LoginStaffDetails findByUsernameAndPassword(String username, String password);
	}


