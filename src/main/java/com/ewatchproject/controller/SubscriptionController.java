package com.ewatchproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;
import com.ewatchproject.exception.InvalidSubscriptionException;
import com.ewatchproject.service.IcustomerService;

@RestController
@RequestMapping("/subscription")
public class SubscriptionController {
	@Autowired
	private IcustomerService customerService;
	@PostMapping("/subscribe")
	public String subscribeChannelPlan(@RequestParam Long channelId,@RequestParam Long planId) throws InvalidSubscriptionException {
		 String message = customerService.subscribeChannelPlan(channelId, planId);
	        return message;
		
	}
	@PostMapping("/unsubscribe")
	public String unsubscribeChannelPlan(@RequestParam Long channelId,@RequestParam Long planId) throws InvalidSubscriptionException {
		 String message = customerService.unsubscribeChannelPlan(channelId, planId);
	        return message;
		
	}
	@GetMapping(value="/subscriptions")
    public List<Channel> viewSubscriptions(String UserName){
		return customerService.viewSubscriptions(UserName);	
	}
	
}
