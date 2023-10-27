package com.eLPG.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/bookCylinders")
	public ConsumerRequest bookCylinders(@RequestBody ConsumerRequest consDetails)
	{
		return cService.bookCylinders(consDetails);
	}
	
	@GetMapping("/viewConsumer")
	public String viewAllConusmer(Model m)
	{
		
		List<ConsumerDetails> consList = cService.viewAllConsumer();
		for (ConsumerDetails cd : consList)
		{
			System.out.println(cd.getDob());
			System.out.println(cd.getDistributorName());
			System.out.println(cd.getEmail());
		}
		m.addAttribute("cons",consList);
		return "consumerDetails";
	}
}
