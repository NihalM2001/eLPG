package com.eLPG.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eLPG.entity.IndentDetails;

import com.eLPG.service.IndentService;



@Controller
public class DistributerController 
{
	@Autowired
	IndentService indservice;
	
	@GetMapping("/")
	public String Consumer()
	{
		return "index";
	}
	

	@PostMapping("/saveindent")
	public String saveMethod(@ModelAttribute("ind") IndentDetails log)
	{
		indservice.save(log);
		 return "redirect:/stattrack";
		
	}
	

	
	@GetMapping("/cylreq")
	public String custRequest()
	{
		return "cylinderrequest";
	}
	
	@GetMapping("/custregister")
	public String custRegister()
	{
		return "customerregistration";
	}
	
	@GetMapping("/stattrack")
	public String statusTracking()
	{
		return "statustrack";
	}

	
	@GetMapping("/indent")
	public String indentRequest()
	{
		return "indentform";
		
	}
	
}
