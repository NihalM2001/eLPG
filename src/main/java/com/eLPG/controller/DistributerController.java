package com.eLPG.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.eLPG.entity.ConsumerRequest;
import com.eLPG.entity.DistributorDetails;
import com.eLPG.entity.IndentDetails;
import com.eLPG.service.DistributorService;
import com.eLPG.service.IndentService;



@Controller
public class DistributerController 
{
	@Autowired
	IndentService indservice;
	
	@Autowired
	DistributorService distService;
	
	
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
	
	@GetMapping("/quote")
	public String quotes()
	{
		return "quote";
	}
	
	@PostMapping("/saveDist")
	public String saveDistributor(@ModelAttribute("saveDist") DistributorDetails saveDist)
	{
		distService.saveDistributor(saveDist);
		return "redirect:/maintainDistributor";
	}
	
	@GetMapping("/maintainDistributor")
	public String viewAllDistributor(Model m)
	{
		List<DistributorDetails> distributors= distService.viewAllDist();
		m.addAttribute("dist",distributors);
		return "maintainDistributor";		
	}
	@GetMapping("/maintainDistributorIndent")
	public String viewAllCust(Model m)
	{
		List<IndentDetails> indlist= indservice.viewAllindent();
		m.addAttribute("ind",indlist);
		return "maintainDistributorIndent";
		
	}
}
