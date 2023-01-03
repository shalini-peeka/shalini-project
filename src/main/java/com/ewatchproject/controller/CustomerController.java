package com.ewatchproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;
import com.ewatchproject.repo.ChannelRepo;
import com.ewatchproject.service.IcustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private IcustomerService customerservice;
	@GetMapping(value="/channel")
	public List<Channel> viewChannel(){
		return customerservice.viewChannel();
	}
	@GetMapping(value="/plans")
    public List<Plan> viewPlans(){
		return customerservice.viewPlans();	
	}
}
