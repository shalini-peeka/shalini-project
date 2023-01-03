package com.ewatchproject.service.Impl;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;
import com.ewatchproject.entity.Promoter;
import com.ewatchproject.repo.ChannelRepo;
import com.ewatchproject.repo.PlanRepo;
import com.ewatchproject.repo.PromoterRepo;
import com.ewatchproject.service.IpromoterService;

@Service
public class IpromoterServiceImpl implements IpromoterService {

	@Autowired
	private ChannelRepo channelrepo;
	@Autowired
	private PlanRepo planrepo;
	@Autowired
	private PromoterRepo promoterrepo;
	@Autowired
	private Channel channel;
	@Autowired
	private Plan plan;
	@Autowired
	private Promoter promoter;

	@Override
	public List<Plan> viewPlans(long channelId) {
		channel = channelrepo.findById(channelId).orElse(null);
		if (channel == null) {
		return Collections.emptyList();
		}
		return channel.getPlans();
	}
	
	@Override
	public Channel updateChannel(long channelId) {
		channel = channelrepo.findById(channelId).orElse(null);
		if (channel == null) {
			return null;
		}
		// update the channel fields here
		return channelrepo.save(channel);
	
	}
	
	@Override
	public Channel updateChannelPlan(long channelId, long planId) {
		channel = channelrepo.findById(channelId).orElse(null);
		plan = planrepo.findById(planId).orElse(null);
		if (channel == null || plan == null) {
			return null;
	     }
		
		// update the channel and plan here
		return channelrepo.save(channel);
	}
	@Override
	
	public Channel addChannel(@RequestBody Channel channel) {
		// Channel c = this.Ipromoterservice.addChannel(channel);
		return channelrepo.save(channel);
		// return c;
	}

	@Override
	public List<Channel> viewChannels(long promoterId) {
	
		promoter = promoterrepo.findById(promoterId).orElse(null);
		if (promoter == null) {
			return Collections.emptyList();
		}
		return promoter.getChannels();
	}

	@Override
	public Plan addPlan(Plan plan) {
		
	  return planrepo.save(plan);
	
	 }
}


