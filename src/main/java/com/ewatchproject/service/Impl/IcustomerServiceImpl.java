package com.ewatchproject.service.Impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewatchproject.entity.AppUser;
import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;
import com.ewatchproject.exception.InvalidSubscriptionException;
import com.ewatchproject.repo.AppUserRepo;
import com.ewatchproject.repo.ChannelRepo;
import com.ewatchproject.repo.PlanRepo;
import com.ewatchproject.service.IcustomerService;


@Service
public class IcustomerServiceImpl implements IcustomerService {
	@Autowired
	private ChannelRepo channelrepo;
	@Autowired
	private PlanRepo planrepo;
	@Autowired
	private AppUserRepo appUserRepo;
//	@Autowired
//	private AppUser appuser;
//	@Autowired
//	private Channel channel;
//	@Autowired
//	private Plan plan;
	public List<Channel> viewChannel() {
		List<Channel> findAll = this.channelrepo.findAll();
		return findAll;
		
	}

	@Override
	public List<Plan> viewPlans() {
		List<Plan> findAll=this.planrepo.findAll();
		return findAll;
	}
	@Override
	public String subscribeChannelPlan(long channelId, long planId) throws InvalidSubscriptionException {
		Channel channel=channelrepo.findById(channelId).orElseThrow();
		  Plan plan=planrepo.findById(planId).orElseThrow();
		 if (channel == null || plan == null) {
		        throw new InvalidSubscriptionException("invalid channelId or PlanId");
		    }
		AppUser appuser=channel.getAppUserEntity();
		if(appuser.getUserChannel().contains(channel)) {
			throw new InvalidSubscriptionException("you have already subscribed to the channel");
		}
		appuser.getUserChannel().add(channel);
		return "subscibed the channel"+channel.getChannelName();	
	}

	@Override
	public String unsubscribeChannelPlan(long channelId, long planId) throws InvalidSubscriptionException {
		 Channel channel=channelrepo.findById(channelId).orElseThrow();
		  Plan plan=planrepo.findById(planId).orElseThrow();
		if (channel == null || plan == null) {
			throw new InvalidSubscriptionException("invalid channelId or PlanId");
		}
	    AppUser appuser=channel.getAppUserEntity();
		if(!appuser.getUserChannel().contains(channel)) {
			throw new InvalidSubscriptionException("you have not subscribed to the channel");
		}
		appuser.getUserChannel().remove(channel);
		
		return "Unsubscribed the channel";
	}

	@Override
	public List<Channel> viewSubscriptions(String UserName) {
		AppUser appuser=appUserRepo.findById(UserName).orElseThrow();
		List<Channel> channelList=appuser.getUserChannel();
		return channelList;
	}
	
	}

	


