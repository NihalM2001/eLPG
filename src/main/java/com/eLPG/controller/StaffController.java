package com.eLPG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eLPG.entity.DistributorDetails;
import com.eLPG.entity.LoginStaffDetails;
import com.eLPG.service.WarehouseStaffService;

@Controller
public class StaffController
{
	@Autowired
	WarehouseStaffService staffService;
	
	@RequestMapping("/regDist")
	public DistributorDetails regDistributor(@RequestBody DistributorDetails distDetails)
	{
		return staffService.registerDist(distDetails);
	}
	
	@RequestMapping("/deleteDist/{i}")
	public void deleteDistributor(@PathVariable int i)
	{
		staffService.deleteDist(i);
	}
	
	@RequestMapping("/viewDist")
	public List<DistributorDetails> viewAllDist()
	{
		return staffService.viewAllDist();
	}
	/*
	@RequestMapping("/editDist")
	public DistributorDetails editDistributor(@ModelAttribute("distributor") DistributorDetails d)
	{
		staffService.editDist(d);
		return "redirect:/viewDist";
	}
	*/
	
	@PostMapping("/staffLogin")
	public String staffLogin(LoginStaffDetails lsd)
	{
		System.out.println(lsd.getUsername()+  "\t" + lsd.getPassword());
		
		String flag = staffService.loginStaff(lsd);
		if(flag!=null)
		{
			return "warehouseStaffDashboard";
		}
		
		return "warehouseStaffLogin";
	}
	
	
}


