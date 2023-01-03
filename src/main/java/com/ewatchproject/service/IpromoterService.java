package com.ewatchproject.service;

import java.util.List;

import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;

public interface IpromoterService {
	
	public List<Channel> viewChannels(long promoterId);

	public List<Plan> viewPlans(long channelId);

	public Channel addChannel(Channel channel);

	public Channel updateChannel(long channelId);

	public Channel updateChannelPlan(long channelId,long planId);

	public Plan addPlan(Plan plan);


}
