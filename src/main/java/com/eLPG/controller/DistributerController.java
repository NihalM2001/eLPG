package com.eLPG.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.eLPG.entity.ConsumerRequest;
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
	@GetMapping("/home")
	public String getHome()
	{
		return "home";
	}
	
	@GetMapping("/mail")
	public String sendmail()
	{
		return "Mailformapproval";
	}
	
	@GetMapping("/mailstatus")
	public String sendmailstatus()
	{
		return "Mailformcommon";
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
