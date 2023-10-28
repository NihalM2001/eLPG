package com.eLPG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eLPG.entity.ConsumerDetails;
import com.eLPG.entity.ConsumerRequest;
import com.eLPG.service.ConsumerService;

@Controller
public class ConsumerController
{
	@Autowired
	ConsumerService cService;	
	
	@PostMapping("/saveConsumer")
	public String regConsumer(@ModelAttribute("consumer") ConsumerDetails consumer)
	{
		cService.saveConsumer(consumer);
		return "redirect:/consumerLogin";
	}
	
	@GetMapping("/bookCylinders")
	public String bookCylinders(@ModelAttribute("conReq") ConsumerRequest conReq)
	{
		cService.bookCylinders(conReq);
		return "consumerIndex";
	}
	
	@GetMapping("/cylreq")
	public String viewAllCylReq(Model m)
	{
		List<ConsumerRequest> custlist= cService.viewAllCust();
		for (ConsumerRequest cr : custlist)
		{
			System.out.println(cr.getDate());
			System.out.println(cr.getRequestId());
		}
		m.addAttribute("conReq",custlist);
		return "cylinderrequest";
		
	}
	
	@GetMapping("/viewConsumer")
	public String viewAllConusmer(Model m)
	{
		List<ConsumerDetails> consList = cService.viewAllConsumer();
		m.addAttribute("cons",consList);
		return "consumerDetails";
	}
	
	@GetMapping("/custregister")
	public String registerDetails(Model m)
	{
		List<ConsumerDetails> confList = cService.viewAllConsumer();
		m.addAttribute("conf",confList);
		return "customerregistration";
	}
	
	@GetMapping("/deleteCustById/{id}")
	public String deleteCustById(@PathVariable int id)
	{
		cService.deleteConsumer(id);
		return "redirect:/custregister";
	}
	
}
