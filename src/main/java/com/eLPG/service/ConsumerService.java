package com.eLPG.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eLPG.entity.ConsumerDetails;
import com.eLPG.entity.ConsumerRequest;
import com.eLPG.repository.ConsumerDetailsRepository;
import com.eLPG.repository.ConsumerRequestRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ConsumerService
{
	@Autowired
	ConsumerDetailsRepository cDetailRepo;
	
	@Autowired
	ConsumerRequestRepository cReqRepo;
	
	public ConsumerDetails saveConsumer(ConsumerDetails consumer)
	{
		return cDetailRepo.save(consumer);
	}	
	
	
	public void deleteConsumer(int id)
	{
		cDetailRepo.deleteById(id);
	}
	
	public ConsumerRequest bookCylinders(ConsumerRequest conReq)
	{
		return cReqRepo.save(conReq);
	}
	
	public List<ConsumerDetails> viewAllConsumer()
	{
		return cDetailRepo.findAll();
	}
}
