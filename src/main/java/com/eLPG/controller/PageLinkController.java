package com.eLPG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eLPG.entity.LocationDetails;
import com.eLPG.service.LocationService;

@Controller
public class PageLinkController
{
	
	@Autowired
	LocationService locSer;
	
	@GetMapping("/consumerDashboard")
	public String home()
	{
		return "consumerIndex";
	}
	
	@GetMapping("/consumerReg")
	public String consumerRegistration()
	{
		return "consumerRegistration";
	}
	
	@GetMapping("/startPage")
	public String startPage()
	{
		return "startPage";
	}
	
	@GetMapping("/consumerLogin")
	public String ConsumerLogin()
	{
		return "consumerLogin";
	}
	
	@GetMapping("/distributorLogin")
	public String distributorLogin()
	{
		return "distributorLogin";
	}

	@GetMapping("/staffLogin")
	public String staffLogin()
	{
		return "warehouseStaffLogin";
	}
	
	@GetMapping("/staffDash")
	public String staffDashboard()
	{
		return "warehouseStaffDashboard";
	}

	@GetMapping("/addLocation")
	public String addLocation()
	{
		return "addLocation";
	}

	/*
	@GetMapping("/maintainDistributor")
	public String maintainDistributor()
	{
		return "maintainDistributor";
	}
	*/

	/*@GetMapping("/maintainDistributorIndent")
	public String maintainDistributorIndent()
	{
		return "maintainDistributorIndent";
	}

	/*@GetMapping("/maintainLocation")
	public String maintainLocations()
	{
		return "maintainLocations";
	}*/

	@GetMapping("/addNewDistributor")
	public String addNewDistributor()
	{
		return "addNewDistributor";
	}
	
	/*
	@GetMapping("/viewAllConsumer")
	public String viewAllConsumer()
	{
		return "consumerDetails";
	}
	*/
}
