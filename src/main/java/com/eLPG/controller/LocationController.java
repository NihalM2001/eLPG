package com.eLPG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eLPG.entity.LocationDetails;
import com.eLPG.service.LocationService;

@Controller
public class LocationController
{
	@Autowired
	LocationService locService;
	
	@PostMapping("/locSave")
	public String saveLocation(@ModelAttribute("locDet") LocationDetails locDet)
	{
		locService.saveLocation(locDet);
		return "redirect:/maintainLocation";
	}
	
	@RequestMapping("/deleteLoc/{i}")
	public void deleteLocation(@PathVariable int i)
	{
		locService.deleteLoc(i);
	}
	
	@GetMapping("/maintainLocation")
	public String viewAllLocations(Model m)
	{
		List<LocationDetails> viewLoc = locService.viewAllLocation();
		m.addAttribute("loc",viewLoc);
		return "maintainLocations";
	}
}
